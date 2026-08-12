import java.util.Scanner;

class ScannerDemo 	
{
    	public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int num = sc.nextInt();

        System.out.print("Enter Decimal Number: ");
        double d = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + d);
        System.out.println("City: " + city);
    	}
}