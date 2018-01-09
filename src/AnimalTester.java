import java.util.ArrayList;

public class AnimalTester {

    public static void main(String[] args){

        Animal fish = new Fish("2","orange","gold-fish",2,1);
        Animal mammal = new Mammal("6","grey","elephant",2000,100);
        Animal bird = new Bird("10","green","parrot",10,3);

        ArrayList<Animal> alist = new ArrayList<Animal>();

        alist.add(fish);
        alist.add(mammal);
        alist.add(bird);

        System.out.println("Intial weight:\n");
        for(Animal item : alist){


            if(item instanceof Fish){
                System.out.println("\tFish: "+ item.output());
                Fish fishItem = (Fish) item;
                fishItem.swim();
                System.out.println("\tSwimming: "+fishItem.output());
                fishItem.swim();
                System.out.println("\tFinal Weight: "+fishItem.output());


            }
            if(item instanceof Mammal){
                System.out.println("\n\n\tMammal: "+ item.output());
                Mammal mammalItem = (Mammal) item;
                mammalItem.run();
                mammalItem.run();
                mammalItem.run();
                System.out.println("\trunning: "+item.output());


            }
            if(item instanceof Bird){
                System.out.println("\n\n\tBird: "+ item.output());
                Bird birdItem = (Bird) item;
                birdItem.fly();
                birdItem.fly();
                birdItem.fly();
                birdItem.fly();
                birdItem.fly();
                System.out.println("\tflying: "+item.output());
            }
        }

    }//main end
}//class end
