package tesco.kata.timer;

public enum TimerCharacters implements DigitAsTextConstants {

    DIGIT_ZERO(ZERO), DIGIT_ONE(ONE), DIGIT_TWO(TWO), DIGIT_THREE(THREE), DIGIT_FOUR(FOUR), DIGIT_FIVR(FIVE), DIGIT_SIX(SIX), DIGIT_SEVEN(SEVEN), DIGIT_EIGHT(EIGHT), DIGIT_NINE(NINE);

    private final String value;

    TimerCharacters(String value) {
        this.value = value;
    }

    public String getDigitAsText() {
        return value;
    }


}
