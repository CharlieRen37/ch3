import java.util.Scanner;




public class Temperature{
	public static void main(String[] args){
		final double C_TO_F = 1.8;
		Scanner in = new Scanner(System.in);
		System.out.print("Degrees in Celsius: ");
		double C = in.nextDouble();
		double F = C * C_TO_F +32;
		//System.out.print(C + " C = " + F + " F");
		System.out.printf("%.1f C = %.1f F", C, F);
	}
}
