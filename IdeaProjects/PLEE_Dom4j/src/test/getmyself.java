package test;

import domain.myselfLei;
import org.dom4j.Node;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class getmyself {

    private static ArrayList<myselfLei> getMyselfLei() throws ParserConfigurationException {

        ArrayList<myselfLei> list = new ArrayList<myselfLei>();
        //获取DOM解析器
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;

        documentBuilder = factory.newDocumentBuilder();

        try {
            Document doc = documentBuilder.parse(new File("myself.xml"));
            //得到一个element根元素,获得根节点root
            Element root = doc.getDocumentElement();
            System.out.println("根元素：" + root.getNodeName());
            //子节点personNodes
            NodeList personNodes = root.getElementsByTagName("myselfLei");

            for (int i = 0; i < personNodes.getLength(); i++) {
                Element personElement = (Element) personNodes.item(i);
                myselfLei myselfLei = new myselfLei();
                NodeList childNodes = personElement.getChildNodes();


                for (int j = 0; j < childNodes.getLength(); j++) {
                    if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        //“nodelist.item(j).getFirstChild().getNodeValue()”获取的内容是子节点（text类型节点）的text内容
                        if ("name".equals(childNodes.item(j).getNodeName())) {
                            myselfLei.setName(childNodes.item(j).getFirstChild().getNodeValue());
                            System.out.println(myselfLei.getName());
                        } else if ("age".equals(childNodes.item(j).getNodeName())) {
                            myselfLei.setAge(childNodes.item(j).getFirstChild().getNodeValue());
                            System.out.println(myselfLei.getAge());

                        } else if ("cardid".equals(childNodes.item(j).getNodeName())) {
                            myselfLei.setCardid(childNodes.item(j).getFirstChild().getNodeValue());
                            System.out.println(myselfLei.getCardid());

                        }
                    }
                }
                for(myselfLei myselfLei1 : list){  //为了查看数据是否正确，进行打印结果
                    System.out.println(myselfLei1.toString());
                }

            }
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;


    }
}
