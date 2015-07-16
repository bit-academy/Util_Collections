import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XmlDomTest
{
    static final String[] typeName = {
        "none",
        "Element",
        "Attr",
        "Text",
        "CDATA",
        "EntityRef",
        "Entity",
        "ProcInstr",
        "Comment",
        "Document",
        "DocType",
        "DocFragment",
        "Notation",
    };
    Document doc;

    public XmlDomTest() throws Exception
    {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=factory.newDocumentBuilder();
        System.out.println(builder);
        doc=builder.parse("MyDVDTable.xml");
//        doc=builder.parse("beans.xml");
    }

    void printRow() throws Exception
    {
        Element rootElement=doc.getDocumentElement();
        System.out.println("Root Element �̸� : "+rootElement.getTagName());
//        System.out.println("Root Element �̸� : "+rootElement.getNodeName());
        NodeList list=rootElement.getElementsByTagName("row");
        for (int i=0, len1=list.getLength(); i<len1; i++)
        {
            Element element=(Element)list.item(i);
            System.out.println("\n############################## : "+i);
            System.out.println("������ �ϴ� Element �̸� : "+element.getTagName());

            NodeList subList=element.getElementsByTagName("col");
            for (int j=0, len2=subList.getLength(); j<len2; j++)
            {
                Element subElement=(Element)subList.item(j);
                System.out.println("\n   Sub Element �̸� : "
                    +subElement.getTagName());

                NodeList childNodes=subElement.getChildNodes();
                printChildNodes(childNodes);
            }
        }
    }

    void printChildNodes(NodeList childNodes)
    {
        for (int k=0, len3=childNodes.getLength(); k<len3; k++)
        {
            System.out.println("      Node ���� : "+k);
            Node childNode=childNodes.item(k);
            int nodeType=childNode.getNodeType();
            System.out.println("      Node Ÿ�� : "+typeName[nodeType]);
            if (nodeType==3)
            {
                System.out.println("      Node �� : "+childNode.getNodeValue().trim());
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
//        System.setProperty("javax.xml.parsers.DocumentBuilderFactory"
//            , "org.apache.xerces.jaxp.DocumentBuilderFactoryImpl");
        XmlDomTest domTest=new XmlDomTest();
        domTest.printRow();
    }
}