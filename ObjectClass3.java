public class ObjectClass3
{
    String myName;

    public ObjectClass3(String myName)
    {
        this.myName=myName;
    }

    public String toString()
    {
        return myName;
    }

    public Object clone()
    {
        ObjectClass3 obj=new ObjectClass3(null);
        return obj;
    }

    public static void main(String[] args)
    {
        ObjectClass3 object1=new ObjectClass3("첫번째");
        ObjectClass3 object2=(ObjectClass3)object1.clone();

        object2.myName="두번째";

        System.out.println(object1==object2);
        System.out.println(object1);
        System.out.println(object2);
    }
}
