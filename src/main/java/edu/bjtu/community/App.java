package edu.bjtu.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{

    @PostConstruct
    public void init() {
        // 加ES模块，解决netty启动冲突问题
        // see Netty4Utils.setAvailableProcessors()
        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class ,args);
    }
}


/**
 *


 F:\Environment\kafka_2.12-3.2.1\bin\windows\zookeeper-server-start.bat   F:\Environment\kafka_2.12-3.2.1\config\zookeeper.properties


 F:\Environment\kafka_2.12-3.2.1\bin\windows\kafka-server-start.bat   F:\Environment\kafka_2.12-3.2.1\config\server.properties


 */

