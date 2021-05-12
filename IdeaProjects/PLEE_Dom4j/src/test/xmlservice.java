/*
package test;

import domain.myselfLei;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

//仅仅是测试
public class XmlService {
    public List<myselfLei> getmyself(String path)
    {
        //解析
        SAXReader reader = new SAXReader();
        ArrayList<myselfLei> listnode = new ArrayList<myselfLei>();
        try {
            Document doc = reader.read(path);
            Element  root = doc.getRootElement();//获取根节点
            System.out.println(root.getName());//打印根节点root
            List<Element> list = root.elements();//所有root下第一子节点存进一个集合中
            //遍历节点
            for (Element e : list) {
                Myself n = new Myself();//放在循环里面，循环完一个后接着下一个
                System.out.println(e.getName());//获取根结点下第一根子节点
                n.setName(e.elementText("name"));
                n.setAge(e.elementText("age"));
                n.setCardid(e.elementText("cardid"));
                listnode.add(n);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return listnode;
    }
}


*/
