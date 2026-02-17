// You should **not** update any call signatures in this file
// only modify the body of each function

import java.util.Scanner; // Import the Scanner class, allows taking in inputs

class Conversation implements ConversationRequirements {

  // Attributes 
  
  /**
   * Constructor 
   */
  Conversation() {
    
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    Scanner input = new Scanner(System.in);

    // Prompt the user for the number of rounds
    System.out.print("How many rounds? ");

    // Read the integer input from the user
    int rounds = input.nextInt();

    // ADD THIS LINE to "clean" the buffer
    input.nextLine(); 

    //Starts the conversation
    System.out.println("Hi there! What's on your mind?");
    
    // The for Loop condition checks the counter against the user input
    for (int i = 0; i < rounds; i++) {
         String userResponse = input.nextLine();
         if(i == rounds - 1){
          // reaches maxed amount of rounds
          System.out.println("See ya!");
         } else{
          // get it to have a random response
          System.out.println("Oh that's cool!");
         }

    }
  }
  
  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {

  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = ""; 
    return returnString; 
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
