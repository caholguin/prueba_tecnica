package com.prueba.pruebasrping.repository;

import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.entity.Franchise;
import com.prueba.pruebasrping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FranchiseRepository extends JpaRepository<Franchise, Long> {
}
