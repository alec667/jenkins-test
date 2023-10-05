package com.practica.demojenkins.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class MyControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private MyController myController;

    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUP() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(myController).build();

    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

}
