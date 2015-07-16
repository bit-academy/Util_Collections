import java.io.*;
import java.util.zip.*;

public class UnZip
{
    File archive;
    byte[] buf;

    public UnZip(File archive)
    {
        this.archive=archive;
        buf=new byte[1024];
    }

    public void 압축해제() throws IOException
    {
        FileInputStream fis=new FileInputStream(archive);
        ZipInputStream zis=new ZipInputStream(fis);

        for (ZipEntry entry; (entry=zis.getNextEntry())!=null; )
        {
            File file=new File(entry.getName());
            System.out.println(file);
            if (entry.isDirectory())
            {
                boolean result=file.mkdirs();
                if (!result)
                {
                    throw new IOException(file+" 디렉토리 생성실패");
                }
                continue;
            }

            if (!file.getParentFile().exists())
            {
                file.getParentFile().mkdirs();
            }

            FileOutputStream fos=new FileOutputStream(file);
            for (int i; (i=zis.read(buf))!=-1; )
            {
                fos.write(buf, 0, i);
            }
            fos.close();
            zis.closeEntry();
        }

        zis.close();
    }

    public static void main(String[] args)
    {
        if (args.length<1)
        {
            System.out.println("사용법 : java UnZip 압축해제할파일이름");
            System.exit(1);
        }

        try
        {
            UnZip unzip=new UnZip(new File(args[0]));
            unzip.압축해제();
        } catch(IOException ioe)
        {
            System.out.println("예외발생 : "+ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
