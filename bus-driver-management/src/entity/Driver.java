package entity;

import constant.Level;
import logic_library.Input;

public class Driver extends Person{
    private static int AUTO_DRIVING_CODE = 10000;
    private int drivingCode;
    private Level level;

    public Driver() {
        this.drivingCode = AUTO_DRIVING_CODE;
        AUTO_DRIVING_CODE++;
    }
    // nhập thông tin cho lái xe mới
    @Override
    public void inputInfo(){
        super.inputInfo();
        System.out.print("1. A\n2. B\n3. C\n4. D\n5. E\n6 .F\n");
        int choose = Input.inputIntegerNumber("Nhập trình độ(Nhập số thứ tự tương ứng với trình độ): ",1,6);
        switch (choose){
            case 1:
                this.level = Level.A;
                break;
            case 2:
                this.level = Level.B;
                break;
            case 3:
                this.level = Level.C;
                break;
            case 4:
                this.level = Level.D;
                break;
            case 5:
                this.level = Level.E;
                break;
            case 6:
                this.level = Level.F;
                break;
        }
    }

    public int getDrivingCode() {
        return drivingCode;
    }

    public void setDrivingCode(int drivingCode) {
        this.drivingCode = drivingCode;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingCode=" + drivingCode +
                ", level=" + level +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
