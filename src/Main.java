import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        boolean output = false;


        System.out.println("Please enter a number");
        input = scan.nextInt();
        for(int i = 1; i <= input; i++){
            if(i * i == input){
                output = true;
                break;
            }
        }
        System.out.println("It is" + output);
    }
}