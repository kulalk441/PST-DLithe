package Assignments.day5;

import java.util.regex.Pattern;

// Custom Exception
class InvalidIPException extends Exception {
    public InvalidIPException(String message) {
        super(message);
    }
}

// Validator Class
class IPValidator {

    // IPv4 Regex
    private static final String IPV4_REGEX =
            "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" +
            "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

    public static void validateIP(String ip) throws InvalidIPException {
        System.out.println("[LOG] Validating IP: " + ip);

        if (!Pattern.matches(IPV4_REGEX, ip)) {
            throw new InvalidIPException("Invalid IPv4 Address: " + ip);
        }

        System.out.println("[LOG] IP Address is valid.");
    }
}

// Driver Class
public class RegexPattern{
    public static void main(String[] args) {

        String[] ips = {
                "192.168.1.1",
                "255.255.255.255",
                "256.100.50.25",
                "192.168.1",
                "abc.def.ghi.jkl"
        };

        for (String ip : ips) {
            try {
                IPValidator.validateIP(ip);
            } catch (InvalidIPException e) {
                System.out.println("[ERROR] " + e.getMessage());
            }
            System.out.println();
        }
    }
}