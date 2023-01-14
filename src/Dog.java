public class Dog {

    private String name;
    private int age;
    private String color;
    private double weight;
    private double height;

    public void bark (){
        System.out.println("dog is barking");
    }
    public void guard (){
        System.out.println("dog is guarding");
    }
    public void lick (){
        System.out.println("dog is licking");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
