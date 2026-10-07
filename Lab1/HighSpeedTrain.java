public class HighSpeedTrain extends PassengerTrain {
    private int businessplace;
    private int business;
    private int stops;
    private String start;
    private String end;

    public HighSpeedTrain(String model, int maxSpeed, int power, int passenger,
         int wagon, boolean toilet, int place, int business, int businessplace, int stops, String start, String end) {
        super(model, maxSpeed, power, passenger, wagon, toilet, place);
        this.business = business;
        this.start = start;
        this.end = end;
        this.stops = stops;
        this.businessplace = businessplace;
    }
    public int getStops() {
        return stops;
    }
    public void setStops(int stops) {
        this.stops = stops;
    }
    public int getBusinessPlace() {
        return businessplace;
    }
    public void setBusinessPlace(int businessplace) {
        this.businessplace = businessplace;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public int getBusiness() {
        return business;
    }
    public void setBusiness(int business) {
        this.business = business;
    }
    public String announcement() {
        return "Объявление: Дорогие пассажиры, поезд отправляется по маршруту " 
        + start + " - " + end + ". На пути нас ожидает " + stops + " остановки";
    }

    public String isBus() { 
        if (business == businessplace * getWagon()) {
            return "В электричке " + getModel() +  " больше нет мест Бизнес Класса";
        }
        else {
            return "В электричке " + getModel() + " есть места Бизнес Класса";
        }
    }

    public String putBus(int b) {
        if (business + b <= businessplace * getWagon()) {
           business += b;
            return "Посажено " + b + " в Бизнес Класс"; 
        }
        else {
            return "Недостаточно мест в Бизнес Классе";
        }
    }
}
