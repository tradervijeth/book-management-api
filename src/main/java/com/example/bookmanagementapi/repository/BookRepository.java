// src/main/java/com/example/bookmanagementapi/repository/BookRepository.java
package com.example.bookmanagementapi.repository;

import com.example.bookmanagementapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Additional custom queries can be added here
}