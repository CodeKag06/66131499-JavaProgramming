package qlHocSinh_NPK;

import java.util.Scanner;


public class Run {

	public static void main(String[] args) {
		// 2.a Tao moi 2 hoc sinh, hard-core du lieu
		
		HocSinh hs1 = new HocSinh();
		
		String tenHS1 = "Tran Van A";
		hs1.setTenHS(tenHS1);
		
		short tuoiHS1 = 14;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "8A-12";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Nguyen Thi My Khiem",(short)12, "6B-5");
		// in ra mang hinh
		System.out.println(hs1.toString());
//		System.out.println(hs2.toString());
		
		System.out.println("Ten hoc sinh 2 la: " + hs2.getTenHS());
		System.out.println("Tuoi hoc sinh 2 la: " + hs2.getTuoiHS());
		System.out.println("Lop hoc sinh 2 la: " + hs2.getLopHS());
		
		//========NHAP DU LIEU TU BAN PHIM
		Scanner banPhim = new Scanner(System.in);
		// Nhap du lieu cho hs3
		HocSinh hs3 = new HocSinh();
		 // Hoi User nhap vao ten
		System.out.print("Moi nhap ten hoc sinh thu 3: ");// in ra huong da va doi
		String tenHS3 = banPhim.nextLine();
		//>> goi vao bien hs3
		hs3.setTenHS(tenHS3);
		
		System.out.print("Moi nhap tuoi hoc sinh thu 3: ");// in ra huong da va doi
		Short tuoiHS3 = banPhim.nextShort();
		//>> goi vao bien hs3
		hs3.setTuoiHS(tuoiHS3);
		
		banPhim.nextLine();
		
		System.out.print("Moi nhap lop hoc sinh thu 3: ");// in ra huong da va doi
		String lopHS3 = banPhim.nextLine();
		//>> goi vao bien hs3
		hs3.setLopHS(lopHS3);
		
		//In ra hoc sinh  ra mang hinh
		System.out.print(hs3.toString());
	}

}
