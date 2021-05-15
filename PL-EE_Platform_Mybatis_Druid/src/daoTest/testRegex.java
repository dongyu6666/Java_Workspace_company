package daoTest;


import org.junit.Test;

import pojo.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class testRegex {
    //查询全部
    @Test
    public void getTTT() {
        String IB1_filename = "IB1_V1_7.xml";
        Regex regex = new Regex();
        regex.setIB1_filename(IB1_filename);
        System.out.println(regex.getIB1_filename());
        String IB1_VERSION_real = null;
        if(IB1_filename != null && IB1_filename != ""){

            Pattern p = Pattern.compile("(?<=V)\\d\\d?\\d?_\\d\\d?\\d?");

            Matcher matcher = p.matcher(IB1_filename);

            while(matcher.find()){
                String IB1_VERSION  = matcher.group();
                regex.setIB1_VERSION_real(IB1_VERSION);
            }
        }
        IB1_VERSION_real = regex.getIB1_VERSION_real();
        System.out.println(IB1_VERSION_real);
        }

}