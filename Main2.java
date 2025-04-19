class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void display(String msg) {
        System.out.println(msg + " Name: " + name + ", Age: " + age);
    }

    protected void finalize() {
        System.out.println("Object is destroyed.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();

        Person p2 = new Person("Alice", 25);
        p2.display("Person Info:");

        p1 = null;
        p2 = null;
        System.gc();
    }
}