package entity;

public class TotalDistance{
    Driver driver;
    double totalDistance;
    public  TotalDistance(Driver driver, double totalDistance) {
        this.driver = driver;
        this.totalDistance = totalDistance;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    @Override
    public String toString() {
        return "TotalDistance{" +
                "driver=" + driver +
                ", totalDistance=" + totalDistance +
                '}';
    }

}
