package com.bookStore.repository;

import com.bookStore.entity.myBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository<myBook, Integer> {
}
