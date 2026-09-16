import java.util.Scanner;




public class ConvertTime{
	public static void main(String[] args){
		final double S_TO_M = 60;
		final double S_TO_H = 3600;
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Seconds: ");
		double Sec = in.nextDouble();
		int Hour = Sec / S_TO_H;
		int RemH = Sec % S_TO_H;
		int Min = RemH / S_TO_M;
		int RemM = RemH % S_TO_M;
		System.out.print(Hour + Min + RemH);
	}
}
