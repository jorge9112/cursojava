package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String args[]){

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Ingresa tu salario:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Ingresa el numero de años con su empleador actual:");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary && years >= requiredYearsEmployed){
                System.out.println("Felicitaciones, califica para el prestamo");

        }
        else{
            System.out.println("Sorry, you must earn at least $"
            + requiredSalary + " to qualify for the loan");
        }

    }
}
