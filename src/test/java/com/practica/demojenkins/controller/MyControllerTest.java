package com.practica.demojenkins.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
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

    @Test
    void helloTest() throws Exception {
        ResponseEntity<String> response = new ResponseEntity<String>("Hello :)", HttpStatus.OK);
        when(myController.hello()).thenReturn(response);

        MockHttpServletRequestBuilder mockResponse = MockMvcRequestBuilders
                .get("/rest/hello")
                .contentType(MediaType.APPLICATION_JSON);

        mockMvc.perform(mockResponse)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
