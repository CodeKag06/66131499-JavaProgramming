package thigk2.NguyenPhucKhang;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		// nhap du lieu tu ban phim
		Scanner banPhim = new Scanner(System.in);
		System.out.print("moi ban nhap chieu cao(don vi m): ");
		float chieuCao = banPhim.nextFloat();
		System.out.print("\nmoi ban nhap can nang(don vi kg): ");
		float canNang = banPhim.nextFloat();
		float BMI = chieuCao/canNang;
		// dua ra ket qua suc khoe
		if(BMI < 18.5) {
			System.out.print("BMI =" + BMI +" ban qua gay");
		}
		else if(BMI > 24.9) {
			System.out.print("BMI =" + BMI +" ban qua beo");
		}
		else {
			System.out.print("BMI =" + BMI +" ban qua khoe manh");
		}
	}

}
