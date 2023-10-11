public class ProjectTitik {
    public static void main(String[] args) {
        Titik Objek = new Titik();
        Menu mathMenu = new Menu();
        do {
            mathMenu.menuPilihan();
            switch(mathMenu.pilihan){
                case 1 :

                    Objek.inisialisasiTitik();
                    break;
                case 2 :
                    Objek.tampilTitik();
                    break;
                case 3 :
                    Objek.perkalianSkalar();
                    break;
                case 4 :
                    Objek.pencerminanSumbuX();
                    break;
                case 5 :
                    Objek.pencerminanSumbuY();
                    break;
                case 6 :
                    System.out.println("Jarak = "+ Objek.jarak());
                    break;
                case 0 :
                    System.out.println("keluar kak");
                    break;
                default :
                    System.out.println("Pilihan anda salah");
                    break;
            }
        }while(mathMenu.pilihan!=0);
    }
}
