package com.aditya.toko;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table(name = "barang")
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "kode_barang", nullable = false, unique = true, length = 50)
    private String kodeBarang;


    @Column(name = "nama_barang", nullable = false, length = 100)
    private String namaBarang;


    @Column(name = "jumlah_stok", nullable = false)
    private int jumlahStok;


    @Column(name = "harga_satuan", nullable = false)
    private double hargaSatuan;


    @Temporal(TemporalType.DATE)
    @Column(name = "tanggal_masuk", nullable = false)
    private LocalDate tanggalMasuk;



    @Override
    public String toString() {
        return "Barang{" +
                "id=" + id +
                ", kodeBarang='" + kodeBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", jumlahStok=" + jumlahStok +
                ", hargaSatuan=" + hargaSatuan +
                ", tanggalMasuk=" + tanggalMasuk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barang barang = (Barang) o;
        return id.equals(barang.id);
    }



    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
