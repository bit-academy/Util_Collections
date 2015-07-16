import java.io.*;
import java.util.zip.*;

public class Zip
{
    File dir;
    byte[] buf;

    public Zip(File dir) throws IllegalArgumentException
    {
        if (!dir.isDirectory())
        {
            throw new IllegalArgumentException(dir+" 디렉토리가  아님");
        }

        this.dir=dir;
        buf=new byte[1024];
    }

    public void 압축저장(String zipName) throws IOException
    {
        File[] files=dir.listFiles();

        if (files.length<1)
        {
            return;
        }

        FileOutputStream fos=new FileOutputStream(zipName);
        ZipOutputStream zos=new ZipOutputStream(fos);

        for (int i=0; i<files.length; i++)
        {
            if (files[i].isDirectory())
            {
                continue;
            }

            FileInputStream fis=new FileInputStream(files[i]);
            System.out.println(files[i]);
            ZipEntry entry=new ZipEntry(files[i].toString());
            zos.putNextEntry(entry);

            for (int j; (j=fis.read(buf))!=-1; )
            {
                zos.write(buf, 0, j);
            }

            zos.closeEntry();
            fis.close();
        }
        zos.close();
    }

    public static void main(String[] args)
    {
        if (args.length<2)
        {
            System.out.println("사용법 : java Zip 압축할디렉토리 압축파일이름");
            System.exit(1);
        }

        try
        {
            Zip zip=new Zip(new File(args[0]));
            zip.압축저장(args[1]);
        } catch(IOException ioe)
        {
            System.out.println("예외발생 : "+ioe.getMessage());
        } catch(IllegalArgumentException iae)
        {
            System.out.println(iae.getMessage());
        }
    }
}
