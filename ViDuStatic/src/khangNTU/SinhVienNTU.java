package khangNTU;

public class SinhVienNTU {
	private String HovaTen;
	private String lop;
	
	public SinhVienNTU(String hovaTen, String lop) {
		super();
		HovaTen = hovaTen;
		this.lop = lop;
	}
	public static String TEN_TRUONG="DAI HOC NHA TRANG";
	public static void sayHi() {
		System.out.println("\nHi, I'm a Student NTU");
	}
	public void sayHello() {
		System.out.println("\nHelloooooooo, I'm a Student NTU: \nTên là:" + HovaTen +"\nLớp: " + lop);
	}

}
