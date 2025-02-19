class SuperClass {
    private int privateVar = 100; 

    
    public int getPrivateVar() {
        return privateVar;
    }
}


class SubClass extends SuperClass {
    public void display() {
    
        

        
        System.out.println("Accessing private variable through getter: " + getPrivateVar());
    }
}


public class superclasspvt {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}