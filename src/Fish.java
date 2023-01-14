public class Fish {

    private String name;
    private int age;
    private double weight;
    private String color;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void setAge (int age){
        this.age = age;
    }
    public int getAge (){
        return age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setColor (String color){
        this.color = color;
    }
    public String getColor (){
        return color;
    }
    public void swim(){
        System.out.println("fish is swimming");
    }
    public void sleep (){
        System.out.println("fish is sleeping");
    }
}
