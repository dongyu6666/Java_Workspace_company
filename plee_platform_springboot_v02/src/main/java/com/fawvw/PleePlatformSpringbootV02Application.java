package com.fawvw;

import org.apache.catalina.connector.Connector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.fawvw.dao")
@EnableTransactionManagement

public class PleePlatformSpringbootV02Application {

    @Configuration
    public class TomcatConfig {
        @Bean
        public TomcatServletWebServerFactory webServerFactory() {
            TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
            factory.addConnectorCustomizers((Connector connector) -> {
                connector.setProperty("relaxedPathChars", "\"<>[\\]^`{|}");
                connector.setProperty("relaxedQueryChars", "\"<>[\\]^`{|}");
            });
            return factory;
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(PleePlatformSpringbootV02Application.class, args);
    }

}
