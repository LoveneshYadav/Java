import java.util.Scanner;

abstract class TrunkCall {
    protected int duration;
    
    public TrunkCall(int duration) {
        this.duration = duration;
    }

    abstract double calculateCharge();
}

class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int duration) {
        super(duration);
    }

    @Override
    double calculateCharge() {
        return duration * 1.0;
    }
}

class UrgentCall extends TrunkCall {
    public UrgentCall(int duration) {
        super(duration);
    }

    @Override
    double calculateCharge() {
        return duration * 1.5;
    }
}

class LightningCall extends TrunkCall {
    public LightningCall(int duration) {
        super(duration);
    }

    @Override
    double calculateCharge() {
        return duration * 2.0;
    }
}

public class TrunkCallTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter call duration (minutes): ");
        int duration = scanner.nextInt();
        System.out.print("Enter call type (Ordinary/Urgent/Lightning): ");
        String type = scanner.next();
        
        TrunkCall call;
        switch (type.toLowerCase()) {
            case "ordinary": call = new OrdinaryCall(duration); break;
            case "urgent": call = new UrgentCall(duration); break;
            case "lightning": call = new LightningCall(duration); break;
            default: System.out.println("Invalid type!"); return;
        }
        
        System.out.println("Total Charge: " + call.calculateCharge());
        scanner.close();
    }
}