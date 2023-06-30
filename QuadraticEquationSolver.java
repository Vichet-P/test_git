import java.util.Scanner;
public class QuadraticEquationSolver {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a : ");
        double a = scanner.nextDouble();
        System.out.println("Input b : ");
        double b = scanner.nextDouble();
        System.out.println("Input c : ");
        double c = scanner.nextDouble();
        scanner.close();

        double discriminant = (b*b)-(4*a*c);

        if (discriminant > 0) {

            double r1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2*a);

            System.out.println("The root of QuadraticEquation are : \nr1 = "+r1+"\nr2 = "+r2);

        }
        else if(discriminant==0){
            double root = -b/(2*a);

            System.out.println("The root of Quadratic is : "+root);

        }
        else{
            System.out.println("The quadratic has no root!!!");
        }


    }

}
