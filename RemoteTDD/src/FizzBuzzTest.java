// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.*;


public class FizzBuzzTest {

    @Test
    void life_the_universe_and_everything() {
        int expected = 42;
        int actual = FizzBuzz.answer();
        assertEquals(expected, actual);
    }
}

