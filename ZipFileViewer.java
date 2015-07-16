import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.text.*;

public class ZipFileViewer
{
        public static void main(String[] args)
        {
                if (args.length<1)
                {
			System.out.println("사용법 : java ZipFileViewer  압축파일이름");
			System.exit(1);
		}

		try
		{
			ZipFile zip=new ZipFile(args[0]);
			SimpleDateFormat sdf=new SimpleDateFormat();
			Enumeration enum=zip.entries();
			System.out.println("파일리스트 ---");

			while(enum.hasMoreElements())
			{
				ZipEntry entry=(ZipEntry)enum.nextElement();
				System.out.print(entry.getCompressedSize());
				System.out.print("\t");
				System.out.print(entry.getSize());								System.out.print("\t");
				System.out.print(entry.getName());
				System.out.print("\t");

				if (entry.getName().length()<16)
				{
					System.out.print("\t");
				}

				System.out.println(sdf.format(new Date(entry.getTime())));
			}
		} catch(IOException ioe)
		{
			System.out.println(args[0]+" 파일을 읽는데 문제가 있음");
			System.exit(1);
		}
	}
}
