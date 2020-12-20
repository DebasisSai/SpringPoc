package com.dev.reactive.Repositories;

import com.dev.reactive.models.Product;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveSortingRepository<Product,Integer> {
}
