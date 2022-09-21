package com.in28minutes.junit.helper;

import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Antes da classe");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Antes da classe");
    }

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