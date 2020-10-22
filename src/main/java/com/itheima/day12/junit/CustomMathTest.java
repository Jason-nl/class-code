package com.itheima.day12.junit;

import org.junit.*;// junit4
//import org.junit.jupiter.api.*; //junit5

/**
 * Created by Jason on 2020/10/22 16:09
 */
public class CustomMathTest {

//    @BeforeAll
    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("在@Test方法之前仅运行一次");
    }

//    @AfterAll
    @AfterClass
    public static void afterClassTest() {
        System.out.println("在@Test方法之后仅运行一次");
    }

//    @BeforeEach
    @Before
    public void beforeTest() {
        System.out.println("在每一个@Test方法之前都会运行一次");
    }

//    @AfterEach
    @After
    public void afterTest() {
        System.out.println("在每一个@Test方法之后都会运行一次");
    }

    @Test
    public void testAdd() {
        int res = CustomMath.add(1, 2, 3, 4, 5, 6);
        Assert.assertEquals("结果不符合我的预期", 10, res);
        System.out.println(res);
    }

    @Test
    public void testDivide() {
        int res = CustomMath.divide(10, 5);
        System.out.println(res);
    }
}
