package com.aditya.toko;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangService {

    private final BarangRepository barangRepository;

    public BarangService(BarangRepository barangRepository) {
        this.barangRepository = barangRepository;
    }

    public List<Barang> getAllBarang() {
        return barangRepository.findAll();
    }

    public Barang createBarang(Barang barang) {
        return barangRepository.save(barang);
    }
    public Barang getBarangById(Long id) {
        return barangRepository.findById(id).orElseThrow(() -> new RuntimeException("Barang Tidak Ditemukan"));
    }

    public Barang updateBarang(Long id, Barang barang) {
        Barang updateBarang = getBarangById(id);
        updateBarang.setKodeBarang(barang.getKodeBarang());
        updateBarang.setNamaBarang(barang.getNamaBarang());
        updateBarang.setJumlahStok(barang.getJumlahStok());
        updateBarang.setHargaSatuan(barang.getHargaSatuan());
        updateBarang.setTanggalMasuk(barang.getTanggalMasuk());
        return barangRepository.save(updateBarang);
    }

    public void deleteBarang(Long id) {
        barangRepository.deleteById(id);
    }



}

