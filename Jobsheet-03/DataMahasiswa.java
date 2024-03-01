import java.util.Arrays;

public class DataMahasiswa {

    public String nama, nim;
    public char jenisKelamin;
    public float ipk;


    public DataMahasiswa(String nama, String nim, char jenisK, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisK;
        this.ipk = ipk;
    }

    public DataMahasiswa(){

    }

    
    public float hitungRataIPK(float[] arrIpk, int arrLastIndex){ // calculate ipk average recursively hehe
        // Copy isi arrIpk ke arr untuk digunakan sebagai bahan eksekusi
        float[] arr = Arrays.copyOf(arrIpk, arrIpk.length); 
        if (arrLastIndex - 1 == 0) {
            arr[arrLastIndex - 1] += arr[arrLastIndex];
            return arr[arrLastIndex - 1] / arr.length;
        } else {
            arr[arrLastIndex - 1] += arr[arrLastIndex];
            return hitungRataIPK(arr, arrLastIndex-1);
        }
    }

    public int showIndexIpkTertinggi(float[] arrIpk) { // menampilkan index mahasiswa dengan ipk tertinggi
        int highestIpkIndex = 0;
        for (int i = 0; i < arrIpk.length; i++) {
            highestIpkIndex = (arrIpk[highestIpkIndex] > arrIpk[i]) ? highestIpkIndex : i;
        }
        return highestIpkIndex;
    }

}
