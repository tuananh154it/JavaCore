package logic;

import entity.Reporter;

public class ReporterLogic {
    private Reporter[] reporters;

    public ReporterLogic(Reporter[] reporters) {
        this.reporters = reporters;
    }

    // nhập danh sách phóng viên
    public void inputReporter(){
        int numberOfNewReporter = Input.inputNumber("Nhập số lượng phóng viên cần thêm: ", 1);
        Reporter reporter = new Reporter();
        for(int i = 0;i<reporters.length;i++){
            if(reporters[i] != null){
                System.out.println("-------------------------");
                reporter.inputInfor();
            }
        }
    }
    public void save(Reporter r){
        for(int i = 0 ;i <reporters.length; i++){
            if(reporters[i] == null){
                reporters[i] = r;
                break;
            }
        }
    }
    public void printReporterList(){
        if(reporters.length == 0){
            System.out.println("Chưa có phóng viên, vui lòng tuyển thêm");
            return;
        }
        System.out.println("------------------Danh sách phóng viên ------------------");
        for (int i = 0; i < reporters.length; i++) {
            System.out.println(reporters[i]);
        }
    }
}
