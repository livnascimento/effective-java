package adoption.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalTest {

    @Test
    public void shouldCreateDogCorrectly() {
        Animal dog = Dog.of("Dog", "Rex", "Male", "Large", "Brown");

        assertEquals("Dog", dog.getType());
        assertEquals("Rex", dog.getName());
        assertEquals("Male", dog.getGender());

        assertTrue(dog instanceof Dog);
        Dog d = (Dog) dog;
        assertEquals("Large", d.getSize());
        assertEquals("Brown", d.getFurColor());
    }

    @Test
    public void shouldCreateCatCorrectly() {
        Animal cat = Cat.of("Cat", "Mimi", "Female", "White", "Short");

        assertEquals("Cat", cat.getType());
        assertEquals("Mimi", cat.getName());
        assertEquals("Female", cat.getGender());

        assertTrue(cat instanceof Cat);
        Cat c = (Cat) cat;
        assertEquals("White", c.getFurColor());
        assertEquals("Short", c.getFurType());
    }

    @Test
    public void shouldCreateBirdCorrectly() {
        Animal bird = Bird.of("Bird", "Loro", "Male", FeatherType.CONTOUR);

        assertEquals("Bird", bird.getType());
        assertEquals("Loro", bird.getName());
        assertEquals("Male", bird.getGender());

        assertTrue(bird instanceof Bird);
        Bird b = (Bird) bird;
        assertEquals(FeatherType.CONTOUR, b.getFeatherType());
    }

}
