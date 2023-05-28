package Sem_1;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        Triangle t3 = new Triangle(8.0);
        Triangle t4 = new Triangle(25.0);

        Triangle t5 = new Triangle(8.0, 2.0, "filled");
        Triangle t6 = new Triangle(25.0, 12.0, "empty");

        Shape.clearScreen();

        t1.show_style();
        t1.show_shape();

        t2.show_style();
        t2.show_shape();

        t3.show_style();
        t3.show_shape();

        t4.show_style();
        t4.show_shape();

        t5.show_style();
        t5.show_shape();

        t6.show_style();
        t6.show_shape();

        t6.show_super();

    }
}