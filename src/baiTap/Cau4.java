package baiTap;

import java.util.Scanner;

public class Cau4 {

	public static final int N = 5;
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		System.out.println("Nhập vào 5 số: ");
		for (int i = 0; i < N; i++) {
			a += scanner.nextInt();
		}
		int trungBinh = (int)a/N;
		
		String ketQua = "Trung bình là: " + trungBinh;
		System.out.println(ketQua);
	}
	
}
