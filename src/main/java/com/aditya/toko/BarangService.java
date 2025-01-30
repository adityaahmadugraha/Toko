package com.aditya.toko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangService {
    @Autowired
    private BarangRepository barangRepository;

    public Barang createBarang(Barang barang) {
        return barangRepository.save(barang);
    }

    public List<Barang> getAllBarang() {
        return barangRepository.findAll();
    }

    public Barang getBarangById(Long id) {
        return barangRepository.findById(id).orElseThrow(() -> new RuntimeException("Barang not found"));
    }

    public Barang updateBarang(Long id, Barang barang) {
        Barang existingBarang = getBarangById(id);
        existingBarang.setKodeBarang(barang.getKodeBarang());
        existingBarang.setNamaBarang(barang.getNamaBarang());
        existingBarang.setJumlahStok(barang.getJumlahStok());
        existingBarang.setHargaSatuan(barang.getHargaSatuan());
        existingBarang.setTanggalMasuk(barang.getTanggalMasuk());
        return barangRepository.save(existingBarang);
    }

    public void deleteBarang(Long id) {
        barangRepository.deleteById(id);
    }
}

