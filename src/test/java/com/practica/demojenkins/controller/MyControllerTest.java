package com.practica.demojenkins.controller;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class MyControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private MyController myController;

    private AutoCloseable autoCloseable;


    
}
