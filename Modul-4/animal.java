class Hewan{
    String nama;
    String umur;

    Hewan(String nama, String umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void makan(){
        System.out.println("Hewan sedang makan");
    }

    public void tidur(){
        System.out.println("Hewan sedang tidur");
    }
}

class Kucing extends Hewan{
    String ras;

    Kucing(String nama, String umur, String ras){
        super(nama, umur);
        this.ras = ras;
    }

    public void mengeong(){
        System.out.println("Kucing mengeong");
    }

    public void berburu(){
        System.out.println("Kucing berburu serangga");
    }
}

class Anjing extends Hewan{
    String jenisGolongan;

    Anjing(String nama, String umur, String jenisGolongan){
        super(nama, umur);
        this.jenisGolongan = jenisGolongan;
    }

    public void menggonggong(){
        System.out.println("Woof! Woof!");
    }

    public void bermain(){
        System.out.println(" sedang bermain");
    }

    public void tampilkan(){
        System.out.println("Nama Anjing: " + nama);
        System.out.println("Umur Anjing: " + umur);
        System.out.println("Jenis Golongan Anjing: " + jenisGolongan);

        makan();
        tidur();
        menggonggong();
        bermain();
    }
}

class GoldenRetriever extends Anjing{
    public GoldenRetriever(String nama, String umur, String jenisGolongan){
        super(nama, umur, jenisGolongan);
    }

    public void berenang(){
            System.out.println(" suka berenang");
        }
    
    public void mengambil(){
            System.out.println(" sedang mengambil bola");
        }

    public void tampilkanGolden(){
        super.tampilkan();
        berenang();
        mengambil();
    }
}

public class animal{
    public static void main(String[] args){
        GoldenRetriever gr1 = new GoldenRetriever("Buddy", "3 tahun", "Golden Retriever");
        gr1.tampilkanGolden();

        System.out.println(" ");

        Anjing ajg1 = new Anjing("Monstrous Cookies pies", "5 tahun", "Bulldog");
        
        System.out.println("Nama Anjing: " + ajg1.nama);
        System.out.println("Jenis Golongan Anjing: " + ajg1.jenisGolongan);

        ajg1.makan();
        ajg1.tidur();
        ajg1.menggonggong();
        ajg1.bermain();

        System.out.println(" ");

        Kucing kucing1 = new Kucing(" IWAN", "1 tahun", "Mujaer");

        System.out.println("Nama Kucing: " + kucing1.nama);
        System.out.println("Umur Kucing: " + kucing1.umur);
        System.out.println("Ras Kucing: " + kucing1.ras);

        kucing1.makan();
        kucing1.tidur();
        kucing1.mengeong();
        kucing1.berburu();
    }
}