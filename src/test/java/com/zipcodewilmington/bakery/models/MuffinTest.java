package com.zipcodewilmington.bakery.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import org.springframework.util.Assert;

import javax.persistence.Entity;

public class MuffinTest {
    @Test
    public void testClassSignatureAnnotations() {
        Assertions.assertTrue(Muffin.class.isAnnotationPresent(Entity.class));
    }
    @Test
    public void testCreateJson() throws JsonProcessingException {
        ObjectMapper jsonWriter = new ObjectMapper();
        Muffin muffin = new Muffin();
        String json = jsonWriter.writeValueAsString(muffin);
    }
}
