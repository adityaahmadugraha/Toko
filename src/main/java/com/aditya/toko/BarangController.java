package com.aditya.toko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barang")

final class BarangController {
    @Autowired
    private BarangService barangService;

    @PostMapping
    public Barang createBarang(@RequestBody Barang barang) {
        return barangService.createBarang(barang);
    }

    @GetMapping
    public List<Barang> getAllBarang() {
        return barangService.getAllBarang();}

    @GetMapping("/{id}")
    public Barang getBarangById(@PathVariable Long id) {
        return barangService.getBarangById(id);
    }

    @PutMapping("/{id}")
    public Barang updateBarang(@PathVariable Long id, @RequestBody Barang barang) {
        return barangService.updateBarang(id, barang);
    }

    @DeleteMapping("/{id}")
    public void deleteBarang(@PathVariable Long id) {
        barangService.deleteBarang(id);
    }
}
