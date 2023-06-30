import java.util.Scanner;

public class multiplicationTable {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number");
        int num = scanner.nextInt();
        scanner.close();

        for(int i=1; i<=10; i++){

            System.out.println(num + " x "+ (i) + " = "+ (num*(i)));

        }

    }
  
}

