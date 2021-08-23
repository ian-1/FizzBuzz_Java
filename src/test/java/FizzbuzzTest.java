import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    void testGenerateListsNumbersUpToOne() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(1);
        assertEquals("1", result);
    }

    @Test
    void testGenerateListsNumbersUpToTwo() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(2);
        String expect = "1, 2";
        assertEquals(expect, result);
    }

    @Test
    void testGenerateListsNumbersUpToThree() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(3);
        String expect = "1, 2, Fizz";
        assertEquals(expect, result);
    }

    @Test
    void testGenerateListsNumbersUpToFive() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(5);
        String expect = "1, 2, Fizz, 4, Buzz";
        assertEquals(expect, result);
    }

    @Test
    void testGenerateListsNumbersUpToFifteen() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(15);
        String expect = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz";
        assertEquals(expect, result);
    }
}
