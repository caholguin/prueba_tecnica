package com.prueba.pruebasrping.repository;

import com.prueba.pruebasrping.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRespository extends JpaRepository<Branch, Long> {
}
