##常用依赖
```xml
<!--Spring webmvc-->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.3.7</version>
    </dependency>

    <!--Spring JDBC-->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.3.1</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
```
##注解说明
@Autowired 直接在属性上使用，也可以在set方法上使用。

如果@Autowired自动装配环境比较复杂，无法通过一个注解【@Autowired】完成的时候，我们可以通过使用@Qualifier（value = “xxx”）配合使用。

@Resource和@Autowired区别：

- 都是自动装配，都可放在属性字段上

- @Autowired通过bytype实现

- @Resource默认通过byname实现，如果找不到，就用bytype实现。如果两个都找不到，就报错。更高级智能一些。

- 执行顺序不同