package tesco.kata.timer;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class TimerCharactersTestShould {

    @Test
    public void return_digit_as_expected_text() {
        Assert.assertThat(TimerCharacters.EIGHT, is(DigitAsTextConstants.EIGHT));
    }

}
