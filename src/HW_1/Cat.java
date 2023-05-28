package HW_1;

public class Cat {
    private String name;
    private int age;
    private String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
        if (ownerName != null) {
            System.out.println("Мой владелец - " + ownerName + ".");
        }
    }
}
