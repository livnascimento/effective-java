import adoption.model.*;

public class App {
    public static void main(String[] args) {

        Animal dog = Dog.of("Dog", "Rex", "Male", "Large", "Brown");
        Animal cat = Cat.of("Cat", "Mimi", "Female", "White", "Short");
        Animal bird = Bird.of("Bird", "Loro", "Male", FeatherType.CONTOUR);

        printAnimal(dog);
        printAnimal(cat);
        printAnimal(bird);
    }

    private static void printAnimal(Animal animal) {
        System.out.println("-----");
        System.out.println("Type: " + animal.getType());
        System.out.println("Name: " + animal.getName());
        System.out.println("Gender: " + animal.getGender());

        if (animal instanceof Dog d) {
            System.out.println("Size: " + d.getSize());
            System.out.println("Fur Color: " + d.getFurColor());
        } else if (animal instanceof Cat c) {
            System.out.println("Fur Color: " + c.getFurColor());
            System.out.println("Fur Type: " + c.getFurType());
        } else if (animal instanceof Bird b) {
            System.out.println("Feather Type: " + b.getFeatherType());
        }
    }
}
