package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest implements ModelTest {

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

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition}-{totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {

    }

    @RepeatedTest(value=5)
    @DisplayName("repeated test with DI")
    void repeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.print(testInfo.getDisplayName() + " : " + repetitionInfo.getCurrentRepetition());
    }
}