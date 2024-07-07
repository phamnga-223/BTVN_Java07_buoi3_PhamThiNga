package baiTap;

import java.util.Scanner;

/**
 * Câu 1: Tính chiều dài cạnh huyền của 1 tam giác vuông khi biết 2 cạnh góc vuông
 */
public class Cau1 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 2 cạnh góc vuông: ");
		System.out.print("Cạnh a = ");
		int canhA = scanner.nextInt();
		System.out.print("Cạnh b = ");
		int canhB = scanner.nextInt();
		double canhHuyen = Math.sqrt(Math.pow(canhA, 2) + Math.pow(canhB, 2));
		
		String ketQua = String.format("Cạnh huyền = %s", canhHuyen);
		System.out.println(ketQua);
	}
	
}
