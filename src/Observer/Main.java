package Observer;

public class Main {
    public static void main(String[] args) {
        Temperatura t = new Temperatura(0);
        TermometroCelsius celsinho = new TermometroCelsius();
        TermometroFahrenheit fahrenheit = new TermometroFahrenheit();
        t.addObserver(celsinho);
        t.addObserver(fahrenheit);
        t.setTemp(10);
        t.setTemp(40);

    }
}
