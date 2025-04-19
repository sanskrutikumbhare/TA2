class GenericClass<T> {
    T value;

    GenericClass(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

class Main7 {
    public static <T> void genericMethod(T data) {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<>(100);
        obj1.display();

        GenericClass<String> obj2 = new GenericClass<>("Hello Generics");
        obj2.display();

        genericMethod(12345);
        genericMethod("Generic Method Call");
    }
}