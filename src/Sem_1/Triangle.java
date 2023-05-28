package Sem_1;

public class Triangle extends Shape {
    String style;
    String a = "triangle";

    /**
     * Создали конструктор по умолчанию
     */
    public Triangle() {
        super();
        style = "none";
    }

    /**
     * Создали кастомный конструктор
     */
    public Triangle(double width, double height, String style) {
        super(width, height);// Обратились к родительскому конструктору
        this.style = style;// Обратились к родительским полям родительского конструктора
    }

    /**
     * Создали кастомный конструктор
     */
    public Triangle(double wx) {
        super(wx);
        style = "none";
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void show_style() {
        System.out.println("Форма = " + style);
    }

    void show_super(){
        System.out.println(a);
        System.out.println(super.a);
    }

    /**
     * Переопределили метод из родительского класса
     */
    @Override
    void show_shape() {
        System.out.println("Гипотенуза = " + Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight()));
    }
}