package net.rigatti.admin;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("net.rigatti.admin")
public class AppConfig {


//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws ClassNotFoundException, PropertyVetoException {
//        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//        emf.setDataSource(localDataSource());
//        emf.setPackagesToScan("net.rigatti.admin");
//        emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        emf.setJpaProperties(new Properties(){});
//        return emf;
//    }
//
//    @Bean
//    @Profile("local")
//    public javax.sql.DataSource localDataSource() throws ClassNotFoundException {
//        System.out.println("************ class loader ***********");
//        ClassLoader.getSystemClassLoader().loadClass("org.hibernate.HibernateException");
//        return DataSourceBuilder
//                .create()
//                .username("root")
//                .password("motdepasse")
//                .url("jdbc:mysql://localhost:3306/access")
//                .driverClassName("com.mysql.jdbc.Driver")
//                .build();
//    }
}
