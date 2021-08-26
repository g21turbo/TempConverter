public class Temp {

    public static void main(String[] args) {

    }
    public double toCelsius(double f){
        double c;
        c = (f-32.0)/1.8;
        return c;
    }

    public double toFahrenheit(double c){
        double f;
        f = (c*1.8) + 32.0;
        return f;
    }

    public double cToKelvin(double c){
        double k;
        k = (c + 273.15);
        return k;
    }

    public double fToKelvin(double f){
        double k;
        k = (f-32) * 5/9 + 273.15;
        return k;

    }

    public double kToFahrenheit(double k) {
        double f;
        f = (k - 273.15) * 9/5 + 32;
        return f;
    }

    public double kToCelsius(double k){
        double c;
        c = (k - 273.15);
        return c;
    }
}
