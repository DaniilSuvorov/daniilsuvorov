package day11.task1;


public class Courier implements Worker {
    private int salary;
     boolean isPayed;
    private Warehouse warehouse;

    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }


    public String toString() {
        return "Курьер: заработная плата - " + salary + ", бонус - " + isPayed;
    }

    public void doWork() {
        salary += 100;
        warehouse.increaseCountDeliveredOrders();
    }


    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() >= 10000){
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}


