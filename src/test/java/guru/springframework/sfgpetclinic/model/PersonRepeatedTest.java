package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class PersonRepeatedTest implements ModelRepeatedTest {

    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition}-{totalRepetitions}")
    @DisplayName("new repeated test for assignment")
    void newRepeatedTest() {

    }
}
