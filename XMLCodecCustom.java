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

    public void personName����(String personName)
    {
        this.personName=personName;
    }

    public String personName��()
    {
        return personName;
    }

    public void phoneNumber����(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public String phoneNumber��()
    {
        return phoneNumber;
    }

    public void stature����(double stature)
    {
        this.stature=stature;
    }

    public double stature��()
    {
        return stature;
    }

    void print()
    {
        System.out.println("�̸� : "+personName);
        System.out.println("��ȭ��ȣ : "+phoneNumber);
        System.out.println("���� : "+stature);
    }

    public static void main(String[] args) throws IOException
    {
        XMLCodecCustom xmlCodec=new XMLCodecCustom();
        xmlCodec.personName����("��ũ");
        xmlCodec.phoneNumber����("0101-0523-0523");
        System.out.println(" --- ��ü�� ����");
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
        System.out.println("\n --- XMLDecoder �� ����� ��ü�� ����");
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

            if (!custom1.personName��().equals(custom2.personName��()))
            {
                out.writeStatement(new Statement(custom1, "personName����"
                    , new Object[]{ custom1.personName��() }));
            }

            if (!custom1.phoneNumber��().equals(custom2.phoneNumber��()))
            {
                out.writeStatement(new Statement(custom1, "phoneNumber����"
                    , new Object[]{ custom1.phoneNumber��() }));
            }

            if (custom1.stature��()!=custom2.stature��())
            {
                out.writeStatement(new Statement(custom1, "stature����"
                    , new Object[]{ new Double(custom1.stature��()) }));
            }
        }

        protected boolean mutatesTo(Object oldInstance, Object newInstance)
        {
            if (newInstance==null)
            {
                System.out.println(" newInstance �� null ��.");
                return false;
            }

            boolean res=oldInstance.getClass()==newInstance.getClass();
            System.out.println(res+" => : "+oldInstance+", "+newInstance);
            return res;
        }
    }
}