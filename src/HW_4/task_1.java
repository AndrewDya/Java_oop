package HW_4;

public class task_1 {
    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        Integer integerElement = 10;
        printElement(integerElement);

        String stringElement = "Hello, World!";
        printElement(stringElement);

        Double doubleElement = 3.14;
        printElement(doubleElement);
    }
}

