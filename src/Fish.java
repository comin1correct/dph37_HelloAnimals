public class Fish extends Animal{

    //constructor
    public Fish(String age, String color, String type, int weight, int minimumWeight){
        super(age, color, type, weight, minimumWeight);
    }

    public void swim(){

        if(this.getWeight() <=1){
            System.out.printf("\t**** Unable to move, weight is to low: %s ****\n",this.getWeight());
        }
        else {
            int temp = this.getWeight();
            this.setWeight(--temp);
        }
    }
}

