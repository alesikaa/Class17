package Class17;

public class DogTester {
    public static void main(String[] args) {
        Dog husky = new Dog("Husky", "Husky the dog", "white", 2, 25.3);
        husky.printInfo();
        Dog bulldog = new Dog("Bulldog", "Bulldog the dog", "black", 3, 27.2);
        bulldog.printInfo();
        Dog labrador = new Dog("Labrador", "Labrador the dog", " Brown", 5, 30.5);
        labrador.printInfo();
    }
}

