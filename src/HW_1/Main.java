package HW_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Мурзик");
        cat.setAge(3);
        cat.greet();

        cat.setOwnerName("Алексей");
        cat.greet();
    }
}
