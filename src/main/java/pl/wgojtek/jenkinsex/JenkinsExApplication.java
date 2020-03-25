package pl.wgojtek.jenkinsex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsExApplication.class, args);
    }

    public int added(int a, int b){
        return a+b;
    }
}
