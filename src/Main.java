public class Main {

    public static void main(String[] args) {

        Temp temp = new Temp();


        double fTemp = 84.0;
        double cTemp = temp.toCelsius(fTemp);
        System.out.println(cTemp);

        cTemp = 24.5;
        fTemp = temp.toFahrenheit(cTemp);
        System.out.println(fTemp);

        cTemp = 32;
        double kTemp = temp.cToKelvin(cTemp);
        System.out.println(kTemp);

        fTemp = 40;
        kTemp = temp.fToKelvin(fTemp);
        System.out.println(kTemp);

        kTemp = 65;
        fTemp = temp.kToFahrenheit(kTemp);
        System.out.println(fTemp);

        kTemp = 82;
        cTemp = temp.kToCelsius(kTemp);
        System.out.println(cTemp);

    }
}
