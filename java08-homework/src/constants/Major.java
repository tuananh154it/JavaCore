package constants;

public enum Major {
    KHTN("Khoa học tự nhiên"),
    VHNT("Văn học - Nghệ thuật"),
    DTVT("Điện tử viễn thông"),
    CNTT("Công nghệ thông tin");
    private String major;

    Major(String major) {
        this.major = major;
    }
}
