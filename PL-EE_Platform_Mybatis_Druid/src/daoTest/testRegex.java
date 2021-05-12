package daoTest;


import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class testRegex {
    //查询全部
    @Test
    public void getTTT() {

/*       String IB1_filename = "IB1_0052_TSG_BFS_MQB37W_MEB_V3_1.xml";
        boolean matches = IB1_filename.matches("V\\d_\\d\\d?");
        System.out.println(matches);*/

        Pattern p = Pattern.compile("V\\d_\\d\\d?");
        String IB1_filename = "IB1_0052_TSG_BFS_MQB37W_MEB_V3_1.xml";
        Matcher m = p.matcher(IB1_filename);
        while(m.find()){
            String group = m.group();
            System.out.println(group);
        }


}
}