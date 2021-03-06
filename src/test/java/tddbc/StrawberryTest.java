package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StrawberryTest {

    @Test
    @DisplayName("いちご（品種：あまおうとサイズ：S）からサイズ（S）が取得できること")
    public void いちご_品種_あまおうとサイズ_S_からサイズ_S_が取得できること() throws Exception {
        // Setup
        Strawberry sut = new Strawberry("あまおう", "S");
        // Exercise
        String actual = sut.size;
        // Verify
        assertEquals("S", actual);
    }

    @Test
    @DisplayName("いちご（品種：あまおうとサイズ：S）から品種（あまおう）が取得できること")
    public void いちご_品種_あまおうとサイズ_S_から品種_あまおう_が取得できること() throws Exception {
        // Setup
        Strawberry sut = new Strawberry("あまおう", "S");
        // Exercise
        String actual = sut.variety;
        // Verify
        assertEquals("あまおう", actual);
    }

    @Test
    @DisplayName("いちご（品種：あまおうとサイズ：S）文字列表現_\"あまおう: S\"を取得できること")
    public void いちご_品種_あまおうとサイズ_S_から文字列表現_あまおう_S_を取得できること() throws Exception {
        // Setup
        Strawberry sut = new Strawberry("あまおう", "S");
        // Exercise
        String actual = sut.getVarietyAndSize();
        // Verify
        assertEquals("あまおう: S", actual);
    }

    @Test
    @DisplayName("いちごを生成する際に品種に想定外(いちご)の値を受け取ると例外を発生させること")
    public void いちごを生成する際に品種に想定外_いちご_の値を受け取ると例外を発生させること() throws Exception {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Strawberry("いちご", "S"));
        assertEquals("想定外の品種が指定されました: いちご", e.getMessage());
    }

}
