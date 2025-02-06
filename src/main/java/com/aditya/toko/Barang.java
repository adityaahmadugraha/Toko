package com.aditya.toko;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "barang")
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kodeBarang;

    private String namaBarang;

    private int jumlahStok;

    private double hargaSatuan;

    @Temporal(TemporalType.DATE)
    private LocalDate tanggalMasuk;

}
