package utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import java.util.Properties;

// hikariCP绑定mybatis并初始化,UnpooledDataSourceFactory类就是Mybatis提供的用于第三方连接池覆盖DataSource的入口
public class HikariDataSourceFactory extends UnpooledDataSourceFactory {
    private Properties props;
    public HikariDataSourceFactory(){

        HikariConfig config = new HikariConfig("hikaricp.properties");
        config.setMaximumPoolSize(5);
        config.setDriverClassName(this.props.getProperty("driver"));
        config.setJdbcUrl("url");
        config.setUsername("username");
        config.setPassword("password");
        try {
            config.getConnectionInitSql();
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.dataSource = new HikariDataSource(config);
    }

    @Override
    public void setProperties(Properties props) {
        this.props = props;
    }
}
