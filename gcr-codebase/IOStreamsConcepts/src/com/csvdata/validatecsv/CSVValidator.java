package com.csvdata.validatecsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class CSVValidator {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^\\d{10}$");

    public static void main(String[] args) {

        String filePath = "src/com/csvdata/csvfiles/users.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int rowNumber = 0;

            while ((line = br.readLine()) != null) {
                rowNumber++;

                if (rowNumber == 1) {
                    continue;
                }

                String[] columns = line.split(",");

                String name = columns[0].trim();
                String email = columns[1].trim();
                String phone = columns[2].trim();

                boolean valid = true;

                if (!EMAIL_PATTERN.matcher(email).matches()) {
                    System.out.println("Row " + rowNumber +
                            " Invalid Email → " + email);
                    valid = false;
                }

                if (!PHONE_PATTERN.matcher(phone).matches()) {
                    System.out.println("Row " + rowNumber +
                            " Invalid Phone → " + phone);
                    valid = false;
                }

                if (!valid) {
                    System.out.println("Invalid Row Data: " + line);
                    System.out.println("----------------------------------");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
