package Test;

import pojo.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

    public static void main(String[] args) {
        Regex regex = new Regex();
        String IB1_filename = "XXXV1_6";
        regex.setIB1_filename(IB1_filename);
        String IB1_VERSION_real = null;
        //避免空指针异常，先判断是否为空
        if(IB1_filename != null && IB1_filename != ""){
            Pattern p = Pattern.compile("(?<=V)\\d\\d?\\d?_\\d\\d?\\d?");
            Matcher matcher = p.matcher(IB1_filename);
            while(matcher.find()){
                String IB1_VERSION_after = matcher.group();
                regex.setIB1_VERSION_real(IB1_VERSION_after);
            }
        }
        //最终得到IB1_Version
        IB1_VERSION_real = regex.getIB1_VERSION_real();
        System.out.println(IB1_VERSION_real);
    }
}
