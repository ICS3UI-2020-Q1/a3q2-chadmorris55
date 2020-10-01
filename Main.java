import java.util.Scanner;

/** 
 *Tells the user what animal 
 * @Chad 
 */
public class Main {
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    //asks user if the animal has feathers
    System.out.println("Does the animal have feathers?");
    String feathers = input.nextLine();
    if (feathers.equals ("yes")){
       System.out.println("Does the animal swim");
       String swims = input.nextLine();
       if (swims.equals ("yes")){
         System.out.println("This is a duck");
       }else if(swims.equals ("no")){
        System.out.println("This is a hen");
      }

    }else if(feathers.equals ("no")){
       System.out.println("Does the animal  have legs");
       String legs = input.nextLine();
       if (legs.equals("yes")){
         System.out.println("This is a lizard");
      }else{
        System.out.println("This is a snake");
      }
    }




  }
}

