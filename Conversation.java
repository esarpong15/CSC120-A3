// You should **not** update any call signatures in this file
// only modify the body of each function

import java.util.Scanner; // Import the Scanner class, allows taking in inputs
import java.util.ArrayList;

class Conversation implements ConversationRequirements {

  // Attributes 
  ArrayList<String> transcript;
  /**
   * Constructor 
   */
  

  Conversation() {
  transcript = new ArrayList<>();
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
    this.transcript.add("Hi there! What's on your mind?");
    
    // The for Loop condition checks the counter against the user input
    for (int i = 0; i < rounds; i++) {
         String userResponse = input.nextLine();
         this.transcript.add(userResponse);

         if(i == rounds - 1){
          // reaches maxed amount of rounds
          System.out.println("Mmm-hm\nSee ya!");
          this.transcript.add("Mmm-hm\nSee ya!");
         } else{
          // get it to have a random response
          System.out.println(respond(userResponse));
          this.transcript.add(respond(userResponse));
         }
         
    }
  }
  
  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {
  System.out.println();
  System.out.println("TRANSCRIPT: ");
  for (int i = 0; i < this.transcript.size(); i++) {
      System.out.println(this.transcript.get(i));
  }
  System.out.print("```");
  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = ""; 

    // Static array of canned responses
    String [] chatResponse = {"Oh that's cool!","Tell me more", "I see", "That's interesting", "Right"};
    // Pick a random response from the static array
    int index = (int) (Math.random() * chatResponse.length);

    returnString = chatResponse[index];
    
    return returnString; 
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
