package com.hzm.five;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



/**
 * DemoTwoController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>04/02/2018</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MvcConfig.class})
@WebAppConfiguration(value = "src/main/resources")
public class DemoTwoControllerTest {

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext web;
    @Autowired
    private MockHttpSession mockHttpSession;
    @Autowired
    private MockHttpServletRequest mockHttpServletRequest;

    @Before
    public void before() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.web).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getTest()
     */
    @Test
    public void testGetTest() throws Exception {
        System.out.println("==============test-init==================");
        mockMvc.perform(MockMvcRequestBuilders.get("/test/get"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("test-get"));

    }


} 
