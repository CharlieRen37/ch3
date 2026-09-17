import java.util.Scanner;




public class ConvertTime{
	public static void main(String[] args){
		final int S_TO_M = 60;
		final int S_TO_H = 3600;
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Seconds: ");
		int Sec = in.nextInt();
		int Hour = Sec / S_TO_H;
		int RemH = Sec % S_TO_H;
		int Min = RemH / S_TO_M;
		int RemM = RemH % S_TO_M;
		//System.out.print(Hour + " Hours, " + Min + " Minutes, " + RemM + " Seconds");
		System.out.printf("%d Hours, %d Minutes, %d Seconds", Hour, Min, RemM);
	}
}
