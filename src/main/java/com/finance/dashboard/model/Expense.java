package com.finance.dashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

@Entity // This tells Spring: "Make a database table out of this class"
@Data   // This tells Lombok: "Auto-generate getters, setters, and toString"
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique ID for every expense

    private String description; // e.g., "Grocery Shopping"
    private Double amount;      // e.g., 50.00
    private String category;    // e.g., "Food"
    private LocalDate date;     // e.g., 2025-11-26
}