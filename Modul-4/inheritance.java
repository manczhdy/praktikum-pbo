class kendaraan{
    String merk;
    String model;

    kendaraan(String merk, String model){
        this.merk = merk;
        this.model = model;
    }
}

class Mobil extends kendaraan{
    int tahun;

    Mobil(String merk, String model, int tahun){
        super(merk, model);
        this.tahun = tahun;
    }

    void tampilkan(){
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
    }
}

class Ford extends Mobil{
    String jenis;

    Ford(String merk, String model, int tahun, String jenis){
        super(merk, model, tahun);
        this.jenis = jenis;
    }

    void tampilkanFord(){
        super.tampilkan();
        System.out.println("Jenis: " + jenis);
    }
}

public class inheritance {
    public static void main(String[] args){
        Mobil m1 = new Mobil("Toyota", "Camry", 2020);
        m1.tampilkan();

        System.out.println(" ");

        Ford ford1 = new Ford("Ford", "Mustang", 2010, "Muscle car");
        ford1.tampilkanFord();
    }
}
