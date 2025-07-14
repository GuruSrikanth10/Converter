import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> interests = new HashSet<>();
        interests.add("Reading");
        interests.add("Gaming");
        interests.add("Coding");

        Person person = new Person("Guru Srikanth", 21, 5000.0, interests);
        person.displayDetails();
    }
}