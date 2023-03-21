package com.example.Mct.repository;
import com.example.Mct.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
}
