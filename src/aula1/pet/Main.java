package aula1.pet;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("dog", "Shesheu", 2, 1.5f, "woof woof");
        Pet pet2 = new Pet("fish", "Nemo", 1, 0.14f, "blub blub");
        Pet pet3 = new Pet("cat", "Snow", 3, 0.5f, "meow meow");

        System.out.println("O " + pet1.name + " é um " + pet1.type + ", tem " + pet1.age + " anos, come " +
                pet1.amtFood + "kg de comida e faz " + pet1.sound + ".");
    }
}
