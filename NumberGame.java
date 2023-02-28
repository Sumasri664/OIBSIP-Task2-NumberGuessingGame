import java.util.Scanner;
public class NumberGame {
    public static void Ready()
    {
        Scanner sc = new Scanner(System.in);
        int K = 5,i,guess;
        String Playagain="y";
        while(Playagain.equals("y")){
          int num = 1 + (int)(100 * Math.random());
          int score=100;
          System.out.println( "A num is chosen" + " between 1 to 100." + "Guess the num" + " within 5 trials.");
          for (i = 0; i < K; i++) {
              System.out.println("Guess the num:"); //we need to guess the num
              guess = sc.nextInt();
              if (num == guess) {
                  System.out.println("Congratulations!"+ " You guessed the num.your score:"+(score-(i*15)));
                  System.out.println("Want to Play again?(y/n)");
                  Playagain =sc.next();
                  break;
                }
                else if (num > guess && i != K - 1) {
                System.out.println("The num is " + "greater than " + guess);
               }
               else if (num < guess && i != K - 1) {
                System.out.println("The num is" + " less than " + guess);
               }
            }
            if (i == K) {
              System.out.println("Oops! Completed " + " 5 trials.");
              System.out.println("The num was " + num+", your score: 0");
              System.out.println("Likes to Play again?(y/n)");
              Playagain =sc.next();
            }
        }
        System.out.println("Thanks for playing..");
    }
    public static void main(String arg[])
    {
        Ready();
    }
}