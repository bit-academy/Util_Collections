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

    public void 압축해제() throws IOException
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
            System.out.println("사용법 : java UnGZIP 압축풀파일이름 저장할파일이름");
            System.exit(1);
        }

        try
        {
            UnGZIP ungzip=new UnGZIP(new File(args[0]), new File(args[1]));
            ungzip.압축해제();
        } catch(IOException ioe)
        {
            System.out.println("예외발생 : "+ioe.getMessage());
        }
    }
}
