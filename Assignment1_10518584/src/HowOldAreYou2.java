import java.util.Scanner;

public class HowOldAreYou2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting)");
        name=input.nextLine();
        
        System.out.println("What's up, " + name + ", how old are you?");
        age=input.nextInt();
        System.out.println();
        
        if (age<16)
        {
           System.out.println("You can't drive, "+name+"."  );
        }
        
        else if (age==16 || age==17)
        {
           System.out.println("You can drive but you can't vote, "+ name+"." );
        }
        
        else if(age>=18 && age<25)
        {
           System.out.println("You can vote but not rent a car, "+ name+"." );
        }
        
        if(age>25)
         {
           System.out.println("You can do pretty much anything, "+ name+"." );

        }
    }
}