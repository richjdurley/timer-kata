package tesco.kata.timer;

import org.junit.Assert;
import org.junit.Test;
import tesco.kata.timer.model.TimerModel;
import tesco.kata.timer.view.BannerView;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static tesco.kata.timer.TestConstants.TWELVE;
import static tesco.kata.timer.TestConstants.ZEROS;

public class TimerModelToBannerViewTestShould {


    @Test
    public void shouldComposeTheViewWithSixZeroValuesFromANewTimer() throws IOException {
        //given
        BannerView numberToBannerView = new BannerView();
        TimerModel model = new TimerModel();
        Assert.assertThat(numberToBannerView.compose(model), is(ZEROS));
    }

    @Test
    public void shouldComposeTheViewWithGivenTimerValueOfTwelve() throws IOException {
        //given
        BannerView numberToBannerView = new BannerView();
        TimerModel model = new TimerModel();
        model.setValue(12);
        Assert.assertThat(numberToBannerView.compose(model), is(TWELVE));
    }

}
