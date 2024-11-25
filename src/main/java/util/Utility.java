package util;

import org.openqa.selenium.JavascriptExecutor;

import java.security.SecureRandom;
import java.util.Random;
import java.util.List;

import static util.Utility.*;

import org.openqa.selenium.WebDriver;

public class Utility {
    static Random random = new Random();


    public static String getRandomName() {
        String[] firstNames = {"Alice", "Islam", "Bob", "Charlie", "David", "Emily", "Frank",
                "Grace", "Henry", "Isabella", "Jack", "Soka", "Boka"};
        Random random = new Random();
        int index = random.nextInt(firstNames.length);
        return firstNames[index];

    }

    private static final String[] countryNames = {
            "United States", "Canada", "China", "India", "Indonesia", "Brazil", "Pakistan", "Nigeria",
            "Bangladesh", "Russia", "Mexico", "Japan", "Philippines", "Germany", "Vietnam", "Egypt",
            "Iran", "Turkey", "United Kingdom", "France", "Italy", "South Africa", "Colombia", "Argentina",
            "Spain", "Ukraine", "Kenya", "Tanzania", "Australia", "Thailand", "Algeria", "Sudan",
            "Morocco", "Ghana", "Ethiopia", "Poland", "Saudi Arabia", "Myanmar", "Nepal", "Malaysia",
            "Venezuela", "Peru", "Yemen", "South Korea", "Cameroon", "Zimbabwe", "Angola", "Uganda",
            "Senegal", "Niger", "Afghanistan", "Sri Lanka", "Syria", "Romania", "Kazakhstan", "Greece",
            "Czech Republic", "Peru", "Sweden", "Iraq", "Guatemala", "Venezuela", "Cuba", "Ecuador",
            "Dominican Republic", "Poland", "South Sudan", "Haiti", "Paraguay", "Bolivia", "El Salvador",
            "Honduras", "Nicaragua", "Costa Rica", "Panama", "Belize", "Jamaica", "Barbados", "Trinidad and Tobago",
            "Guyana", "Suriname", "French Guiana", "Argentina", "Chile", "Uruguay", "Paraguay", "Bolivia",
            "Peru", "Ecuador", "Colombia", "Venezuela", "Brazil", "Guyana", "Suriname", "French Guiana",
            "Mexico", "Guatemala", "Belize", "El Salvador", "Honduras", "Nicaragua", "Costa Rica", "Panama"
    };

    public static String generateCountryName() {
        Random rand = new Random();
        int countryNameIndex = rand.nextInt(countryNames.length);
        return countryNames[countryNameIndex];
    }

    public static String generatePostalCode(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Postal code length must be positive.");
        }

        Random random = new Random();
        StringBuilder postalCode = new StringBuilder();

        for (int i = 0; i < length; i++) {
            postalCode.append(random.nextInt(10));
        }

        return postalCode.toString();
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max
                - min + 1) + min;
    }

    public static void main(String[] args) {
        int randomNumber = generateRandomNumber(1,
                100);
    }

    public static String generateRandomPassword(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Password length must be positive.");
        }

        SecureRandom random = new SecureRandom();

        byte[] bytes = new byte[length];
        random.nextBytes(bytes);

        StringBuilder password = new StringBuilder();
        for (byte b : bytes) {
            password.append((char) (Math.abs(b) % 128));
        }

        return password.toString();
    }


    private static final String[] WORDS = {
            "quick", "brown", "fox", "jumps", "over", "lazy", "dog",
            "apple", "banana", "cherry", "grape", "orange", "pear",
            "mountain", "river", "ocean", "forest", "field", "sky",
            "happy", "sad", "angry", "excited", "calm", "relaxed"
    };
    private static final String[] streetNames = {
            "Main", "Oak", "Maple", "Elm", "Willow", "Pine", "Cedar", "Birch", "Walnut", "Cherry",
            "Park", "River", "Lake", "Hill", "Valley", "Meadow", "Ridge", "Grove", "Lane", "Drive",
            "Boulevard", "Avenue", "Circle", "Square", "Court", "Terrace", "Place", "Road", "Street", "Highway"
    };

    public static String generateStreetName() {
        Random rand = new Random();
        int streetNameIndex = rand.nextInt(streetNames.length);
        return streetNames[streetNameIndex];
    }

    private static final String[] areaCodes =
            {"212", "312", "415", "617", "718",
                    "917", "202", "303", "404",
                    "602", "702", "909"};
    private static final String[] prefixes =
            {"234", "567", "890", "123", "456", "789"};

    public static String generatePhoneNumber() {
        Random rand = new Random();
        int areaCodeIndex = rand.nextInt(areaCodes.length);
        int prefixIndex = rand.nextInt(prefixes.length);
        String suffix = String.format("%04d", rand.nextInt(10000));

        return areaCodes[areaCodeIndex] + "-" + prefixes[prefixIndex] + "-" + suffix;
    }


    public static String generateCityName() {
        String[] cityNames = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego",
                "Dallas", "Austin", "Jacksonville", "Fort Worth", "Columbus",
                "San Jose", "Indianapolis", "Detroit",
                "El Paso", "Memphis", "Baltimore", "Oklahoma City", "Portland", "Las Vegas", "Louisville", "Nashville",
                "Sacramento", "Cincinnati", "Atlanta", "Kansas City", "Boston", "Milwaukee", "Tucson", "Albuquerque",
                "Raleigh", "Denver", "Long Beach", "Omaha", "Fresno", "Miami", "Raleigh", "Charlotte", "Orlando", "Minneapolis"};
        Random rand = new Random();
        int cityNameIndex = rand.nextInt(cityNames.length);
        return cityNames[cityNameIndex];
    }

    public static String generateRandomGmail() {
        Random random = new Random();
        StringBuilder email = new StringBuilder();

        // Generate a random word for the username
        int wordIndex = random.nextInt(WORDS.length);
        email.append(WORDS[wordIndex]);

        // Add a random number to the username
        int randomNumber = random.nextInt(10000);
        email.append(randomNumber);

        // Append the Gmail domain
        email.append("@gmail.com");

        return email.toString();
    }

    public static int generateRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }


}
