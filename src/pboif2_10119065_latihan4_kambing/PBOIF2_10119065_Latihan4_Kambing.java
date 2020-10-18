package pboif2_10119065_latihan4_kambing;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan jmlah kambing ke layar
 *
 */
public class PBOIF2_10119065_Latihan4_Kambing {
    
    public void tambahKambing(){
        // Deklarasi varibel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
    }
    
    public static void main(String[] args) {
        PBOIF2_10119065_Latihan4_Kambing kambingJantan = new PBOIF2_10119065_Latihan4_Kambing();
        kambingJantan.tambahKambing();
    }
    
}
