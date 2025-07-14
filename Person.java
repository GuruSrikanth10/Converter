import java.util.Set;

class Person {
    private String name;
    private int age;
    private Double balanceAmount;
    private Set<String> interest;

    public Person(String name, int age, Double balanceAmount, Set<String> interest) {
        this.name = name;
        this.age = age;
        this.balanceAmount = balanceAmount;
        this.interest = interest;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public Double getBalanceAmount() { return balanceAmount; }
    public void setBalanceAmount(Double balanceAmount) { this.balanceAmount = balanceAmount; }

    public Set<String> getInterest() { return interest; }
    public void setInterest(Set<String> interest) { this.interest = interest; }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance Amount: ₹" + balanceAmount);
        System.out.println("Interests: " + interest);
    }
}


