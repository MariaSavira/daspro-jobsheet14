import java.util.Scanner;

public class tugas {
    static int n, hasil;
    static int a[];
    static Scanner sc = new Scanner(System.in);

    static int rekursif(int n){
        if (n == 0){
            System.out.print(" = " + hasil);
            return 0;
        } else {
            if (n == 1){
                System.out.print(a[n - 1]);
            } else {
                System.out.print(a[n - 1] + " + ");
            }
            hasil += a[n - 1];
            return rekursif(n - 1);
        }
    }

    static int iteratif(int n){
        hasil = 0;
        for (int i = n; i > 0; i--) {
            if (i == 1){
                System.out.print(a[i - 1]);
            } else {
                System.out.print(a[i - 1] + " + ");
            }
            hasil += a[i - 1];
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah angka yang ingin dihitung (n) : ");
        n = sc.nextInt();
        a = new int[n];

        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            a[i - 1] = sc.nextInt();
        }

        System.out.println("\nRekursif : ");
        rekursif(n);
        hasil = 0;
        System.out.println("\n\nIteratif : ");
        iteratif(n);
        System.out.print(" = " + hasil);
    }
}
