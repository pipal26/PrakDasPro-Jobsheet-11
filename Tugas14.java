import java.util.Scanner;
public class Tugas14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata2pertanyaan, rata2responden, rata2;
        int totalnresponden, totalnpertanyaan, total = 0, nilaiJawabans[][] = new int[10][6];

        for (int i = 0; i < nilaiJawabans.length; i++) {
            System.out.println("Masukkan nilai jawaban Responden ke-" + (i + 1));
            totalnresponden = 0;
            for (int j = 0; j < nilaiJawabans[i].length; j++) {
                System.out.print("Nilai Soal ke-" + (j + 1) + " (1 - 5): ");
                nilaiJawabans[i][j] = sc.nextInt();
                totalnresponden += nilaiJawabans[i][j];
            }
            rata2responden = (double) totalnresponden / nilaiJawabans[i].length;
            System.out.println("-".repeat(50));
            System.out.printf("%s%d%s %.2f\n","Rata-rata nilai responden ke-" , (i + 1) , ": " , rata2responden);
            System.out.println("-".repeat(50));
        }
        
        for (int i = 0; i < nilaiJawabans[0].length; i++) {
            totalnpertanyaan = 0;
            for (int j = 0; j < nilaiJawabans.length; j++) {
                totalnpertanyaan += nilaiJawabans[j][i];
                total += nilaiJawabans[j][i];
            }
            rata2pertanyaan = (double) totalnpertanyaan / nilaiJawabans.length;
            System.out.print("rata2 nilai pertanyaan ke-" + (i + 1) + ": " + rata2pertanyaan);
            System.out.println();
        }
        
        rata2 = (double) total / (nilaiJawabans.length * nilaiJawabans[0].length);
        System.out.printf("total rata rata: %.2f", rata2);
        sc.close();
    }
}
