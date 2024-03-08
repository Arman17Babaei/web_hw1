package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void mult_ok() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calc/mult/9/6").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk()).andExpect(content().string(equalTo("54 = 9 * 6")));
    }

    @Test
    public void div_ok() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calc/div/9/6").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk()).andExpect(content().string(equalTo("1.500000 = 9 / 6")));
    }

    @Test
    public void sum_ok() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calc/sum/9/6").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk()).andExpect(content().string(equalTo("15 = 9 + 6")));
    }

    @Test
    public void subtract_ok() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/calc/subtract/9/6").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk()).andExpect(content().string(equalTo("3 = 9 - 6")));
    }
}
