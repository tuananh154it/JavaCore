package entity;

public class DetailedRoute {
    private Route route;
    private int numberOfDriving;
    public DetailedRoute(){}

    public DetailedRoute(Route route, int numberOfDriving) {
        this.route = route;
        this.numberOfDriving = numberOfDriving;
    }
    public double getTotalDistance(){
        return route.getDistance()*numberOfDriving;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getNumberOfDriving() {
        return numberOfDriving;
    }

    public void setNumberOfDriving(int numberOfDriving) {
        this.numberOfDriving = numberOfDriving;
    }

    @Override
    public String toString() {
        return "DetailedRoute{" +
                "route=" + route +
                ", numberOfDriving=" + numberOfDriving +
                '}';
    }
}
