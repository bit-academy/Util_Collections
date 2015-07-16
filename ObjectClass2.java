public class ObjectClass2 implements Cloneable
{
    String myName;

    public ObjectClass2(String myName)
    {
        this.myName=myName;
    }

    public String toString()
    {
        return myName;
    }

    public static void main(String[] args)
    {
        try
        {
            ObjectClass2 object1=new ObjectClass2("ù��°");
            ObjectClass2 object2=(ObjectClass2)object1.clone();

            object2.myName="�ι�°";

            System.out.println(object1==object2);
            System.out.println(object1);
            System.out.println(object2);
        } catch(CloneNotSupportedException cnse)
        {
            System.out.println("ObjectClass2 �� ������ �� ����.");
        }
    }
}
