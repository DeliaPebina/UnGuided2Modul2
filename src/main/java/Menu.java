import java.util.Scanner;
public class Menu {
    public int pilihan = 0;
    public int menuPilihan()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Inisial Titik");
        System.out.println("2. Tampil Titik");
        System.out.println("3. Perkaliahan Skalar Titik");
        System.out.println("4. Pencerinan Terhadap Sumbuh X");
        System.out.println("5. Pencerinan Terhadap Sumbuh y");
        System.out.println("6. Jarak Antar Dua Titik");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("Masukan Pilihan Anda : ");
        this.pilihan = input.nextInt();
        return this.pilihan;
    }
}
