package baiTap;

import java.util.Scanner;

public class Cau4 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 5;		
		int a = 0;
		System.out.println("Nhập vào 5 số: ");
		for (int i = 0; i < n; i++) {
			a += scanner.nextInt();
		}
		int trungBinh = (int)a/n;
		
		String ketQua = "Trung bình là: " + trungBinh;
		System.out.println(ketQua);
	}
	
}
