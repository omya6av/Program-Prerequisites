public class UnitConverter2 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Test the methods with sample values
        double fahrenheit = 100;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 10;
        double liters = 20;

        // Convert Fahrenheit to Celsius
        System.out.println(fahrenheit + "°F is equal to " + convertFahrenheitToCelsius(fahrenheit) + "°C.");

        // Convert Celsius to Fahrenheit
        System.out.println(celsius + "°C is equal to " + convertCelsiusToFahrenheit(celsius) + "°F.");

        // Convert pounds to kilograms
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");

        // Convert kilograms to pounds
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");

        // Convert gallons to liters
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");

        // Convert liters to gallons
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
    }
}
