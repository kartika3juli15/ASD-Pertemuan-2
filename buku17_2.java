import java.util.Scanner;

public class buku17_2 {

        String judul, pengarang;
        int halaman, stok, harga;


    void tampilInformasi (){
        System.out.println("judul : " + judul);
        System.out.println("pengarang : " + pengarang);
        System.out.println("jumlah halaman : " + halaman);
        System.out.println("sisa stok : " + stok);
        if (stok < 0){
            System.out.println("stok sudah habis");
            return;
        }else if(stok > 0){
            System.out.println("stok masih ada");
        }
        System.out.println("harga : Rp." + harga);
        
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
    public buku17_2 (String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}