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
		System.out.print("mời nhập phần tử thứ" + i + ":" );
			// Cho User cất vào biến tạm
		Integer tam = banPhim.nextInt();
			// thêm vao cuối danh sách
		dsSoNguyen.add(tam);
		}
	}
}
