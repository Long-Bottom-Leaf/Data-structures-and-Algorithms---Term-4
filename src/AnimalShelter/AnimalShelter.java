package AnimalShelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

    // initialize lists
    private Queue<Dog> dogs = new LinkedList<>();
    private Queue<Cat> cats = new LinkedList<>();
    private int order = 0;  // initial order

    // add animal
    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.add((Dog) animal);

        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }

}
