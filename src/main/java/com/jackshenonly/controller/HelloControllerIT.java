//package com.jackshenonly.controller;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.embedded.LocalServerPort;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.net.URL;
//
//import static org.hamcrest.core.IsEqual.equalTo;
//import static org.junit.Assert.assertThat;
//
///**
// * Created by jackshenonly on 17/8/12.
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class HelloControllerIT {
//
//    @LocalServerPort
//    private int port;
//
//    private URL base;
//
//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//    @Before
//    public void setUp() throws Exception{
//        this.base = new URL("http://localhost:" + port + "/");
//
//    }
//
////    @Test
////    public void getHello() throws Exception {
////        ResponseEntity<String> response = testRestTemplate.getForEntity(base.toString(),
////                String.class);
////        assertThat(response.getBody(), equalTo("Hello Spring Boot"));
////    }
//}
