package com.learning.jpa.learnJPA.repository;

import com.learning.jpa.learnJPA.LearnJpaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LearnJpaApplication.class)
public class CourseRepositoryTest {

    @Test
    public void contextLoads(){
    System.out.println("Hello");
    }

}
