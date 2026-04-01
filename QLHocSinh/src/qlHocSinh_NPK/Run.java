package qlHocSinh_NPK;

import java.util.ArrayList;
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
		
		HocSinh hs2 = new HocSinh("Xuan Mai Lon Ton",(short)12, "6B-5");
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
		System.out.print("\nMoi nhap ten hoc sinh thu 3: ");// in ra huong da va doi
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
		System.out.print("\n" + hs3.toString());
		
		//Nhap danh sach N hoc sinh
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		//Nhap N
		System.out.print("\nnhap so luong N hoc sinh trong danh sach: ");
		int N = banPhim.nextInt(); // nhap N tu ban phim
		
		banPhim.nextLine();
		
		for(int i = 1; i<N+1; i++) {
			// Nhap du lieu cho hs thu i
			HocSinh hsi = new HocSinh();
			 // Hoi User nhap vao ten
			System.out.print("Moi nhap ten hoc sinh thu " + i + " :");// in ra huong da va doi
			String tenHSi = banPhim.nextLine();
			//>> goi vao bien hsi
			hsi.setTenHS(tenHSi);
			
			System.out.print("Moi nhap tuoi hoc sinh thu " + i + " :");// in ra huong da va doi
			Short tuoiHSi = banPhim.nextShort();
			//>> goi vao bien hsi
			hsi.setTuoiHS(tuoiHSi);
			
			banPhim.nextLine();
			
			System.out.print("Moi nhap lop hoc sinh thu " + i + " :");// in ra huong da va doi
			String lopHSi = banPhim.nextLine();
			//>> goi vao bien hsi
			hsi.setLopHS(lopHSi);
			
			//Dua vao danh sach
			dsHocSinh.add(hsi);
		}
		//In ra
		for (int i=0; i<dsHocSinh.size(); i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		
		//4a================
		// Bổ sung thêm
		HocSinh hsThem = new HocSinh();
		 // Hoi User nhap vao ten
		System.out.print("\nMoi nhap ten hoc sinh them: ");// in ra huong da va doi
		String tenHSThem = banPhim.nextLine();
		//>> goi vao bien hsThem
		hsThem.setTenHS(tenHSThem);
		
		System.out.print("Moi nhap tuoi hoc sinh them: ");// in ra huong da va doi
		Short tuoiHSThem = banPhim.nextShort();
		//>> goi vao bien hsThem
		hsThem.setTuoiHS(tuoiHSThem);
		
		banPhim.nextLine();
		
		System.out.print("Moi nhap lop hoc sinh them: ");// in ra huong da va doi
		String lopHSThem = banPhim.nextLine();
		//>> goi vao bien hsThem
		hsThem.setLopHS(lopHSThem);
		
		//them vao ds
		dsHocSinh.add(hsThem);
		//Xuat ra
		for (int i=0; i<dsHocSinh.size(); i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		
		//5a.
		//Tim hoc sinh ten Hoa dau tien trong danh sach
		for(int i=0;i<dsHocSinh.size();i++) {
			HocSinh hsTim = dsHocSinh.get(i);
			if (hsTim.getTenHS().equals("Hoa")) {
				dsHocSinh.remove(hsTim);
				break;
			}
		}
		for (int i=0; i<dsHocSinh.size(); i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
	}

}
