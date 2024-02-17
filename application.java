import java.util.ArrayList;
import java.util.Scanner;

/**
 * application
 */
public class application {
    
    public static int amount = 0 ;
    static ArrayList<animals> animals = new ArrayList<animals>();
    static int choice = 0;
    static String name;
    static int age;
    static  String color;
    static String gender;
    static boolean isDisable;
    static   int aggression;
    static int activity;
    static   int monthlyCost;
    static   int ID;

    

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //some animals that are already exist in the shelter
        animals.add(new cat("koko", 4, "dark gray", "female", false, 2, 7,1200));
        animals.add(new cat("fiona", 2, "dark gray", "female", false, 0, 5, 1300));
        animals.add(new dog("mars", 3, "red", "female", true, 6, 7, 300));
        animals.add(new dog("coal", 5, "black", "male", false, 2, 8, 800));

        boolean shouldClosed = false;
        int choice = 0;

        while( !shouldClosed){
            menu(); //displays the menu
            if(in.hasNextInt()){    
                choice = in.nextInt();
                if( choice == 1){
                    System.out.println(animals);
                }
                else if( choice == 2){
                    System.out.println(" \n" + animals);
                    System.out.print("\n enter id: ");
                    int selection = in.nextInt();

                    ArrayList<animals> temp = new ArrayList<animals>();
                    for (animals c : animals) {
                        if(c.ID != selection){
                            temp.add(c);
                        }
                        else{
                            System.out.println("You succesfully adopted "+ c.name + "\n have a good time");
                        }
                    }
                    
                    animals = temp;
                }
                else if( choice == 3){
                    addAnimal();
                }
                else if( choice == 4){
                    System.out.println( "There are "+ animals.size() + " animals in this website \n"  );//TODO
                }
                else if( choice == 5){
                    shouldClosed = true;
                    System.out.println("\n" + "Thank u for ur attention!!!" + "\n" + "Byeee!!!!" + "\n");
                }
                else{
                    System.out.println("\n invalid char. Please try again ");
                }
            }
        }               
    }
    public static void addAnimal(){
        boolean shouldClosed = false;
        
        Scanner in = new Scanner(System.in);
        while( !shouldClosed){    
            animalsList();
            if(in.hasNextInt()){    
                
                choice = in.nextInt();
                if( choice == 1){
                    getInformation();
                    animals animal1 = new cat(name, age, color, gender, isDisable, aggression, activity, monthlyCost);
                    animals.add(animal1);
                }
                else if( choice == 2){
                    getInformation();
                    animals animal1 = new dog(name, age, color, gender, isDisable, aggression, activity, monthlyCost);
                    animals.add(animal1);
                }
                else if( choice == 3){
                    getInformation();
                    animals animal1 = new snake(name, age, color, gender, isDisable, aggression, activity, monthlyCost);
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
    public static void getInformation(){
        
        Scanner in = new Scanner(System.in);
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
    public static void animalsList(){
        System.out.println("1- Cat");
        System.out.println("2- Dog");
        System.out.println("3- Snake");
        System.out.println("4- exit");
    }
    public static void menu(){
        System.out.println("\n" + "Select an operation:");
        System.out.println("1- Search an animal");
        System.out.println("2- Adopt an animal");
        System.out.println("3- Publish an animal");
        System.out.println("4- Find the sum of the array");
        System.out.println("5- Exit");
    }   
}