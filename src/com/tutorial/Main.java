package com.tutorial;

class Mahasiswa {

    // Data member
    String nama;
    String nim;
    
    // constructor 
    Mahasiswa(String nama, String nim) { // => ini punya scope void main
        this.nama = nama;   // this.nama artinya ini punyanya class mahasiswa
        this.nim = nim;     // this.nim artinya ini punya class mahasiswa
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama: " + this.nama + " " + "NIM: " + this.nim);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tapi tidak dengan parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.nim;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah " + this.nama;
    }

}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Fara", "1911510012");

        // method
        mahasiswa.show();
        mahasiswa.setNama("Firman");
        mahasiswa.show();

        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getNIM());

        System.out.println(mahasiswa.sayHi("Halooo"));
    }
}