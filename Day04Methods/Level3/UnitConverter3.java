public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitToCelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;
        return celsiusToFahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = pounds * 0.453592;
        return poundsToKilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = kilograms * 2.20462;
        return kilogramsToPounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = gallons * 3.78541;
        return gallonsToLiters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = liters * 0.264172;
        return litersToGallons;
    }

    public static void main(String[] args) {
        // Testing the methods
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(98.6));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(150));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(68));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(10));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(37.85));
    }
}
