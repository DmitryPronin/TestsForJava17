import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class NewTests {

    @Test
    @DisplayName("Тест 1+2 = 3")
    void firstTest(){
        assertThat(1+2)
                .as("1 + 2 = 3")
                .isEqualTo(3);
    }


    @DisplayName("Тест 2 + 2 != 3")
    @ParameterizedTest(name = "[index]{displayName} digit = {0}")
    @ValueSource(ints = {1, 2, 3})
    void secondTest(int digit){
        assertThat(digit * 2)
                .as("2 + 2 = !3")
                .isEqualTo(4);
    }
}
