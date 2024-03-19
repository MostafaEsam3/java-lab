package classes;
import java.util.function.Function;

public class TemperatureConvert implements Function<Float, Float> {

    @Override
    public Float apply(Float x) {
        return x * 9 / 5 + 32;
    }
}


