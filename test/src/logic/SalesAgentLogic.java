package logic;

import entity.InputValue;
import entity.SalesAgent;

public class SalesAgentLogic {
    SalesAgent[] salesAgents;
    // constructor

    public SalesAgentLogic(SalesAgent[] sl) {
        this.salesAgents = sl;
    }

    // nhập nhân viên mới
    public void addnewAgent(){
        int numberOfNewAgent = InputValue.inputIntegerNumber("Nhập vào số nhân viên cần thêm: ",1);
        SalesAgent agent = new SalesAgent();
        for(int i = 1; i<= numberOfNewAgent;i++){
            System.out.println("--------Nhập thông tin cho nhân viên thứ "+i+"-----------");
            agent.inputInfor();
            save(agent);
        }
    }
    // lưu item mới vào vị trí null
    public void save(SalesAgent ag){
        for(int i = 0; i< salesAgents.length ;i++){
            if(salesAgents[i] == null){
                salesAgents[i] = new SalesAgent();
                salesAgents[i] = ag;
            }
        }
    }
    public void showAgentList(){
        if(salesAgents[0] == null){
            System.out.println("Chưa có nhân viên nào, vui lòng nhập thêm !!!");
            return;
        }
        System.out.println("-------------- Danh sách nhân viên đang có ----------------");
        for(int i =0; i<salesAgents.length;i++){
            if(salesAgents[i] != null){
                System.out.println(salesAgents[i]);
            }
        }
    }
}
