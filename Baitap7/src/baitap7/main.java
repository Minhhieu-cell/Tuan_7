class SinhVien {
    String maSV;
    String hoTen;
    int tuoi;
    double diemTB;

    // Constructor
    public SinhVien(String maSV, String hoTen, int tuoi, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    // Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Diem trung binh: " + diemTB);
    }
}

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("SV001", "Nguyen Van An", 20, 8.5);

        sv.hienThiThongTin();
    }
}