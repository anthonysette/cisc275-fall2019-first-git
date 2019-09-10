import java.util.ArrayList;

public class Dog extends Animal{
    public Dog(String name, int legs) {
        super(name, legs);
    }

    @Override
    public String toString() {
        return "(" + name + ", " + legs + ")";
    }

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("sparky", 4));
        dogs.add(new Dog("gizmo", 3));
        dogs.add(new Dog("brownie", 4));
    }

}