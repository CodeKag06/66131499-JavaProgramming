package khangnp_quanlynhanvien;

public class Run {
	public static void main (String[] args) {
		// test lop nhan vien 
		NhanVien nv1 = new NhanVien("001", "Nguyen Phuc Khang", 151515);
		nv1.hienThiThongTin();
		System.out.print(nv1.toString());
	}
}
