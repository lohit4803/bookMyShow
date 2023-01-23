package com.example.bookmyshow1.Repository;

import com.example.Book_my_show_backend.Models.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {

    TheaterEntity findByNameAndCity(String name,String city);
}
