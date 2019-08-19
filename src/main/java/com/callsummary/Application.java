package com.callsummary;

import com.callsummary.Task.CallSummaryTask;
import com.callsummary.Task.CompletionDataTask;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Auther: fujian
 * @Date: 2019-8-9 18:09
 * @Description:
 */

@SpringBootApplication
@MapperScan("com.callsummary.mapper")
@EnableScheduling
@EnableTransactionManagement
public class Application implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(Application.class);
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String dbUsername;
    @Value("${spring.datasource.password}")
    private String dbPassword;
    @Autowired
    private CallSummaryTask callSummaryTask;

    @Override
    public void run(String... strings) throws Exception {
        testDb();
        callSummaryTask.task();

    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private void testDb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
            logger.info("数据库连接测试通过");
        } catch (Exception e) {
            logger.error("数据库连接出错，请确定数据库连接信息正确。url:[{}] username:[{}] password:[{}]",dbUrl,dbUsername,dbPassword);
            System.exit(0);
        }


    }
}
