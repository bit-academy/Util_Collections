import java.io.*;
import java.util.*;
import java.beans.*;

public class XMLCodecCustom
{
    private String personName;
    private String phoneNumber;
    private double stature;

    public XMLCodecCustom()
    {
        stature=178.5;
    }

    public void personName설정(String personName)
    {
        this.personName=personName;
    }

    public String personName은()
    {
        return personName;
    }

    public void phoneNumber설정(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public String phoneNumber는()
    {
        return phoneNumber;
    }

    public void stature설정(double stature)
    {
        this.stature=stature;
    }

    public double stature는()
    {
        return stature;
    }

    void print()
    {
        System.out.println("이름 : "+personName);
        System.out.println("전화번호 : "+phoneNumber);
        System.out.println("신장 : "+stature);
    }

    public static void main(String[] args) throws IOException
    {
        XMLCodecCustom xmlCodec=new XMLCodecCustom();
        xmlCodec.personName설정("듀크");
        xmlCodec.phoneNumber설정("0101-0523-0523");
        System.out.println(" --- 객체의 내용");
        xmlCodec.print();

        BufferedOutputStream bos=new BufferedOutputStream(
            new FileOutputStream("beans2.xml"));
        XMLEncoder encoder=new XMLEncoder(bos);
        encoder.setPersistenceDelegate(XMLCodecCustom.class
            , new MyClassPersistenceDelegate());
        encoder.writeObject(xmlCodec);
        encoder.close();

        BufferedInputStream bis=new BufferedInputStream(
            new FileInputStream("beans2.xml"));
        XMLDecoder decoder=new XMLDecoder(bis);
        XMLCodecCustom newXmlCodec=(XMLCodecCustom)decoder.readObject();
        System.out.println("\n --- XMLDecoder 로 살려낸 객체의 내용");
        newXmlCodec.print();
    }

    static class MyClassPersistenceDelegate extends PersistenceDelegate
    {
        protected Expression instantiate(Object obj, Encoder encoder)
        {
            System.out.println(" instantiate : "+obj);
            return new Expression(obj, XMLCodecCustom.class, "new", null);
        }

        protected void initialize(Class type, Object oldInstance
            , Object newInstance, Encoder out)
        {
            XMLCodecCustom custom1=(XMLCodecCustom)oldInstance;
            XMLCodecCustom custom2=(XMLCodecCustom)newInstance;

            System.out.println(" init : "+custom1+", "+custom2);

            if (!custom1.personName은().equals(custom2.personName은()))
            {
                out.writeStatement(new Statement(custom1, "personName설정"
                    , new Object[]{ custom1.personName은() }));
            }

            if (!custom1.phoneNumber는().equals(custom2.phoneNumber는()))
            {
                out.writeStatement(new Statement(custom1, "phoneNumber설정"
                    , new Object[]{ custom1.phoneNumber는() }));
            }

            if (custom1.stature는()!=custom2.stature는())
            {
                out.writeStatement(new Statement(custom1, "stature설정"
                    , new Object[]{ new Double(custom1.stature는()) }));
            }
        }

        protected boolean mutatesTo(Object oldInstance, Object newInstance)
        {
            if (newInstance==null)
            {
                System.out.println(" newInstance 가 null 임.");
                return false;
            }

            boolean res=oldInstance.getClass()==newInstance.getClass();
            System.out.println(res+" => : "+oldInstance+", "+newInstance);
            return res;
        }
    }
}