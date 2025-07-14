import java.util.*;

public class convertToJava {
    public static void main(String[] args) {
        String json = "{ \"name\":\"Guru Srikanth\", \"age\":21, \"balanceAmount\":5000.0, \"interest\":[\"Reading\", \"Gaming\", \"Coding\"] }";

        Person person = parseJsonToPerson(json);
        person.displayDetails();
    }

    public static Person parseJsonToPerson(String json) {
        json = json.trim().replace("{", "").replace("}", "");

        String name = "";
        int age = 0;
        double balanceAmount = 0.0;
        Set<String> interests = new HashSet<>();

        // Extract fields manually
        for (String part : json.split(",")) {
            part = part.trim();

            if (part.contains("\"name\"")) {
                name = part.split(":")[1].replace("\"", "").trim();
            } else if (part.contains("\"age\"")) {
                age = Integer.parseInt(part.split(":")[1].trim());
            } else if (part.contains("\"balanceAmount\"")) {
                balanceAmount = Double.parseDouble(part.split(":")[1].trim());
            } else if (part.contains("\"interest\"")) {
                // Extract full array content
                int start = json.indexOf("[");
                int end = json.indexOf("]");
                String interestRaw = json.substring(start + 1, end);
                String[] items = interestRaw.split(",");
                for (String item : items) {
                    interests.add(item.replace("\"", "").trim());
                }
            }
        }

        return new Person(name, age, balanceAmount, interests);
    }

}
