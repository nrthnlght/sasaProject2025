package com.exe.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "produk")
public class Product{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_barang")
    private String namaBarang;
    @Column (name = "harga_barang")
    private int hargaBarang;
    @Column(name = "stok")
    private int stok;

    public Product(){

    }

    public Product(String namaBarang, int hargaBarang, int stok) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.stok = stok;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

}
