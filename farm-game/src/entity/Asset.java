package entity;

public class Asset {
    private double lantArea;
    private double coin;
    // entity
    private int chicken;
    private int pig;
    private int cow;
    private double rice; // m2
    private double maize; // m2
    private double soybean;// m2
    // product
    private int chickenProduct;
    private int pigProduct;
    private int cowProduct;
    private double riceProduct;
    private double maizeProduct;
    private double soybeanProduct;
    public void showAsset(){
        System.out.println("-------- tài sản của bạn ---------");
        System.out.println("Tổng số tiền: "+this.coin+" coin");
        System.out.println("Đang sở hữu "+this.lantArea + " mét vuông đất");
        System.out.println("Đang nuôi: ");
        if(this.chicken > 0){
            System.out.println(this.chicken+" con gà");
        }
        if(this.pig > 0){
            System.out.println(this.pig+" con lợn");
        }
        if(this.cow>0){
            System.out.println(this.cow+" con bò");
        }
        System.out.println("Đang trồng: ");
        if(this.rice>0){
            System.out.println(this.rice+" mét vuông lúa");
        }
        if(this.maize>0){
            System.out.println(this.maize+" mét vuông lúa");
        }
        if(this.soybean>0){
            System.out.println(this.soybean+" mét vuông đậu nành");
        }
        System.out.println("Trong kho đang có");
        if(this.chickenProduct > 0){
            System.out.println(this.chickenProduct+" con gà");
        }
        if(this.pigProduct > 0){
            System.out.println(this.pigProduct+" con lợn");
        }
        if(this.cowProduct>0){
            System.out.println(this.cowProduct+" con bò");
        }
        System.out.println("Đang trồng: ");
        if(this.riceProduct>0){
            System.out.println(this.riceProduct+" mét vuông lúa");
        }
        if(this.maizeProduct>0){
            System.out.println(this.maizeProduct+" mét vuông lúa");
        }
        if(this.soybeanProduct>0){
            System.out.println(this.soybeanProduct+" mét vuông đậu nành");
        }
    }
    //
    public double getCoin() {
        return coin;
    }

    public void setCoin(double coin) {
        this.coin = coin;
    }

    public int getChicken() {
        return chicken;
    }

    public void setChicken(int chicken) {
        this.chicken = chicken;
    }

    public int getPig() {
        return pig;
    }

    public void setPig(int pig) {
        this.pig = pig;
    }

    public int getCow() {
        return cow;
    }

    public void setCow(int cow) {
        this.cow = cow;
    }

    public double getRice() {
        return rice;
    }

    public void setRice(double rice) {
        this.rice = rice;
    }

    public double getMaize() {
        return maize;
    }

    public void setMaize(double maize) {
        this.maize = maize;
    }

    public double getSoybean() {
        return soybean;
    }

    public void setSoybean(double soybean) {
        this.soybean = soybean;
    }

    public int getChickenProduct() {
        return chickenProduct;
    }

    public void setChickenProduct(int chickenProduct) {
        this.chickenProduct = chickenProduct;
    }

    public int getPigProduct() {
        return pigProduct;
    }

    public void setPigProduct(int pigProduct) {
        this.pigProduct = pigProduct;
    }

    public int getCowProduct() {
        return cowProduct;
    }

    public void setCowProduct(int cowProduct) {
        this.cowProduct = cowProduct;
    }

    public double getRiceProduct() {
        return riceProduct;
    }

    public void setRiceProduct(double riceProduct) {
        this.riceProduct = riceProduct;
    }

    public double getMaizeProduct() {
        return maizeProduct;
    }

    public void setMaizeProduct(double maizeProduct) {
        this.maizeProduct = maizeProduct;
    }

    public double getSoybeanProduct() {
        return soybeanProduct;
    }

    public void setSoybeanProduct(double soybeanProduct) {
        this.soybeanProduct = soybeanProduct;
    }

    public double getLantArea() {
        return lantArea;
    }

    public void setLantArea(double lantArea) {
        this.lantArea = lantArea;
    }
}
