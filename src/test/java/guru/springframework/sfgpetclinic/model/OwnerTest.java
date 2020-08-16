package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest {

    Owner owner;

    @BeforeEach
    void setup() {
        owner = new Owner(1l, "Jatin", "Arora");
        owner.setCity("Sonipat");
        owner.setTelephone("12345566");
    }

    @Test
    @DisplayName("Testing Dependent Tests")
    void dependentTest() {
        assertAll("Properties Test",
                () -> {
                    assertAll("Person Properties Test",
                            () -> assertEquals("Jatin", owner.getFirstName(), "First name did not match"),
                            () -> assertEquals("Arora", owner.getLastName(), "Last name did not match")
                    );
                },
                () -> {
                    assertAll("Contact Details Properties Test",
                            () -> assertEquals("Sonipat", owner.getCity()),
                            () -> assertEquals("12345566", owner.getTelephone()));
                });
    }
}