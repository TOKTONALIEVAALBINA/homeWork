public class Main {
    public static void main(String[] args) {

   Parrot parrot = new Parrot();

   parrot.setName("Aris");
   parrot.setAge(3);
   parrot.setColor("yellow");
   parrot.speak();
   parrot.jump();

        System.out.println(parrot.getName() + ", " + parrot.getAge() + ", " + parrot.getColor());

        System.out.println("--------------------------------");

        Fish fish = new Fish();

        fish.setName("Nemo");
        fish.setAge(2);
        fish.setColor("blue");
        fish.setWeight(1.2);
        fish.swim();
        fish.sleep();

        System.out.println(fish.getName() + ", " + fish.getAge() + ", " + fish.getWeight() + ", " + fish.getColor());

        System.out.println("-------------------------------");

        Dog dog = new Dog();
        dog.setName("Jack");
        dog.setAge(5);
        dog.setWeight(10.4);
        dog.setColor("braun");
        dog.setHeight(0.80);
        dog.lick();
        dog.bark();
        dog.guard();
        System.out.println(dog.getName() + ", " + dog.getAge() + ", " + dog.getColor() + " ," + dog.getWeight() + ", " + dog.getHeight());

    }



}