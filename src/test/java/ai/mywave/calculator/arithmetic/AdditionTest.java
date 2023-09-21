package ai.mywave.calculator.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    @Test
    public void shouldAdd() {
        var addition = new Addition();
        var actual = addition.add(2.12, 1);
        assertEquals(3.12, actual);
    }
}