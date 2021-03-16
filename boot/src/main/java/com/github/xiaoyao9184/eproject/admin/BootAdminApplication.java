package com.github.xiaoyao9184.eproject.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

/**
 * Created by xy on 2021/2/25.
 */
@SpringBootApplication
@EnableAdminServer
public class BootAdminApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BootAdminApplication.class);
        app.setDefaultProperties(new HashMap<String, Object>() {{
            put("spring.profiles.default", "dev");
        }});
        app.run(args);
    }

}
