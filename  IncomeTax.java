import java.util.Scanner;
public class IncomeTax {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter annual income: ");
double income = sc.nextDouble();
double tax;
if(income <= 250000)
tax = 0;
else if(income <= 500000)
tax = (income - 250000) * 0.05;
else if(income <= 1000000)
tax = (250000 * 0.05) + (income - 500000) * 0.2;
else
tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
System.out.println("Tax to Pay: " + tax);
}
}









import java.util.Scanner;
public class IncomeTax {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter annual income: ");
double income = sc.nextDouble();
double tax;
if(income <= 250000)
tax = 0;
else if(income <= 500000)
tax = (income - 250000) * 0.05;
else if(income <= 1000000)
tax = (250000 * 0.05) + (income - 500000) * 0.2;
else
tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
System.out.println("Tax to Pay: " + tax);
}
}









import java.util.Scanner;
public class IncomeTax {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter annual income: ");
double income = sc.nextDouble();
double tax;
if(income <= 250000)
tax = 0;
else if(income <= 500000)
tax = (income - 250000) * 0.05;
else if(income <= 1000000)
tax = (250000 * 0.05) + (income - 500000) * 0.2;
else
tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3;
System.out.println("Tax to Pay: " + tax);
}
}