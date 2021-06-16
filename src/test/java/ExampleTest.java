import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    @DisplayName("Descriptive")
    void shouldShowSimpleAssertion(){
        Assertions.assertEquals(1,1);
    }
}
