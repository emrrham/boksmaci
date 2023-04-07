public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Random rand;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.rand = new Random();
    }

    public void run() {
        boolean f1First = rand.nextBoolean();
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if (f1First) {
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                }
                f1First = !f1First;
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    // diğer metodlar burada kalacak
}
