package exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    void deveConverter32FahrenheitPara0Celsius() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), 0.001);
    }

    @Test
    void deveConverter212FahrenheitPara100Celsius() {
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212.0), 0.001);
    }

    @Test
    void deveConverter0CelsiusPara32Fahrenheit() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), 0.001);
    }

    @Test
    void deveConverter100CelsiusPara212Fahrenheit() {
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100.0), 0.001);
    }
}
