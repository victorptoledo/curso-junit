package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

    @Before
    public void setUp() {
        System.out.println("Antes do teste");
    }

    @Test
    public void test1() {
        System.out.println("Teste 1 executado");
    }

    @Test
    public void test2() {
        System.out.println("Teste 2 executado");
    }

    @After
    public void teardown() {
        System.out.println("Depois do teste");
    }
}