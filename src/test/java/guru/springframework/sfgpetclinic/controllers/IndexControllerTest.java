package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.exception.NameNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest implements ControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", indexController.index());
        assertEquals("index", indexController.index(), "view name not matched");
    }

    @Test
    void oopsHandler() {
    }

    @Test
    @DisplayName("Test Exception")
    void testException() {

        assertThrows(NameNotFoundException.class, () -> {
            indexController.oopsHandler();
        }, "Actual Code does not throw expected exception");
    }

    /**
     * Test runs even if specified duration gets exceeded. Also, runs in the same thread of execution
     */
    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(10), () -> {
            //Thread.sleep(1000);
            System.out.println("I am here.. testTimeout");
        });
    }

    /**
     * Once execution time of method exceeds the specified time, test is no longer run
     * Also, the test runs in another execution thread.
     */
    @Test
    void testTimeoutPreempt() {
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            //Thread.sleep(1000);
            System.out.println("I am here.. testTimeoutPreempt");
        });
    }

}