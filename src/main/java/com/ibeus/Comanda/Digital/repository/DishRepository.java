package com.ibeus.Comanda.Digital.repository;

import com.ibeus.Comanda.Digital.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}