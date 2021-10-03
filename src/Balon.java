public class Balon {
    int x;
    int y;
    String color;

    public Balon() {
        System.out.println("Wlasnie teraz tworze balon.");
        this.x = 50;
        this.y = 50;
        this.color = "niebieski";
    }

    public Balon(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    void show() {
        System.out.println("Balon o kolorze " + this.color + ", x=" + this.x + ", y=" + this.y);
        if(this.x < 50) {
            System.out.println("Balon jest z lewej");
        }
    }

}
