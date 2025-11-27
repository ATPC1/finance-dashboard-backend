package com.finance.dashboard.controller;

import com.finance.dashboard.model.Expense;
import com.finance.dashboard.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin // Allows React to talk to this later
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseRepository repository;

    public ExpenseController(ExpenseRepository repository) {
        this.repository = repository;
    }

    // GET all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    // POST a new expense
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return repository.save(expense);
    }
}