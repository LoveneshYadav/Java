import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        int p;
        float r,t,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle");
        p=sc.nextInt();
        System.out.println("Enter Rate of Interest:");
        r=sc.nextFloat();
        System.out.println("Enter Time period for which you want to invest:");
        t=sc.nextFloat();
        si=(p*r*t)/100;
        System.out.println("Simple Interest is:"+si);
        sc.close();
    }
}
