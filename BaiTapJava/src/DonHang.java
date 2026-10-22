/**
 * Lớp biểu diễn thông tin một Đơn Hàng
 */
public class DonHang {
    private String tenKhach;
    private SanPham sanPham;
    private int soLuong;

    // Constructor nhận đủ 3 giá trị
    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    // Phương thức tính thành tiền
    public double tinhThanhTien() {
        double thanhTien = this.sanPham.getDonGia() * this.soLuong;
        if (this.soLuong >= 5) {
            thanhTien = thanhTien * 0.9;
        }
        return thanhTien;
    }

    // Phương thức in thông tin đơn hàng
    public void inDonHang() {
        String tienFormat = String.format("%,.0f", this.tinhThanhTien()).replace(',', '.');
        System.out.printf("%-6s %-17s %-4d %9s\n",
                this.tenKhach, this.sanPham.getTenSP(), this.soLuong, tienFormat);

        if (this.soLuong >= 5) {
            System.out.printf("%-6s %-17s\n", "", "(đã giảm 10%)");
        }
    }
}