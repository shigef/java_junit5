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

    @Test
    public void いちご_品種_あまおうとサイズ_S_から品種_あまおう_が取得できること() throws Exception {
        // Setup
        Strawberry sut = new Strawberry("あまおう", "S");
        // Exercise
        String actual = sut.variety;
        // Verify
        assertEquals("あまおう", actual);
    }

    @Test
    public void いちご_品種_あまおうとサイズ_S_から文字列表現_あまおう_S_を取得できること() throws Exception {
        // Setup
        Strawberry sut = new Strawberry("あまおう", "S");
        // Exercise
        String actual = sut.variety;
        // Verify
        assertEquals("あまおう: S", actual);
    }

}
