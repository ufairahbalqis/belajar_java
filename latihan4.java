package com.belajar;

import java.util.Scanner;
public class latihan4 {
    public static void main(String[] args) {
        //Mengolah Input Data Sederhana
        //Menggunakan Class Scanner
        int NISN, Usia;
        String Nama, Alamat;
        Scanner Input = new Scanner(System.in);
        System.out.println("DATA SISWA");
        System.out.println("------------");
        System.out.println("NISN");
        NISN = Input.nextInt();
        System.out.println("Nama : ");
        Nama = Input.next();
        System.out.println("Alamat : ");
        Alamat = Input.next();
        System.out.println("Usia : ");
        Usia = Input.nextInt();
        //Menampilkan Data Siswa
        System.out.println("DATA SISWA");
        System.out.println("------------");
        System.out.println("NISN : + NISN");
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Usia : " + Usia);


    }
    
}
