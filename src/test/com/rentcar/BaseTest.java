package com.rentcar;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml","classpath:spring/spring-service.xml","classpath:spring/spring-mvc.xml"})
public class BaseTest {

}
