package com.example.demo.dao;

import com.example.demo.entity.product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface productRepository extends JpaRepository<product, Long> {

    Page<product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
    Page<product> findByNameContaining(@RequestParam("name") String name, Pageable page);
}
