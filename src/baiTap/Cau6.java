package baiTap;

import java.util.Scanner;

/**
 * Tỉ giá VND-USD là: 23.500đ. Viết chương trình nhập vào USD và tính ra VND
 */
public class Cau6 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tiGia = 23500;
		System.out.print("Xin hãy nhập vào USD: ");
		long usd = scanner.nextLong();
		long vnd = usd * tiGia;
		
		String ketQua = "Giá VNĐ là: " + vnd + " VNĐ";
		System.out.println(ketQua);
	}
	
}
