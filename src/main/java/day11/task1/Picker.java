package day11.task1;

public class Picker implements Worker {
     private int salary;
     private boolean isPayed;
     private Warehouse warehouse;

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
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

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public String toString() {
        return "Сборщик: заработная плата - " + salary + ", бонус - " + isPayed;
    }

    public void doWork() {
        salary += 80;
        warehouse.increaseCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (isPayed){
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() >= 10000){
            salary += 70000;
            isPayed = true;
        } else {
            System.out.println("Бонус пока не доступен");
        }

    }
}
