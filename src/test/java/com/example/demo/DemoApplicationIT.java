package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationIT {

    @Value("${integrationTestProfiles}")
    private String integrationTestProfiles;

    @Test
    public void contextLoads() {
        System.out.println("integrationTestProfiles: " + integrationTestProfiles);
    }

}