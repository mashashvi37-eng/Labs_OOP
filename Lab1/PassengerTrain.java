public class PassengerTrain extends ElectricTrain {
    private int passenger;
    private int place;
    private int wagon;
    private boolean toilet;

    public PassengerTrain(String model, int maxSpeed, int power, int passenger, int wagon, boolean toilet, int place) {
        super(model, maxSpeed, power);
        this.passenger = passenger;
        this.wagon = wagon;
        this.toilet = toilet;
        this.place = place;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getWagon() {
        return wagon;
    }

    public void setWagon(int wagon) {
        this.wagon = wagon;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public boolean isToilet() {
        return toilet;
    }

    public void setToilet(boolean toilet) {
        this.toilet = toilet;
    }
    public String haveToilet() {
        if (toilet == true) {
            return "В этой электричке есть туалет";
        }
        else {
            return "В этой электричке нет туалета";
        }
    }
    public String full() {
        if (passenger == place * wagon) {
            return "Электричка " + getModel() +  " заполнена";
        }
        else {
            return "В электричке " + getModel() + " есть места";
        }
    }

    public String board(int p) {
        if (passenger + p <= place * wagon) {
            passenger += p;
            return "Посадили " + p + " пассажиров";
        }
        else {
            return "Не хватает мест";
        }
    }

    public String leave(int p) {
        if (passenger - p < 0) {
            return "Невозможно высадить " + p + " пассажиров";
        }
        passenger -= p;
        return "Высажено " + p + " пассажиров";
    }
}
