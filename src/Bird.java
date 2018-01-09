public class Bird extends Animal {

    public Bird(String age, String color, String type, int weight, int minimumWeight){
        super(age, color, type, weight, minimumWeight);
    }

    public void fly() {
        if (this.getWeight() <= 2) {
            System.out.printf("\t**** Unable to move, weight is to low: %s ****\n", this.getWeight());
        } else {
            int temp = this.getWeight();
            this.setWeight((temp - 2));
        }
    }
}
