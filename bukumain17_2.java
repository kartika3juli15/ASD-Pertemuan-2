import java.util.Scanner;

public class bukumain17_2 {

        String judul, pengarang;
        int halaman, stok, harga;


    void tampilInformasi (){
        System.out.println("judul : " + judul);
        System.out.println("pengarang : " + pengarang);
        System.out.println("jumlah halaman : " + halaman);
        System.out.println("sisa stok : " + stok);
        System.out.println("harga : Rp." + harga);
    }

    void terjual (int jml){
        stok -= jml;
        if (jml > stok){
            System.out.println("melebihi batas");
            return;
        }
        
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;   
    }
   
    
    public static void main(String[] args) {
        bukumain17_2 bk1 = new bukumain17_2();

        //sebelum terjual
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 50000;
        System.out.println("========================");
        bk1.tampilInformasi();

        //setelah terjual
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        System.out.println("========================");
        bk1.tampilInformasi();
       
        //memanggil buku_17 
        buku17_2 bk2 = new buku17_2("self reward","maheera ayesha", 160, 10, 59000 );
        System.out.println("========================");
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}