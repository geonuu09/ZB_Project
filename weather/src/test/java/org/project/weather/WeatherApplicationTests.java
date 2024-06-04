package org.project.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class WeatherApplicationTests {

    @Test
    void equalsTest() {
        //given
        //when
        //then
        assertEquals(1,1);
        System.out.println("test1");
    }
    @Test
    void nullTest() {
        assertNull(null);
        System.out.println("test2");
        //given
        //when
        //then
}
}
