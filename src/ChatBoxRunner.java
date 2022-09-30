import java.util.Scanner;


public class ChatBoxRunner {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        ChatBot debbie= new ChatBot("debbie", 17);
        System.out.print("Please state your name: ");
        String name= input.nextLine();
        debbie.greeting(name);
        debbie.weather();
        System.out.print("Enter your height in feet rounded to the nearest whole number: ");
        int feet= input.nextInt();
        System.out.println("Converted to meters: "+debbie.convertFeetToMeters(feet));
        System.out.print("What is your favorite number: ");
        int num= input.nextInt();
        debbie.favoriteNumber(num);
        System.out.println("Give me 3 numbers: ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        System.out.println("The sum of the three numbers is: "+ debbie.addNumbers(num1, num2, num3));

        debbie.cats();
        System.out.println(debbie.life(name));
        System.out.println(debbie.goodbye());


    }
}
