import java.util.Scanner;

public class Buku_17 {

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
    public Buku_17 (String jud, String pg, int hal, int stok, int har, int tot, double dis){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
        total = tot;
        diskon = dis;
    }
   
}