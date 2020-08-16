package guru.springframework.sfgpetclinic.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public interface ModelRepeatedTest {

    @BeforeEach
    default void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getTestMethod().get() + " : " + repetitionInfo.getCurrentRepetition());
    }
}
