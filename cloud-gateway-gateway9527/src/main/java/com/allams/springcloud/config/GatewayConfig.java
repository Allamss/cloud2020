package com.allams.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Allams
 */
//@Configuration
public class GatewayConfig {
    /*@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path-route-baidu",
            r -> r.path("/")
                .uri("https://www.baidu.com/")
                ).build();

        return routes.build();
    }*/

}
