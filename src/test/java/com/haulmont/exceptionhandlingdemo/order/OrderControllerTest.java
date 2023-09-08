package com.haulmont.exceptionhandlingdemo.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the {@link OrderController}
 */
@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {

    }

    @Test
    @DisplayName("Check exception handling in controller has highest priority")
    public void handleByOrderController() throws Exception {
        String userId = "bl_test";

        //language=json
        String orderCreateDto = """
                {
                	"number": ""
                }""";

        mockMvc.perform(post("/order/create")
                        .content(orderCreateDto)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("userId", userId))
                .andExpectAll(status().isBadRequest(), content()
                        .json("{\"code\":1003,\"message\":\"Order cannot be placed because user is banned\"}"))
                .andDo(print());
    }


    /**
     * Works only when hierarchy is described in the same ControllerAdvice class
     *
     * @throws Exception
     */
    @Test
    @DisplayName("Check exception without specific exception handling use exception hierarchy (concrete exception)")
    public void handleByExceptionHierarchyConcreteException() throws Exception {
        String userId = "fl_test";

        //language=json
        String orderCreateDto = """
                {
                	"number": ""
                }""";

        mockMvc.perform(post("/order/create")
                        .content(orderCreateDto)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("userId", userId))
                .andExpectAll(status().isBadRequest(), content()
                        .json("{\"code\":1001,\"message\":\"Redirect to profile page\"}"))
                .andDo(print());
    }


    /**
     * Works only when hierarchy is described in the same ControllerAdvice class
     *
     * @throws Exception
     */
    @Test
    @DisplayName("Check exception without specific exception handling use exception hierarchy (nearest parent)")
    public void handleByExceptionHierarchyNearestParent() throws Exception {
        String userId = "ac_test";

        //language=json
        String orderCreateDto = """
                {
                	"number": ""
                }""";

        mockMvc.perform(post("/order/create")
                        .content(orderCreateDto)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("userId", userId))
                .andExpectAll(status().isBadRequest(), content()
                        .json("{\"code\":1005,\"message\":\"User base exception\"}"))
                .andDo(print());
    }

    @Test
    @DisplayName("Check exception handling described in different ControllerAdvice classes have undefined order")
    public void undefinedBehaviourForDifferentControllerAdvice() throws Exception {
        String userId = "18_test";

        //language=json
        String orderCreateDto = """
                {
                	"number": ""
                }""";

        mockMvc.perform(post("/order/create")
                        .content(orderCreateDto)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("userId", userId))
                .andExpectAll(status().isBadRequest(), content()
                        .json("{\"code\":1006,\"message\":\"User age is less than 18\"}"))
                .andDo(print());
    }
}
