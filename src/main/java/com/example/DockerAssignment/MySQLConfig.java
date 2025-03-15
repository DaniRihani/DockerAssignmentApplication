package com.example.DockerAssignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;

@Configuration
public class MySQLConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://mysql-db:3306/mydatabase?useSSL=false&allowPublicKeyRetrieval=true")
                .username("root")
                .password("rootpassword")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }
}
