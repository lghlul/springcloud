package com.lu;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    private static Logger logger = LogManager.getLogger(ConfigServerApplication.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerApplication.class) .web(true) .run(args);
	}


}
