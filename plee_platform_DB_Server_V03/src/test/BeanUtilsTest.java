package test;

import domain.UserLei;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {
    public static void main(String[] args) {

        UserLei userLei = new UserLei();
        try {
            /*BeanUtils.setProperty(userLei,"username","zhangsan");
            System.out.println(userLei);*/
            //说明操作的是属性
            BeanUtils.setProperty(userLei,"hehe","female");
            System.out.println(userLei);

            String gender = BeanUtils.getProperty(userLei, "hehe");
            System.out.println(gender);


            //String gender = BeanUtils.getProperty(userLei, "gender");
            //System.out.println(gender);

            /*String testGender = BeanUtils.getProperty(userLei, "testGender");
            System.out.println("2"+testGender);
*/
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }




    }
}
