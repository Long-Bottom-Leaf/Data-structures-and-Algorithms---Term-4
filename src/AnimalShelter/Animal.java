package AnimalShelter;

public abstract class Animal {
    int order;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    // compare animal arrival times
    public boolean isOlder(Animal animal) {
        return this.order < animal.getOrder();
    }
}
