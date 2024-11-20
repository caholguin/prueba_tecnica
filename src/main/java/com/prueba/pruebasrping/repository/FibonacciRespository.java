package com.prueba.pruebasrping.repository;

import com.prueba.pruebasrping.entity.Fibonacci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FibonacciRespository extends JpaRepository<Fibonacci, Long> {
}
