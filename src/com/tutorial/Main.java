package com.tutorial;


// class tanpa constructor
class Polos {
    String dataString;
    int dataInt;
}

// class denaan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // constructor, dipanggil pertama kali saat object dibuat
    // Mahasiswa() {
    //     System.out.println("Ini adalah konstruktor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main{

    public static void main(String[] args) throws Exception {


        Mahasiswa mahasiswa1 = new Mahasiswa("Fara", "1911510012", "Teknik");
        Mahasiswa mahasiswa2 = new Mahasiswa("Firman", "1911510012", "Teknik");
    
        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "Data";
        // objectPolos.dataInt = 12;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInt);
    }

}