/**
 * Lớp biểu diễn thông tin một Sản Phẩm
 */
public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuongTon;

    // Constructor 1: Không tham số
    public SanPham() {
    }

    // Constructor 2: 2 tham số
    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    // Constructor 3: Đủ 4 tham số
    public SanPham(String maSP, String tenSP, double donGia, int soLuongTon) {
        this(maSP, tenSP);
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    // Getter và Setter
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    // Phương thức hiển thị thông tin sản phẩm
    public void hienThi() {
        String giaFormat = String.format("%,.0f", this.donGia).replace(',', '.');
        System.out.printf("%-5s %-17s %8s   tồn %d\n",
                this.maSP, this.tenSP, giaFormat, this.soLuongTon);
    }
}