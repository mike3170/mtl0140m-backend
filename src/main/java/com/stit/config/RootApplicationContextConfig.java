package com.stit.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

// java annotation
@Configuration
//@ComponentScan("com.stit")
public class RootApplicationContextConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("oracle.jdbc.OracleDriver");

        // hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.50:1526:chudb"); 
        hikariConfig.setJdbcUrl("jdbc:oracle:thin:@192.168.1.50:1526:bydb");//--全雄
        hikariConfig.setUsername("byerp");
        hikariConfig.setPassword("byerp");

        hikariConfig.setMinimumIdle(2);
        hikariConfig.setMaximumPoolSize(20);
        hikariConfig.setConnectionTestQuery("SELECT 1 from dual");
        hikariConfig.setPoolName("springHikariCP");

        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource());
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

}
