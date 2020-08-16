package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@Tag("controller")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ControllerTest {

    @BeforeAll
    default void beforeAll() {
        System.out.println("Doing something common here for all controller tests");
    }
}
