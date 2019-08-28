package tesco.kata.timer;

import org.junit.Assert;
import org.junit.Test;
import tesco.kata.timer.model.TimerModel;
import tesco.kata.timer.view.BannerView;

import java.io.IOException;

import static org.hamcrest.core.Is.is;

public class TimerModelToBannerViewTestShould {

    String ZEROS = "___    ___    ___    ___    ___    ___  \n" +
            " / _ \\  / _ \\  / _ \\  / _ \\  / _ \\  / _ \\ \n" +
            "| | | || | | || | | || | | || | | || | | |\n" +
            "| |_| || |_| || |_| || |_| || |_| || |_| |\n" +
            " \\___/  \\___/  \\___/  \\___/  \\___/  \\___/";

    String TWELVE = "___    ___    ___    ___   _  ____  \n" +
            " / _ \\  / _ \\  / _ \\  / _ \\ / ||___ \\ \n" +
            "| | | || | | || | | || | | || |  __) |\n" +
            "| |_| || |_| || |_| || |_| || | / __/ \n" +
            " \\___/  \\___/  \\___/  \\___/ |_||_____|";

    @Test
    public void shouldComposeTheViewWithSixZeroValuesFromANewTimer() throws IOException {
        //given
        BannerView numberToBannerView = new BannerView();
        TimerModel model = new TimerModel();
        Assert.assertThat(numberToBannerView.compose(model),is(ZEROS));
    }

    @Test
    public void shouldComposeTheViewWithGivenTimerValueOfTwelve() throws IOException {
        //given
        BannerView numberToBannerView = new BannerView();
        TimerModel model = new TimerModel();
        model.setValue(12);
        Assert.assertThat(numberToBannerView.compose(model),is(TWELVE));
    }

}
