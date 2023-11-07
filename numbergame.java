import java.util.Scanner;
 import java.util.Random;
public class numbergame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        System.out.println("welcome! to number guessing game ");
        int number=rand.nextInt(1,100);
        int chance=9;
        int win=0;
        int playagain=1;
        while(playagain==1){
        for(int i=1;i<=chance;i++){
            System.out.println("Enter your guess Number");
            int guess=sc.nextInt();
            if(guess>number)
            System.out.println("Too High");
             else if(guess<number)
            System.out.println("Too Low");
            else
            { System.out.println("You Guess it right victory!! ");
              win++;
            break;
          
            }
        }
         if(chance==9){
            System.out.println("Sorry!! You Loose "+" Right number is="+number);
         }
         System.out.println("do you want to playagain?(1/0) 1 means yes 0 means no");
        int s=sc.nextInt();
         if(s==1)
             playagain=1;
         else if(s==0)
         {playagain=0;
        break;}
         else
         System.out.println("choose between 1/0");
        }
         System.out.println("Your total wins are="+win);
    }
}
