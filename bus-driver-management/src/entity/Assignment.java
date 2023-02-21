package entity;

import java.util.Arrays;

public class Assignment extends Distance {
    private Driver driver;
    private DetailedRoute[] detailedRoutes;
    @Override
    public double getTotalDistance(){
        double sum = 0;
        for(int i = 0; i< detailedRoutes.length;i++){
            sum+= detailedRoutes[i].getTotalDistance();
        }
        return sum;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public DetailedRoute[] getDetailedRoutes() {
        return detailedRoutes;
    }

    public void setDetailedRoutes(DetailedRoute[] detailedRoutes) {
        this.detailedRoutes = detailedRoutes;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "driver=" + driver +
                ", detailedRoutes=" + Arrays.toString(detailedRoutes) +
                '}';
    }
}
