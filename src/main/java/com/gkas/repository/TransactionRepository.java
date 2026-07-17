package com.gkas.repository;

import com.gkas.model.Transaction;
import com.gkas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query("SELECT t FROM Transaction t WHERE t.sender = :user OR t.receiver = :user ORDER BY t.createdAt DESC")
    List<Transaction> findAllByUser(User user);

    List<Transaction> findBySenderOrderByCreatedAtDesc(User sender);
    List<Transaction> findByReceiverOrderByCreatedAtDesc(User receiver);
}