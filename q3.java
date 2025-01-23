class Mother {
    static void show() {
        System.out.println("Hello World");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Hello JUET");
    }
}

public class Main {
    public static void main(String[] args) {
        Mother obj1 = new Mother();
        obj1.show(); 

        Child obj2 = new Child();
        obj2.show(); 

        Mother m1 = new Child();
        m1.show(); 
    }
}
