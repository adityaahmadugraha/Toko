package com.aditya.toko;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BarangRepository extends JpaRepository<Barang, Long>, QuerydslPredicateExecutor<Barang> {
}
