import java.util.Scanner;

public class StudiKasus04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPerCup * jumlahCup;

        if (totalHarga >= 10000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
            
        }

        totalBayar = totalHarga - diskon;
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tudak cukup. kurang: Rp " + kurang);
        }
        sc.close();
        
    }
}

        