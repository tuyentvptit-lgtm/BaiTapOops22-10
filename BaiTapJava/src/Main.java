public class Main {
    public static void main(String[] args) {
        SanPham banPhim = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham chuot = new SanPham("SP02", "Chuột không dây", 200000, 50);

        SanPham taiNghe = new SanPham("SP03", "Tai nghe");
        taiNghe.setDonGia(350000);
        taiNghe.setSoLuongTon(10);

        DonHang don1 = new DonHang("An", banPhim, 2);
        DonHang don2 = new DonHang("Bình", chuot, 5);
        DonHang don3 = new DonHang("Chi", taiNghe, 0);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        banPhim.hienThi();
        chuot.hienThi();
        taiNghe.hienThi();

        System.out.println();

        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-6s %-17s %-4s %9s\n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        don1.inDonHang();
        don2.inDonHang();
        don3.inDonHang();
    }
}
