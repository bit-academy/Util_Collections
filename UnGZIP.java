import java.io.*;
import java.util.zip.*;

public class UnGZIP
{
    File source, target;
    byte[] buf;

    public UnGZIP(File source, File target)
    {
        this.source=source;
        this.target=target;
        buf=new byte[1024];
    }

    public void ��������() throws IOException
    {
        FileInputStream fis=new FileInputStream(source);
        GZIPInputStream gis=new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream(target);

        for (int i; (i=gis.read(buf))!=-1; )
        {
                fos.write(buf, 0, i);
        }
        fos.close();
        gis.close();
    }

    public static void main(String[] args)
    {
        if (args.length<2)
        {
            System.out.println("���� : java UnGZIP ����Ǯ�����̸� �����������̸�");
            System.exit(1);
        }

        try
        {
            UnGZIP ungzip=new UnGZIP(new File(args[0]), new File(args[1]));
            ungzip.��������();
        } catch(IOException ioe)
        {
            System.out.println("���ܹ߻� : "+ioe.getMessage());
        }
    }
}
