package tesco.kata.timer.view;

import com.github.lalyos.jfiglet.FigletFont;
import tesco.kata.timer.model.TimerModel;

public class BannerView implements View<String, TimerModel> {

    @Override
    public String compose(TimerModel model) {
        return FigletFont.convertOneLine(String.format("%06d", model.getValue())).trim();
    }
}
