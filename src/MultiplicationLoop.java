import java.util.Scanner;

public class MultiplicationLoop {
    public static void main(String[] args){
        int x=0;

        System.out.println("Enter number table you want ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        while (x < 10)
        {
            x++;
            int result = number * x;
            System.out.println(number +"*"+ x +"="+ result  );
        }
    }
}
