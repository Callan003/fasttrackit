package ro.fasttrackit.curs21.web.country;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryReader {
    public List<Country> readCountries() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("countries2.txt"));
        List<Country> result = new ArrayList<>();

        while(scanner.hasNextLine()){
            Country country = readCountry(scanner.nextLine());
            result.add(country);
        }
        return result;
    }

    private Country readCountry(String line) {
        String[] tokens = line.split("[|]");
        if (tokens.length == 6) {
            return new Country(tokens[0], tokens[1], Long.parseLong(tokens[2]), Long.parseLong(tokens[3]), tokens[4], tokens[5]);
        } else {
            return new Country(tokens[0], tokens[1], Long.parseLong(tokens[2]), Long.parseLong(tokens[3]), tokens[4]);
        }
    }
}
