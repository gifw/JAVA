package Lection_3_tasks.Task2;

class Car implements CarInterface {
    private int startDistance;
    private double mpg;
    private double startLiter = 0;
    public  Car(int l) {
        mpg = l; //  fuel consumption (расход)
    }

    @Override
    public void setDistance(int distance) {
        startDistance += distance;
        double f = mpg / 100 * distance;
        startLiter -= f;
    }

    @Override
    public void pourFuel(int liter) {
        startLiter += liter;
    }

    @Override
    public int distanceFromStart() {
        return startDistance;
    }

    @Override
    public float amountOfFuel() {
        return (float) startLiter;
    }
}
