package tesco.kata.timer.view;

import tesco.kata.timer.model.Model;

public interface View<R, T extends Model<?>> {
    R compose(T model);
}
