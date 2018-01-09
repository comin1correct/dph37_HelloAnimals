public class Mammal extends Animal{

    public Mammal(String age, String color, String type, int weight, int minimumWeight){
        super(age,color,type,weight,minimumWeight);
    }

    public void run(){
        if(this.getWeight() <=2){
            System.out.printf("\t**** Unable to move, weight is to low: %s ****\n",this.getWeight());
        }
        else {
            int temp = this.getWeight();
            this.setWeight((temp - 2));
        }
    }
}
