class One {
    One(int x) {
        System.out.println("Constructor of One with value: " + x);
    }
}

class Two extends One {
    Two(int x) {
        super(x);
        System.out.println("Constructor of Two with value: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        One obj1 = new One(10); 
        Two obj2 = new Two(20); 
    }
}
