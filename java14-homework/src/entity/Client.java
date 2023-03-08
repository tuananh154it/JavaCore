package entity;

import constant.ClientType;

import java.io.Serializable;
import java.util.Scanner;

public class Client extends Person implements Serializable {
    private static int AUTO_ID = 10000;
    private int clientId;
    private ClientType clientType;


    public Client(){
        this.clientId = AUTO_ID++;
    }

    public void inputInfor(){
        super.inputInfor();
        System.out.println("Lựa chọn:\n1.Cá nhân\n2.Tập thể\n3.Doanh nghiệp");
        System.out.print("Nhập loại khác hàng: ");
        int chose;
        while (true){
            try{
                chose = new Scanner(System.in).nextInt();
                if(chose<1 || chose>3){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập không đúng, yêu cầu nhập lại: ");
            }
        }
        switch (chose){
            case 1:
                this.clientType = ClientType.CN;
                break;
            case 2:
                this.clientType = ClientType.TT;
                break;
            case 3:
                this.clientType = ClientType.DN;
                break;
        }
    }

    public int getClientId() {
        return this.clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }


    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientType=" + clientType +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }
}
