package com.finance.dashboard.repository;

import com.finance.dashboard.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface gives us free methods like .save(), .findAll(), .delete()
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}