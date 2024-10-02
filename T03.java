// 12S24021 - Ika Manurung
// 12S24034 - Immanuel Tambunan
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn, judul, penulis, penerbit, formatbuku, kategori, kategoridiskon, kategoribuku;
        int stok;
        double hargapembelian, minimummargin, rating, diskon, tahunterbit;

        do {
            kodeisbn = input.nextLine();
            if (kodeisbn.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = Double.parseDouble(input.nextLine());
                penerbit = input.nextLine();
                formatbuku = input.nextLine();
                hargapembelian = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
                diskon = minimummargin / hargapembelian * -1;
                if (diskon >= (double) 40 / 100) {
                    kategoridiskon = "Once in a LifeTime";
                } else {
                    if (diskon >= (double) 20 / 100) {
                        kategoridiskon = "Never Come Twice";
                    } else {
                        if (diskon <= 0) {
                            kategoridiskon = "No Regret";
                        } else {
                            kategoridiskon = "---";
                        }
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        kategori = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                kategori = "Average";
                            } else {
                                kategori = "Low";
                            }
                        }
                    }
                }
                if (kategori.equals("One in LifeTime") && kategori.equals("BestPick")) {
                    kategoribuku = "The Ultimate Best";
                } else {
                    kategoribuku = "---";
                }
                System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori + "|" + kategoridiskon + "|" + kategoribuku);
            }
        } while (!kodeisbn.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
