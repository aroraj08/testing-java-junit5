package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    Person person;

    @BeforeEach
    void setup() {
        person = new Person(1l, "Jatin", "Arora");
    }

    @Test
    void groupedAssertion() {

        assertAll("Running grouped tests",
                () -> assertEquals("Jatin", person.getFirstName()),
                () -> assertEquals("Arora", person.getLastName()));
    }

    @Test
    void groupAssertion2() {

        assertAll("Running grouped test2",
                () -> assertEquals("Jatin", person.getFirstName(), "First name did not match"),
                () -> assertEquals("Arora", person.getLastName(), "Last name did not match"));

    }

    @Test
    void assertJTest() {

        assertThat(person.getFirstName()).isEqualTo("Jatin");
    }
}