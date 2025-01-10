package com.exe.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "produk")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Product{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nama_barang")
    private String namaBarang;
    @Column (name = "harga_barang")
    private double hargaBarang;
    @Column(name = "stok")
    private int stok;

}
