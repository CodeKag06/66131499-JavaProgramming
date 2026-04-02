package khangNTU;

public class run {

	public static void main(String[] args) {
		// Su dung hang
		System.out.println(Math.PI);
		// du dung phuong thuc tinh
		// con duoc goi la phuong thuc cua lop
		System.out.println(Math.sqrt(9));
		
		// IN RA TÊN TRƯỜNG của sinh viên NTU
		System.out.println(SinhVienNTU.TEN_TRUONG);
		//In ra Hi
		SinhVienNTU.sayHi();
		//In ra Hello
		SinhVienNTU sv1 = new SinhVienNTU("Nguyen Phuc Khang", "66Cntt-2");
		SinhVienNTU sv2 = new SinhVienNTU("Nguyen Van A", "66Cntt-3");
		
		sv1.sayHello();
		sv2.sayHello();
		
	}

}
