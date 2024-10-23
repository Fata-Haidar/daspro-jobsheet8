import java.util.Scanner;
public class Tugas1Jobshett8Absen09 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N;
    System.out.print("Masukkan input N : ");
    N= sc.nextInt();


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { 
               
                if (i == 0 || i == N -1 || j == 0 || j == N-1) {
                    System.out.print(N + " "); 
                } 
                else{ 
                    System.out.print("  ");
                }

            }
            System.out.println(); 
        }
    }
}

