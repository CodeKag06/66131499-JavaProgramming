package Vidu2_OOP_Hamtao_Getter;

public class Run {
    public static void main(String[] args) {
        //tao moi doi tuong chu nhat
        ChuNhat cn1 = new ChuNhat();
          // tao moi doi tuong cn1, dai = 10, rong = 5
        ChuNhat cn2 = new ChuNhat(20, 15);
        ChuNhat hv = new ChuNhat(20, 20);
        //hien thi thong tin chu nhat cn1
        double cn1_dai = cn1.getDai();
        double cn1_rong = cn1.getRong();
        System.out.println("hình cn 1 có dài là: " + cn1.getDai());
        System.out.println("hình cn 1 có rộng là: " + cn1.getRong());

   
}
