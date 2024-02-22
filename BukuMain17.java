import java.util.Scanner;

public class BukuMain17 {

        String judul, pengarang;
        int halaman, stok, harga, total;
        double diskon;


    void tampilInformasi (){
        System.out.println("judul : " + judul);
        System.out.println("pengarang : " + pengarang);
        System.out.println("jumlah halaman : " + halaman);
        System.out.println("sisa stok : " + stok);
        System.out.println("harga : Rp." + harga);
        System.out.println("total : Rp." + total);
        System.out.println("harga setelah diskon : Rp. " + diskon);
        System.out.println("harga yang dibayarkan : Rp." + diskon);  
    }

    void terjual (int jml){
        stok -= jml;
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;   
    }
    void HitungHargaTotal(int seluruh){
        total += harga*seluruh;
    }

    void hitungDiskon(double total){
        if (total > 150000){
            diskon = total-(total*0.12);
        }else if (total > 75000){
            diskon = total-(total*0.05);
        }else{
            System.out.println("anda tidak mendapatkan diskon");
        }
    }

    void HitungHargaBayar(int bayar){
        diskon += bayar;
    }
    
    public static void main(String[] args) {
        BukuMain17 bk1 = new BukuMain17();
        //sebelum terjual
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 50000;
        bk1.total = 0; 
        bk1.diskon = 0;
        bk1.tampilInformasi();

        //setelah terjual
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.HitungHargaTotal(5);
        bk1.hitungDiskon(300000);
        bk1.HitungHargaBayar(0);
        System.out.println("=================================");
        bk1.tampilInformasi();
       
        //memanggil buku_17 
        Buku_17 bk2 = new Buku_17("self reward","maheera ayesha", 160, 29, 59000, 0,0 );
        System.out.println("=================================");
        bk2.tampilInformasi();

        bk2.terjual(11);
        bk2.gantiHarga(40000);
        bk2.HitungHargaTotal(11);
        bk2.hitungDiskon(440000);
        bk2.HitungHargaBayar(0);
        System.out.println("=================================");
        bk2.tampilInformasi();
    }
}