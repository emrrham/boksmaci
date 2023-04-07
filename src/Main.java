public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Akif" , 15 , 100, 120, 0);
        Fighter alex = new Fighter("Atak" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 80 , 120);
        r.run();
    }
}
