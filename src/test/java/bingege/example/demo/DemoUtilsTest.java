package bingege.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoUtilsTest {

    @Test
    public void test_greeting() {
        Assertions.assertEquals(11, DemoUtils.greeting().length());
    }

    @Test
    public void test_greeting_2() {
        Assertions.assertEquals(DemoUtils.greeting(), "Hello World");
    }

    @Test
    void test1() {
        Assertions.assertEquals(DemoUtils.test(), "test1");
    }
}
