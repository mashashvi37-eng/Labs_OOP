public class Main {
    public static void main(String[] args) {
        ElectricTrain t = new ElectricTrain("ЭД4М", 120, 3000);
        System.out.println("Первая электричка класса ElectricTrain: ");
        System.out.println(t.info());
        System.out.println(t.move());
        t.setMaxSpeed(140);
        System.out.println("Новая скорость: " + t.getMaxSpeed());
        System.out.println(t.move());
        System.out.println(t.stop());
        System.out.println("=============================================================================");
        System.out.println("Вторая электричка класса PassengerTrain: ");
        PassengerTrain p = new PassengerTrain("ЭД8М", 150, 3500,
        0, 12, false, 150);
        System.out.println(p.board(1000));
        System.out.println(p.full());
        System.out.println(p.leave(1234));
        System.out.println(p.haveToilet());
        System.out.println(p.move());
        System.out.println("=============================================================================");
        System.out.println("Третья электричка класса HighSpeedTrain: ");
        HighSpeedTrain h = new HighSpeedTrain("ЭД7М", 250, 5000,
        0, 10, true, 100, 0, 5, 3, "Москва", "Иваново");
        System.out.println(h.putBus(150));
        System.out.println(h.putBus(50));
        System.out.println(h.isBus());
        System.out.println(h.haveToilet());
        System.out.println(h.announcement());
        System.out.println(h.move());
    }
}
