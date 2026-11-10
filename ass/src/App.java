import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // if else : 

        // level 1 : 
        System.out.print("Enter a number : ");
        int num0 = input.nextInt();
        if (num0 % 2 == 0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }


        System.out.print("enter the number of days to return : ");
        int x = input.nextInt();
        if (x > 0){
            System.out.println("late --- A fine applies");
        }
        else {
            System.out.println("Retured on time");
        }
        // level 2 :
        System.out.print("enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("enter the second number : ");
        int num2 = input.nextInt();
        System.out.print("enter the third number : ");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3 ){
            System.out.println("the largest number is " + num1);
        }
        else if (num2 > num1 && num2 > num3 ){
            System.out.println("the largest number is " + num2);
        }
        else if (num3 > num1 && num3 > num2 ){
            System.out.println("the largest number is " + num3);
        }
        else {
            System.out.println("all the numbers are both ");
        }
        // level 3 : 
        System.out.println("1.red");
        System.out.println("2.green");
        System.out.println("3.yellow");
        System.out.print("Enter the light color :");
        int color = input.nextInt();
        switch (color){
            case 1 :
                System.out.println("Stop");
                break;

            case 2 :
                System.out.println("Go");
                break;

            case 3 :
                System.out.println("Get ready");
                break;

            default:
                System.out.println("ivalied color");
        }
        // level 4 :
        System.out.print("Player 1: ");
        String p1 = input.next().toLowerCase();
        System.out.print("Player 2: ");
        String p2 = input.next().toLowerCase();
        if ((!p1.equals("rock") && !p1.equals("paper") && !p1.equals("scissors")) || (!p2.equals("rock") && !p2.equals("paper") && !p2.equals("scissors"))) {
            System.out.println("Invalid Input");
        }
        else if (p1.equals(p2)) {
            System.out.println("Draw");
        }
        else if ((p1.equals("rock") && p2.equals("scissors")) || (p1.equals("paper") && p2.equals("rock")) || (p1.equals("scissors") && p2.equals("paper"))) {
            System.out.println("Player 1 Wins");
        }
        else {
            System.out.println("Player 2 Wins");
        }







        // looping 

        // level 1 : 
        System.out.print("Enter a Number (1-26): ");
        int n = input.nextInt();
        if (n >= 1 && n <= 26) {
            for (int i = 0; i < n; i++) {
                System.out.print((char)('A' + i) + " ");
            }
        } else {
            System.out.println("Invalid Input");
        }
        // level 2 : 
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) { 
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels = " + count);
        // level 3 : 
        System.out.print("Enter  a number : ");
        int n0 = input.nextInt();
        int num = 1;
        for (int i = 1; i <= n0; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        // level 4 : 
        System.out.print("Enter a number : ");
        int n1 = input.nextInt();
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
