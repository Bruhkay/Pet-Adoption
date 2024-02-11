import java.util.Scanner;

/**
 * application
 */
public class application {
    public static int amount = 0 ;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        animals animalsList = new animals();

        boolean shouldClosed = false;
        int choice = 0;

        while( !shouldClosed){
            menu(); //displays the menu
            if(in.hasNextInt()){    
                choice = in.nextInt();
                if( choice == 1){
                    System.out.println(animalsList.animals);
                }
                else if( choice == 2){
                    //TODO
                }
                else if( choice == 3){
                    
                    animalsList.addAnimal();
                }
                else if( choice == 4){
                    //TODO
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
    public static void menu(){
        System.out.println("\n" + "Select an operation:");
        System.out.println("1- Search an animal");
        System.out.println("2- Adopt an animal");
        System.out.println("3- Publish an animal");
        System.out.println("4- Find the sum of the array");
        System.out.println("5- Exit");
    }
    
}