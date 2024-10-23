import java.util.Scanner;
public class Tugas2Jobsheet8Absen09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaAtlet;
        String atletTenis = "", atletBasket = "", atletTenisMeja = "", atletVoli = "";
        int jmlPoltek;

        System.out.print("Masukkan Jumlah Politeknik: ");
        jmlPoltek = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= jmlPoltek; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan Nama Atlet Cabor Badminton ke-" + j + ": ");
                namaAtlet = sc.nextLine();
                atletTenis += namaAtlet + ", "; 
            }

           
            for (int x = 1; x <= 5; x++) {
                System.out.print("Masukkan Nama Atlet Cabor Tenis Meja ke-" + x + ": ");
                namaAtlet = sc.nextLine();
                atletTenisMeja += namaAtlet + ", "; 

           
            for (int k = 1; k <= 5; k++) {
                System.out.print("Masukkan Nama Atlet Cabor Basket ke-" + k + ": ");
                namaAtlet = sc.nextLine();
                atletBasket += namaAtlet + ", "; 
            }

            
            for (int t = 1; t <= 5; t++) {
                System.out.print("Masukkan Nama Atlet Cabor Bola Voli ke-" + t + ": ");
                namaAtlet = sc.nextLine();
                atletVoli += namaAtlet + ", "; 
            }
        }

        
        System.out.println("Informasi Atlet Badminton: " + atletTenis);
        System.out.println("Informasi Atlet Tenis Meja: " + atletTenisMeja);
        System.out.println("Informasi Atlet Basket: " + atletBasket);
        System.out.println("Informasi Atlet Bola Voli: " + atletVoli);
            }
            
            
        }  
       
    

    
