//By Nicholas and Atef
import java.io.*;
import java.util.*;
public class text {
   Scanner input = new Scanner(System.in);
   String text = "";
   int num = 0;
   public void chat() 
      {
      String[] impact = new String[6];
      impact[0] = "With the games on the internet internet we can communicate with our friends!";
      impact[1]= "Not only that, but we can relief stress with the online games.";
      impact[2] = "This made us and our friends increase bond's with eachother and help strengthen our friendship!";
      impact[3] = "We can also play with other people from around the world and have fun with other people!";
      impact[4] = "The chat in the online games help for some strategy.";
      impact[5] = "These online games help make us smarter by helping our brain in some areas of it.";
      System.out.println("Hit enter to see how video games impacted us on the internet at end of each sentence!");
      for(int i = 0; i < 6; i++)
         {
            text = input.nextLine();
            num = text.length();
            if(num == 0)
            {
               System.out.println(impact[i]);
            }
         }
      }
      
   public static void main(String args[])
      {
         new text().chat();
   
      }
         }
      