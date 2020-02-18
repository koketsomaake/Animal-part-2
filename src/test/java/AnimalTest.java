import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    Dog dog = new Dog();
    Cat cat = new Cat();

    @Test
    public void TestDogSound() {
        Assert.assertEquals(dog.sound(), "Bark");
    }

    @Test
    public void TestDogEats() {
        Assert.assertEquals(dog.eats(), "Food");
    }

    @Test
    public void TestCatSound() {
        Assert.assertEquals(cat.sound(), "meow");
    }

    @Test
    public void TestCatEats() {
        Assert.assertEquals(cat.eats(), "Food");
    }
}





