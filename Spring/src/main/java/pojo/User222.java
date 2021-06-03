package pojo;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

//等价于 <bean id="user" class="pojo.User222"/>
//Component就是组件
@Component
@Scope("prototype")
public class User222 {

    //public String name = "利用Component组件方式开发";
    @Value("利用Component组件方式开发222")
    public String name;

}
