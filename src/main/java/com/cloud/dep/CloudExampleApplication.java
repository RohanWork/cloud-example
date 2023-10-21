package com.cloud.dep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudExampleApplication {

    @GetMapping(value = "/")
    private String welcome(){
        return "Welcome to the deployment process, User.";
    }

    @GetMapping(value = "/{ip}")
    private String greet(@PathVariable String ip){
        return "Hi "+ip+", the contoller is working from openshift......";
    }
    public static void main(String[] args) {
        SpringApplication.run(CloudExampleApplication.class, args);
    }

}
