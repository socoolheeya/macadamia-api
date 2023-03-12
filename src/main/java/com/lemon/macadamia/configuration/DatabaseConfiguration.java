package com.lemon.macadamia.configuration;

import io.r2dbc.spi.ConnectionFactory;
import org.mariadb.r2dbc.MariadbConnectionConfiguration;
import org.mariadb.r2dbc.MariadbConnectionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import org.springframework.r2dbc.core.DatabaseClient;

@Configuration
@EnableR2dbcRepositories
public class DatabaseConfiguration extends AbstractR2dbcConfiguration {


    @Bean
    @Override
    public ConnectionFactory connectionFactory() {

        return new MariadbConnectionFactory(
                MariadbConnectionConfiguration.builder()
                        .host("localhost")
                        .port(3306)
                        .username("macadamia-api")
                        .password("1234")
                        .database("macadamia").build()
        );
    }
    @Bean
    public DatabaseClient r2dbcDatabaseClient() {
        return DatabaseClient.builder()
                .connectionFactory(this.connectionFactory())
                .namedParameters(true)
                .build();
    }

//    @Bean
//    public DatabaseClient r2dbcDatabaseClient(ConnectionFactory connectionFactory) {
//        return DatabaseClient.builder().connectionFactory(connectionFactory).build();
//    }

//    @Bean
//    public ConnectionFactoryInitializer initializer() {
//        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
//        ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
//        resourceDatabasePopulator.addScript(new ClassPathResource("createSchema.sql"));
//        initializer.setConnectionFactory(connectionFactory());
//        initializer.setDatabasePopulator(resourceDatabasePopulator);
//
//        return initializer;
//    }
}
