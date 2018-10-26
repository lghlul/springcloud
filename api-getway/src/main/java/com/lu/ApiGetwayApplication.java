package com.lu;


import com.lu.filter.AccessFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableZuulProxy
@SpringCloudApplication
public class ApiGetwayApplication {

    private static Logger logger = LogManager.getLogger(ApiGetwayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiGetwayApplication.class, args);
	}

    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}"){
            @Override
            public String apply(String serviceId) {
                String route =  super.apply(serviceId);
                logger.info(serviceId + " -> " +route);
                return route;
            }
        };
    }

    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }

}
