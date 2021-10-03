public class First {

    public static void createBalloons() {
        Balon balon1 = new Balon();
        Balon balon2 = new Balon();
        Balon balon3 = new Balon();
    }

    public static void main(String[] args) {
        System.out.println("Poczatek programu");

        Balon balon1 = new Balon(13, 15, "czerwony");
        Balon balon2 = new Balon();
        Balon balon3 = new Balon(167, 200, "pomaranczowy");
        balon3 = new Balon(11, 15, "blekitny");
        Balon balon4 = new Balon();

        balon4.x = 1000;
        balon4.y = 2000;
        balon1.show();
        balon4.show();

        balon2.x = 15;
        System.out.println(balon3.color.length());
        balon2.show();

    }

}
