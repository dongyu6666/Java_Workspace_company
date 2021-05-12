package test;

import JDBCUtils_HikariCP.JDBCUtils;
import domain.myselfLei;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.springframework.jdbc.core.JdbcTemplate;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class maintest {

    public static void main(String[] args) throws ParserConfigurationException {
        //ArrayList<myselfLei> list = new ArrayList<myselfLei>();
        //获取DOM解析器
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;

        documentBuilder = factory.newDocumentBuilder();


        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());



        try {
            //Document doc = documentBuilder.parse(new File("D:\\Java_Workspace\\IdeaProjects\\PLEE_Dom4j\\src\\test\\books.xml"));

            File fff = new File("D:\\Java_Workspace\\IdeaProjects\\PLEE_Dom4j\\src\\test\\IB1_0019_ICAS1_Host_V3_25.xml");
            SAXReader reader = new SAXReader();


            //得到一个element根元素,获得根节点root
            Document doc = reader.read(fff);
            Element root1 = doc.getRootElement();

            //List<Element> list1 = root1.elements("NAME");
            //List<Element> list1 = root1.elements("RELEASE-DATE");
            //List<Element> list1 = root1.elements("IBN-REQUIRED");
            List<Element> list1 = root1.elements("IB-DESCRIPTION");

            for(Element element1 : list1){
                System.out.println("1元素名字："+element1.getName());
                System.out.println("1元素文本："+element1.getText());

                List<Element> list2 = element1.elements();

                for(Element element2 : list2){
                    System.out.println("2元素名字："+ element2.getName());
                    System.out.println("2元素文本："+ element2.getText());
                    List<Element> list3 = element2.elements();

                    for (Element element3 : list3){
                        System.out.println("3元素名字："+element3.getName());
                        System.out.println("3元素文本："+element3.getText());
                        List<Element> list4 = element3.elements();

                        for(Element element4 : list4){
                            System.out.println("4元素名字："+element4.getName());
                            System.out.println("4元素文本："+element4.getText());

                            List<Element> list5 = element4.elements();

                            for(Element element5 : list5){
                                System.out.println("5元素名字："+element4.getName());
                                System.out.println("5元素文本："+element4.getText());
                            }


                        }

                    }


                }

            }






            //子节点personNodes
            /*NodeList personNodes = root.getElementsByTagName("myselfLei");
            int length1 = personNodes.getLength();


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
        } catch (DocumentException e) {
            e.printStackTrace();
        }*/

    } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
