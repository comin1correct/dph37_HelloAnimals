public class Animal {

    //property class variables
    private String age, color, type;
    private int weight, minimumWeight;

    //constructor
    public Animal(String age, String color, String type, int weight, int minimumWeight){
        this.age = age;
        this.color = color;
        this.type = type;
        this.weight = weight;
        this.minimumWeight = minimumWeight;
    }

    private int eat(){

        return this.weight++;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight (int weight){
        this.weight = weight;
    }

    public int output(){

        return this.getWeight();
    }

}
