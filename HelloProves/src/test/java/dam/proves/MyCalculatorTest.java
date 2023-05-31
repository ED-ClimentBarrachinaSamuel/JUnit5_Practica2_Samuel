package dam.proves;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    private MyCalculator myCalculator;

    @BeforeEach
    public void setUpMyCalculator() {
        myCalculator = new MyCalculator();
        System.out.println("MyCalculator created");
    }

    @BeforeEach
    public void tearDownMyCalculator() {
        myCalculator = null;
        System.out.println("MyCalculator=null");
    }

    @Test
    void add() {
        int expectedResult = 10;
        int actualResult = myCalculator.add(5, 5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sub() {
        int expectedResult = 5;
        int actualResult = myCalculator.sub(10, 5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void mult() {
        int expectedResult = 25;
        int actualResult = myCalculator.mult(5, 5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void div() {
        int expectedResult = 2;
        int actualResult = myCalculator.div(10, 5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divByZero() {
        assertThrows(ArithmeticException.class, () -> myCalculator.divByZero(5, 0), "Divisió per zero");
    }

    @Test
    void addWhenNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myCalculator.add(-1, 5));
    }

    @Test
    void subWhenNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myCalculator.sub(10, -5));
    }

    @Test
    void multWhenNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myCalculator.mult(-5, 5));
    }

    @Test
    void divWhenNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myCalculator.div(10, -5));
    }
}