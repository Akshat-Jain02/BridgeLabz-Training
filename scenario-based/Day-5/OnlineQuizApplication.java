/* Online Quiz Application 
Ask 5 questions (MCQs) from a user.
1. Use arrays and for-loop.
2. Record score.
3. Switch for answer checking. Apply clear indentation and structured layout. */

import java.util.Scanner;

public class OnlineQuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int correctCount = 0;

        //Storing the questions in an array
        String[] questions = { "1. What is the largest ocean on earth?",
                               "2. What is the process by which plants make their food? ",
                               "3. Which planet is known as the Red Planet? ",
                               "4. Which is the largest mammal on Earth?",
                               "5. Who was the first Prime Minister of India?"
                              };

       //Storing the options for the question
       String[][] options = { {"a). Atlantic Ocean" , "b). Indian Ocean", "C). Pacific Ocean" , "d). Arctic Ocean"},
                              {"a). Respiration" , "b). Digestion", "c). Transpiration" ,"d). Photosynthesis"},
                              {"a). Earth" , "b). Jupiter", "c). Mars" , "d). Venus"},
                              {"a). Elephant ", "b). Giraffe", "c). Hippopotamus" , "d). Blue Whale"},
                              {"a). Mahatma Gandhi", "b). Jawaharlal Nehru" ,"c). Sardar Vallabhbhai Patel", "d). Lal Bahadur Shastri"}
                             };

       //Storing the correct option
       char[] correctOptions = {'c','d','c','d','b'};

       System.out.println("\n----------------Welcome to the quiz game------------");
       for (int i = 0; i < questions.length; i++) {
           boolean isCorrect = false;

           System.out.println("\n" + questions[i]);

           for (String option: options[i]) {
               System.out.println("\n" + option);
           }

           char choice;
           do {
               System.out.println("Enter your choice : ");
               choice = sc.next().toLowerCase().charAt(0);
           } while (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd');

           switch (choice) {
               case 'a' -> {
                   if (correctOptions[i] == 'a') {
                       System.out.println("-------------------------\nYour answer is correct !!");
                       correctCount++;
                   } else {
                       System.out.println("--------------------------\n!WRONG ANSWER");
                   }
               }

               case 'b' -> {
                  if (correctOptions[i] == 'b') {
                       System.out.println("--------------------------\nYour answer is correct !!");
                       correctCount++;
                  } else {
                       System.out.println("---------------------------\n!WRONG ANSWER");
                  }
              }

               case 'c' -> {
                  if (correctOptions[i] == 'c') {
                       System.out.println("---------------------------\nYour answer is correct !!");
                       correctCount++;
                  } else {
                       System.out.println("----------------------------\n!WRONG ANSWER");
                  }
              }

              case 'd' -> {
                  if (correctOptions[i] == 'd') {
                       System.out.println("-----------------------------\nYour answer is correct !!");
                       correctCount++;
                  } else {
                       System.out.println("------------------------------\n!WRONG ANSWER");
                  }
              }


           }

          
       } 

        //Printing the final result
        System.out.println("==============SCORE===============");
        System.out.println("\nNo of correct answers is : " + correctCount);
        System.out.println("\n==================================");

        sc.close();

    }
}