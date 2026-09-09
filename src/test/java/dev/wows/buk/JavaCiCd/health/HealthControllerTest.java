package dev.wows.buk.JavaCiCd.health;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;

@WebMvcTest(HealthController.class)
class HealthControllerTest {

    private HealthController healthController;

    public HealthControllerTest() {
        healthController = new HealthController();
    }

    @Test
    void healthEndpointReturnsOK() throws Exception {
        assertEquals("OK", healthController.health());
    }
}
