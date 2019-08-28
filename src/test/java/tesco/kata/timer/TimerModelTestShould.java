package tesco.kata.timer;

import org.junit.Assert;
import org.junit.Test;
import tesco.kata.timer.model.TimerModel;

import static org.hamcrest.CoreMatchers.is;

public class TimerModelTestShould {

    @Test
    public void return_a_zero_value_when_new() {
        TimerModel model = new TimerModel();
        Assert.assertThat(model.getValue(), is(0));
    }

    @Test
    public void return_the_set_timer_value() {
        TimerModel model = new TimerModel();
        model.setValue(12);
        Assert.assertThat(model.getValue(), is(12));
    }

}
