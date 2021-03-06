package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StrawberryTest {

    @Test
    public void いちご_品種_あまおうとサイズ_S_からサイズ_S_が取得できること() throws Exception {
        // Setup
        Strawberry sut = new Strawberry("あまおう", "S");
        // Exercise
        String actual = sut.size;
        // Verify
        assertEquals("S", actual);
    }

}
