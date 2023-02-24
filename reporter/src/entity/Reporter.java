package entity;

import constant.ReporterType;
import logic.Input;

public class Reporter extends Person {
    private int id;
    private static int AUTO_ID = 10000;
    private ReporterType reporterType;

    public Reporter() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    // nhập danh sách phóng viên
    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.println("Loại phòng viên");
        System.out.println("1. Chuyên nghiệp");
        System.out.println("2. Nghiệp dư");
        System.out.println("3. Cộng tác viên");
        int chose = Input.inputNumber("Nhập loại phóng viên: ", 1, 3);
        switch (chose) {
            case 1:
                this.reporterType = ReporterType.CN;
                break;
            case 2:
                this.reporterType = ReporterType.ND;
                break;
            case 3:
                this.reporterType = ReporterType.CTV;
                break;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReporterType getReporterType() {
        return reporterType;
    }

    public void setReporterType(ReporterType reporterType) {
        this.reporterType = reporterType;
    }

    @Override
    public String toString() {
        return "Reporter{" +
                "id=" + id +
                ", reporterType=" + reporterType +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
