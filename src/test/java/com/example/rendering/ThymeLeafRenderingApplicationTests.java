package com.example.rendering;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class ThymeLeafRenderingApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldGetHTML() throws Exception {
        mvc
                .perform(get("/"))
                .andExpect(view().name("index.html"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldGetCSS() throws Exception {
        mvc
                .perform(get("/main.css"))
                .andExpect(view().name("css/main.css"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldGetJS() throws Exception {
        mvc
                .perform(get("/common.js"))
                .andExpect(view().name("js/common.js"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
