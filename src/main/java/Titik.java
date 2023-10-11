import java.util.Scanner;
public class Titik {
    Scanner input = new Scanner(System.in);
    protected int x,y;
    public Titik ()
    {
        x=0;
        y=0;
    }
    public void inisialisasiTitik()
    {
        System.out.println("Masukan Nilai x :");
        this.x = input.nextInt();
        System.out.println("Masukan Nilai y :");
        this.y = input.nextInt();
    }
    public void tampilTitik()
    {
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
    }
    public void perkalianSkalar()
    {
        int saklar;
        saklar = input.nextInt();
        System.out.println("Perkalian Skalar = "+ ((saklar * x)+(saklar * y)));
    }
    public void pencerminanSumbuX()
    {
        System.out.println("Pencerminan Sumbu X = "+ (x -(x + x)));
    }
    public void pencerminanSumbuY()
    {
        System.out.println("Pencerminan Sumbu Y = "+ (y -(y + y)));
    }
    public int jarak ()
    {
        int x2;

        int y2;
        x2 = input.nextInt();
        y2 = input.nextInt();
        return (int) Math.sqrt(((x2 - x)*(x2 - x))+((y2-y)*(y2-y)));
    }
}
