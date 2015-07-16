import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class XmlSaxTest
{
    public XmlSaxTest() throws Exception
    {
        SAXParserFactory factory=SAXParserFactory.newInstance();
        SAXParser sax=factory.newSAXParser();
        FileInputStream fis=new FileInputStream("MyDVDTable.xml");
        DefaultHandler handler=new MyHandler();
        sax.parse(fis, handler);
    }

    class MyHandler extends DefaultHandler
    {
        public void setDocumentLocator(Locator locator)
        {
            System.out.println("Locator.getPublicId() : "+locator.getPublicId());
            System.out.println("Locator.getSsytemId() : "+locator.getSystemId());
        }

        public void startDocument()
        {
            System.out.println("XML 문서 파싱이 시작되었습니다.");
        }

        public void endDocument()
        {
            System.out.println("XML 문서 파싱이 끝났습니다.");
        }

        public void startPrefixMapping(String prefix, String uri)
        {
            System.out.println("Namespace 정의시작 : "+prefix+", "+uri);
        }

        public void endPrefixMapping(String prefix)
        {
            System.out.println("Namespace 정의끝 : "+prefix);
        }

        public void startElement(String namespaceURI, String localName, String qName, Attributes atts)
        {
            System.out.println("<"+qName+">");// - "+atts.getQName(0)+":"+atts.getValue(0));
        }

        public void endElement(String namespaceURI, String localName, String qName)
        {
            System.out.println("</"+qName+">");
        }

        public void characters(char[] ch, int start, int length)
        {
            System.out.println("컨텐트 : \""+new String(ch, start, length).trim()+"\"");
        }

        public void ignorableWhitespace(char[] ch, int start, int length)
        {
            String space=new String(ch, start, length).trim();
            if (space.length()>0)
            {
                System.out.println("공백 문자 : "+space);
            }
        }

        public void processingInstruction(String target, String data)
        {
            System.out.println("ProcessingInstruction : "+target+", "+data);
        }

        public void skippedEntity(String name)
        {
            System.out.println("skipped : "+name);
        }

        public void notationDecl(String name, String publicId, String systemId)
        {
            System.out.println("notationDecl : "+name+", "+publicId+", "+systemId);
        }

        public void unparsedEntityDecl(String name, String publicId, String systemId, String  notationName)
        {
            System.out.println("unparsedEntityDecl : "+name+", "+publicId+", "+systemId+", "+notationName);
        }

    }

    public static void main(String[] args) throws Exception
    {
//        System.setProperty("javax.xml.parsers.SAXParserFactory"
//            , "org.apache.xerces.jaxp.SAXParserFactoryImpl");
        XmlSaxTest saxTest=new XmlSaxTest();
    }
}