public class ChuNhat {
    //khai bao thuoc tinh
    private double dai;
    private double rong;

    // Hàm tạo (constructor)
    public ChuNhat() {
        dai = 10;
        rong = 5;
    }
    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
//   public ChuNhat(double daiM, double rongM) {
//      this.dai = daiM;
//      this.rong = rongM;
//  }

    //getter
    double getDai() {
        return dai;
    }
    double getRong() {
        return rong;
    }

    //setter
//    void setDai(double daiM) {
//      dai = daiM;
//  }
//    void setRong(double rongM) {
//      rong = rongM;
//  }
    void setDai(double dai) {
        this.dai = dai;
    }
    void setRong(double rong) {
        this.rong = rong;
    }
    // cac phuong thuc khac
    public double tinhDienTich() {
        return dai * rong;
    }
}