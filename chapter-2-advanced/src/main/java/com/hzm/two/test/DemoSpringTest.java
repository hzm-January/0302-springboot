package com.hzm.two.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DemoConfig.class})
@ActiveProfiles("prod")
public class DemoSpringTest {
    @Autowired
    private DemoContent demoContent;

    @Test
    public void show(){
        String asscert = "product content";
        String content = demoContent.getContent();
        Assert.assertEquals(asscert, content);
        System.out.println(content);
    }
}
