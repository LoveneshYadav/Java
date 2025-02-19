abstract class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    abstract double computePay(int hours);
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        int daysWorked = hours / 8; 
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    double computePay(int hours) {
        return salaryRate * 40; 
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("Alice", 100);
        Worker salariedWorker = new SalariedWorker("Bob", 200);

        System.out.println("Daily Worker Pay: " + dailyWorker.computePay(40));
        System.out.println("Salaried Worker Pay: " + salariedWorker.computePay(40));
    }
}