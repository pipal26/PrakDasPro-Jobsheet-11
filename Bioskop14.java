public class Bioskop14 {
    public static void main(String[] args) {
        
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.println(penonton.length);
        
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + i + " : " + penonton[i].length);
        }

        System.out.println(penonton.length);

        for (String[] baris : penonton) {
            System.out.println("Panjang baris : " + baris.length);
        }

        System.out.println("Nama Penonton Bioskop di Baris ke-3:");

        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        System.out.println("Nama Penonton Bioskop di Baris ke-3 (foreach):");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }

        for(int i = 0; i < penonton.length; i++){
            System.out.println("Nama Penonton Bioskop di Baris ke-" + (i+1) + ":" + String.join(", ",penonton[i] ));
        }

        System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);
        
    }
}
