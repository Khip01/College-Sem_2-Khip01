import java.util.Scanner;
/**
 * DaftarMahasiswaBerprestasi
 */
public class DaftarMahasiswaBerprestasi {
    // Mahasiswa[] listMhs = new Mahasiswa[50]; // test 50 mahasiswa
    // int sorting_ke = 1; // test 50 mahasiswa
    Mahasiswa[] listMhs = new Mahasiswa[5]; 
    int idx; 

    void tambah(Mahasiswa m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("--------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                // System.out.printf("Sorting ke-%d\n", sorting_ke+=1); // test 50 data mahasiswa 
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                // System.out.printf("Banding Antara %.2f < %.2f\n", listMhs[j].ipk, listMhs[idxMin].ipk);
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();

        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Umni", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        // Test 50 Data Mahasiswa
        // Mahasiswa m6 = new Mahasiswa("John", 2020, 20, 3.9);
        // Mahasiswa m7 = new Mahasiswa("Sarah", 2019, 22, 3.8);
        // Mahasiswa m8 = new Mahasiswa("Michael", 2018, 21, 3.7);
        // Mahasiswa m9 = new Mahasiswa("Emily", 2017, 23, 3.6);
        // Mahasiswa m10 = new Mahasiswa("David", 2016, 24, 3.5);
        // Mahasiswa m11 = new Mahasiswa("Jessica", 2015, 25, 3.4);
        // Mahasiswa m12 = new Mahasiswa("Daniel", 2014, 26, 3.3);
        // Mahasiswa m13 = new Mahasiswa("Olivia", 2013, 27, 3.2);
        // Mahasiswa m14 = new Mahasiswa("William", 2012, 28, 3.1);
        // Mahasiswa m15 = new Mahasiswa("Sophia", 2011, 29, 3.0);
        // Mahasiswa m16 = new Mahasiswa("James", 2010, 30, 2.9);
        // Mahasiswa m17 = new Mahasiswa("Ava", 2009, 31, 2.8);
        // Mahasiswa m18 = new Mahasiswa("Benjamin", 2008, 32, 2.7);
        // Mahasiswa m19 = new Mahasiswa("Mia", 2007, 33, 2.6);
        // Mahasiswa m20 = new Mahasiswa("Henry", 2006, 34, 2.5);
        // Mahasiswa m21 = new Mahasiswa("Charlotte", 2005, 35, 2.4);
        // Mahasiswa m22 = new Mahasiswa("Alexander", 2004, 36, 2.3);
        // Mahasiswa m23 = new Mahasiswa("Amelia", 2003, 37, 2.2);
        // Mahasiswa m24 = new Mahasiswa("Daniel", 2002, 38, 2.1);
        // Mahasiswa m25 = new Mahasiswa("Ella", 2001, 39, 2.0);
        // Mahasiswa m26 = new Mahasiswa("Matthew", 2000, 40, 1.9);
        // Mahasiswa m27 = new Mahasiswa("Scarlett", 1999, 41, 1.8);
        // Mahasiswa m28 = new Mahasiswa("Joseph", 1998, 42, 1.7);
        // Mahasiswa m29 = new Mahasiswa("Victoria", 1997, 43, 1.6);
        // Mahasiswa m30 = new Mahasiswa("Samuel", 1996, 44, 1.5);
        // Mahasiswa m31 = new Mahasiswa("Grace", 1995, 45, 1.4);
        // Mahasiswa m32 = new Mahasiswa("Andrew", 1994, 46, 1.3);
        // Mahasiswa m33 = new Mahasiswa("Chloe", 1993, 47, 1.2);
        // Mahasiswa m34 = new Mahasiswa("David", 1992, 48, 1.1);
        // Mahasiswa m35 = new Mahasiswa("Zoe", 1991, 49, 1.0);
        // Mahasiswa m36 = new Mahasiswa("Christopher", 1990, 50, 0.9);
        // Mahasiswa m37 = new Mahasiswa("Natalie", 1989, 51, 0.8);
        // Mahasiswa m38 = new Mahasiswa("Daniel", 1988, 52, 0.7);
        // Mahasiswa m39 = new Mahasiswa("Lily", 1987, 53, 0.6);
        // Mahasiswa m40 = new Mahasiswa("Nicholas", 1986, 54, 0.5);
        // Mahasiswa m41 = new Mahasiswa("Hannah", 1985, 55, 0.4);
        // Mahasiswa m42 = new Mahasiswa("William", 1984, 56, 0.3);
        // Mahasiswa m43 = new Mahasiswa("Audrey", 1983, 57, 0.2);
        // Mahasiswa m44 = new Mahasiswa("Ryan", 1982, 58, 0.1);
        // Mahasiswa m45 = new Mahasiswa("Avery", 1981, 59, 0.0);
        // Mahasiswa m46 = new Mahasiswa("Ethan", 1980, 60, 4.0);
        // Mahasiswa m47 = new Mahasiswa("Emma", 1979, 61, 3.9);
        // Mahasiswa m48 = new Mahasiswa("Jacob", 1978, 62, 3.8);
        // Mahasiswa m49 = new Mahasiswa("Madison", 1977, 63, 3.7);
        // Mahasiswa m50 = new Mahasiswa("Noah", 1976, 64, 3.6);

        // list.tambah(m6);
        // list.tambah(m7);
        // list.tambah(m8);
        // list.tambah(m9);
        // list.tambah(m10);
        // list.tambah(m11);
        // list.tambah(m12);
        // list.tambah(m13);
        // list.tambah(m14);
        // list.tambah(m15);
        // list.tambah(m16);
        // list.tambah(m17);
        // list.tambah(m18);
        // list.tambah(m19);
        // list.tambah(m20);
        // list.tambah(m21);
        // list.tambah(m22);
        // list.tambah(m23);
        // list.tambah(m24);
        // list.tambah(m25);
        // list.tambah(m26);
        // list.tambah(m27);
        // list.tambah(m28);
        // list.tambah(m29);
        // list.tambah(m30);
        // list.tambah(m31);
        // list.tambah(m32);
        // list.tambah(m33);
        // list.tambah(m34);
        // list.tambah(m35);
        // list.tambah(m36);
        // list.tambah(m37);
        // list.tambah(m38);
        // list.tambah(m39);
        // list.tambah(m40);
        // list.tambah(m41);
        // list.tambah(m42);
        // list.tambah(m43);
        // list.tambah(m44);
        // list.tambah(m45);
        // list.tambah(m46);
        // list.tambah(m47);
        // list.tambah(m48);
        // list.tambah(m49);
        // list.tambah(m50);

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}