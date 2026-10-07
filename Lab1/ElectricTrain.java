public class ElectricTrain {
    private String model;
    private int maxSpeed;
    private int power;

    public ElectricTrain(String model, int maxSpeed, int power) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPower() {
        return power;
    }
    
    public void setPower(int power) {
        this.power = power;
    }

    public String move() {
        return model + " поехала со скоростью " + maxSpeed + " км/ч";
    }

    public String stop() {
        return model + " остановилась";
    }

    public String info() {
        return "Модель: " + model + ", скорость: " + maxSpeed + ", мощность: " + power;
    }

    public int distance(int time) {
        return time * maxSpeed;
    }

    public int travelTime(int distance) {
        return distance / maxSpeed;
    }    
}
