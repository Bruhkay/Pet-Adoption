import java.util.ArrayList;
import java.util.Scanner;

public class animals {
    ArrayList<animals> animals;
    Scanner in = new Scanner(System.in);
    int choice = 0;
    boolean shouldClosed = false;

    private String name;
    private int age;
    private String color;
    private String gender;
    private boolean isDisable;
    private int aggression;
    private int activity;
    private int monthlyCost;
    
    animals(){
        animals = new ArrayList<animals>();
    }
    public void addAnimal(){
        while( !shouldClosed){    
            animalsList();
            if(in.hasNextInt()){    
                
                choice = in.nextInt();
                if( choice == 1){
                    getInformation();
                    cat animal1 = new cat(name, age, color, gender, isDisable, aggression, activity, monthlyCost);
                    animals.add(animal1);
                }
                else if( choice == 2){
                    getInformation();
                    dog animal1 = new dog(name, age, color, gender, isDisable, aggression, activity, monthlyCost);
                    animals.add(animal1);
                }
                else if( choice == 3){
                    getInformation();
                    snake animal1 = new snake(name, age, color, gender, isDisable, aggression, activity, monthlyCost);
                    animals.add(animal1);              
                }
                else if( choice == 4){
                    shouldClosed = true;
                    System.out.println("\n" + "animal added" + "\n" );
                }
                else{
                    System.out.println("\n invalid char. Please try again ");
                }
            }
        }
    }

    public void getInformation(){
        in.nextLine();
        System.out.println(" enter name: ");
        name = in.nextLine();
        System.out.println(" enter age: ");
         age = in.nextInt();
        System.out.println(" enter color");
        in.nextLine();
         color = in.nextLine();
        System.out.println(" enter gender");
         gender = in.nextLine();
        System.out.println(" is disable true or false; ");
         isDisable = in.nextBoolean();
        System.out.println(" agression out of 10?:  ");
         aggression = in.nextInt();
        System.out.println(" activity out of 10?:  ");
         activity = in.nextInt();
        System.out.println(" monthly cost: ");
        monthlyCost = in.nextInt();
    }
    public void animalsList(){
        System.out.println("1- Cat");
        System.out.println("2- Dog");
        System.out.println("3- Snake");
        System.out.println("4- exit");
    }
}
