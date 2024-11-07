public class Bioskop10 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "amin";
        penonton[0][1] = "bena";
        penonton[1][0] = "candra";
        penonton[1][1] = "dela";
        penonton[2][0] = "eka";
        penonton[2][1] = "farhan";
        penonton[3][0] = "gisel";
        penonton[3][1] = "hana";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
        System.out.println(penonton.length);

        // print panjang baris manual
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        // print panjang baris menggunakan for loop
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("panjang baris ke-" + (i + 1) + " : " + penonton[i].length);
        }

        // print panjang baris menggunakan for each
        for (String[] barisPenonton : penonton) {
            System.out.println("panjang baris: " + barisPenonton.length);
        }

        System.out.println("penonton pada baris ke-3: ");
        // print nama penonton pada baris ke-3 menggunakan for loop
        for (int i = 0; i < penonton[2].length; i++) {
            // penonton[2][1] = "ganti dengan for loop";
            System.out.println(penonton[2][i]);
        }
        // print nama penonton pada baris ke-3 menggunakan for each
        for (String i : penonton[2]) {
            // i = "ganti dengan foreach";
            System.out.println(i);
        }

        // print nama penonton menggunakan for loop string join
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("penonton pada baris ke-" + (i + 1) + " : " + String.join(", ", penonton[i]));
        }

    }
}
