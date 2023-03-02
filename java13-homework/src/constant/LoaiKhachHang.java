package constant;

public enum LoaiKhachHang {
    CN("Cá nhân"),
    DDDVHC("Đại diện đơn vị hành chính"),
    DDDVKD("Đại diện đơn vị kinh doanh");
    public String value;

    LoaiKhachHang(String value) {
        this.value = value;
    }
}
