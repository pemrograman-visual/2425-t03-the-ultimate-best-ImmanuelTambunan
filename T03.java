// 12S24034 - Immanuel Tambunan
// 12S24021 - Ika Manurung 
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, tahunterbit, judul, penulis, penerbit, format, kategoridiskon, kategoribuku, kategori;
        double minimummargin, rating, harga, diskon;
        int stok;

        kategori = "";
        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = input.nextLine();
                penerbit = input.nextLine();
                if (penerbit.equals("---")) {
                    penerbit = "---";
                } else {
                    penerbit = penerbit;
                }
                format = input.nextLine();
                harga = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
                if (minimummargin > 0) {
                    kategoridiskon = "---";
                } else {
                    if (minimummargin < -(harga * 0.4)) {
                        kategoridiskon = "Once in a lifetime";
                    } else {
                        if (minimummargin < -(harga * 0.2)) {
                            kategoridiskon = "Never come twice";
                        } else {
                            kategoridiskon = "No regret";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating < 3.0) {
                    kategori = "Low";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        kategori = "Average";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 4.5 && rating < 4.7) {
                                kategori = "Must Read";
                            } else {
                                if (rating >= 4.7) {
                                    kategori = "Best Pick";
                                }
                            }
                        }
                    }
                }
                if (kategoridiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                    kategoribuku = "The ultimate best";
                } else {
                    kategoribuku = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + format + "|" + harga + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori + "|" + kategoridiskon + "|" + kategoribuku);
            }
        } while (!iSBN.equals("---"));
    }
}
