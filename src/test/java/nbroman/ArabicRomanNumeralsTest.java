package nbroman;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {
    @Test
    public void testConvertValidNumbers(){
        //GIVEN
        ArabicRomanNumerals converter = new ArabicRomanNumerals();
        //WHEN
        String rst =converter.convert(19);
        //THEN
        assertThat(rst).isEqualTo("XIX");
    }



}
