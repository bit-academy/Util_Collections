import java.io.*;
import java.util.*;
import java.beans.*;

public class XMLCodecTest
{
    private String personName;
    private String phoneNumber;
    private double stature;

    public XMLCodecTest()
    {
        stature=178.5;
    }

    public void setPersonName(String personName)
    {
        this.personName=personName;
    }

    public String getPersonName()
    {
        return personName;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setStature(double stature)
    {
        this.stature=stature;
    }

    public double getStature()
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
        XMLCodecTest xmlCodec=new XMLCodecTest();
        xmlCodec.setPersonName("듀크");
        xmlCodec.setPhoneNumber("0101-0523-0523");
        System.out.println(" --- 객체의 내용");
        xmlCodec.print();

        BufferedOutputStream bos=new BufferedOutputStream(
            new FileOutputStream("beans.xml"));
        XMLEncoder encoder=new XMLEncoder(bos);
        encoder.writeObject(xmlCodec);
        encoder.close();

        BufferedInputStream bis=new BufferedInputStream(
            new FileInputStream("beans.xml"));
        XMLDecoder decoder=new XMLDecoder(bis);
        XMLCodecTest newXmlCodec=(XMLCodecTest)decoder.readObject();
        System.out.println("\n --- XMLDecoder 로 살려낸 객체의 내용");
        newXmlCodec.print();
    }
}