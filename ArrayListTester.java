import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTester
{
   public static void main(String[] args)
   {
       System.out.print("How many words?");
       Scanner scan = new Scanner(System.in);
       int numWords = scan.nextInt();
       System.out.println(numWords);
       ArrayList<String> words = new ArrayList<String>();
       System.out.println(words.size());
       words.add("fun");
       words.add("work");
       words.add(0, "sleep");
       System.out.println(words.size());
       words.remove(0);
       System.out.println(words);
   }
}
