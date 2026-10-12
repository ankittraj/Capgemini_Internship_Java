package Day_7;

class Battary {
    int BattaryCapcity;

    Battary(int BattaryCapcity) {
        this.BattaryCapcity = BattaryCapcity;
    }

    void Displaybattary() {
        System.out.println("Battery Capacity: " + BattaryCapcity);
    }
}

class Cemara {
    int pixal;

    Cemara(int pixal) {
        this.pixal = pixal;
    }

    void TakePhoto() {
        System.out.println("Camera Pixels: " + pixal + " MP");
    }
}

class Phone {
    String Brand;
    Battary battary;
    Cemara cemara;

    Phone(String Brand, Battary battary, Cemara cemara) {
        this.Brand = Brand;
        this.battary = battary;
        this.cemara = cemara;
    }

    void DispayPhone() {
        System.out.println("Mobile Brand: " + Brand);

        battary.Displaybattary();
        cemara.TakePhoto();
    }
}

public class Main4 {
    public static void main(String[] args) {
        Battary b = new Battary(5000);
        Cemara c = new Cemara(50);

        Phone p = new Phone("Samsung", b, c);

        p.DispayPhone();
    }
}
