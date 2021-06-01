public class Motorbike extends Vehicle {
    private String capacity;

    public Motorbike(String owner, String mark, String model, String year, String color, double price, String capacity) {
        super(owner, mark, model, year, color, price);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike " + super.toString() +
                ", capacity = '" + capacity + '\'' +
                "} " + "\n";
    }
}
