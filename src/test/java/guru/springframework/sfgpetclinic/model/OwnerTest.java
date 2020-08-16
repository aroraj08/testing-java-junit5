package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerTest implements ModelTest {

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

    @ParameterizedTest
    @ValueSource(strings = {"param1", "param2", "param3"})
    void parameterizedTest(String val) {
        System.out.println("executing with param : " + val);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 5})
    void parameterizedTestWithInt(int val) {
        System.out.println("executing with val " + val);
    }

    @ParameterizedTest
    @DisplayName("Method provider Test")
    @MethodSource("getArgs")
    void testParameterFromMethod(String val1, String val2) {
        System.out.println("State :" + val1 + " and Description : " + val2);
    }

    static Stream<Arguments> getArgs() {
        return Stream.of(
                Arguments.of("CA", "California"),
                Arguments.of("NY", "New York"),
                Arguments.of("OH", "Ohio")
                );
    }
}