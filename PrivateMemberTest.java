// Superclass
class Parent {
    private int privateData = 42; // Private member

    // Public getter method to access private data
    public int getPrivateData() {
        return privateData;
    }
}

// Subclass
class Child extends Parent {
    public void display() {
        // System.out.println(privateData); // ❌ Compilation Error (privateData is not accessible)
        System.out.println("Accessing private data via method: " + getPrivateData()); // ✅ Allowed
    }
}

// Main class
public class PrivateMemberTest {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}