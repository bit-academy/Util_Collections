import java.io.*;
import java.util.zip.*;

public class GZIP
{
    File file;
    byte[] buf;

    public GZIP(File file)
    {
        this.file=file;
        buf=new byte[1024];
    }

    public void ��������() throws IOException
    {
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(file.getAbsolutePath()+".gz");
        GZIPOutputStream gos=new GZIPOutputStream(fos);

        for (int i; (i=fis.read(buf))!=-1; )
        {
            gos.write(buf, 0, i);
        }
        gos.close();
        fis.close();
    }

    public static void main(String[] args)
    {
        if (args.length<1)
        {
            System.out.println("���� : java GZIP �����������̸�");
            System.exit(1);
        }

        try
        {
            GZIP gzip=new GZIP(new File(args[0]));
            gzip.��������();
        } catch(IOException ioe)
        {
            System.out.println("���ܹ߻� : "+ioe.getMessage());
        }
    }
}
