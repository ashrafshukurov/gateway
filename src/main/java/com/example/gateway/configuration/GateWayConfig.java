package com.example.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ashraf on 19-Jul-23
 * @project gateway
 */
@Configuration
public class GateWayConfig {
   @Bean
   public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
      return builder.routes()
              .route(r->r.path("/order/**").uri("http://localhost:8082/")).build();
   }
}
