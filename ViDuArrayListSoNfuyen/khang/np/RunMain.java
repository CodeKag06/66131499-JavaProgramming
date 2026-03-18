package khang.np;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		//Khai báo biến danh sách, chứa các số nguyên
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		// a. Nhập 10 phần tử từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
		// Nhập 1 phân tử
		    // In ra một hướng dẫn cho người dùng
		System.out.print("mời nhập phần tử thứ " + i + ":" );
			// Cho User cất vào biến tạm
		Integer tam = banPhim.nextInt();
			// thêm vao cuối danh sách
		dsSoNguyen.add(tam);
		}
		// b. In ra màng hình danh sách vừa nhập
		System.out.println("Danh sách vừa nhập là: ");
		for (int i=0; i<dsSoNguyen.size(); i++) {
			// Lấy giá trị phân tử ở vị trí i, cất vào biến tạm
			Integer tam = dsSoNguyen.get(i);
			System.out.print(tam + " ");
		}
		System.out.print("\n");
//		for (Integer x: dsSoNguyen) {
//			System.out.print(x + " ");
//		}
		 
		//c. Đếm số phân tử chẵn
		int soLuongPTchan = 0;
		for (Integer x : dsSoNguyen) {
			if (x % 2 == 0) soLuongPTchan++;
		}
		System.out.println("có " + soLuongPTchan + " số chẵn trong danh sách");
	}
}
