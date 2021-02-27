package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    @DisplayName("should return Hello TDD Boot Camp")
    public void _should_return_Hello_TDD_BootCamp() throws Exception {
        // Setup
        Sample sut = new Sample();
        // Exercise
        String actual = sut.say();
        // Verify
        assertEquals("Hello!! TDD BootCamp! git test", actual);
    }

}
