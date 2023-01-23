package com.example.bookmyshow1.Repository;

import com.example.Book_my_show_backend.Models.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
}
