package com.prueba.pruebasrping.repository;

import com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO;
import com.prueba.pruebasrping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("""
        SELECT new com.prueba.pruebasrping.dto.response.ProductStockProjectionDTO(
            p.name, p.stock, b.name, f.name
        )
        FROM Product p
        JOIN p.branch b
        JOIN b.franchise f
        WHERE f.id = :franchiseId
          AND p.stock = (
              SELECT MAX(p2.stock)
              FROM Product p2
              WHERE p2.branch.id = p.branch.id
          )
        ORDER BY b.name
        """)
    List<ProductStockProjectionDTO> findHighestStockProductByBranchForFranchise(@Param("franchiseId") Long franchiseId);
}
