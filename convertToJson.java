import java.util.Set;
import java.util.HashSet;

public class convertToJson {
    public static void main(String[] args) {
        Set<String> interests = new HashSet<>();
        interests.add("Reading");
        interests.add("Gaming");
        interests.add("Coding");

        Person person = new Person("Guru Srikanth", 21, 5000.0, interests);
        String json = convertToJson(person);
        System.out.println(json);
    }

    public static String convertToJson(Person person) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        json.append("\"name\":\"").append(escapeJson(person.getName())).append("\", ");
        json.append("\"age\":").append(person.getAge()).append(", ");
        json.append("\"balanceAmount\":").append(person.getBalanceAmount()).append(", ");
        json.append("\"interest\":").append(convertSetToJsonArray(person.getInterest()));
        json.append("}");
        return json.toString();
    }

    private static String escapeJson(String input) {
        return input.replace("\"", "\\\""); 
    }

    private static String convertSetToJsonArray(Set<String> set) {
        StringBuilder array = new StringBuilder();
        array.append("[");
        int i = 0;
        for (String item : set) {
            array.append("\"").append(escapeJson(item)).append("\"");
            if (++i < set.size()) {
                array.append(", ");
            }
        }
        array.append("]");
        return array.toString();
    }
}
