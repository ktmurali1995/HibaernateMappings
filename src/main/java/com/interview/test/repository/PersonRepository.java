package com.interview.test.repository;

import com.interview.test.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    @Modifying
    @Query("DELETE FROM Person p WHERE p.id = ?1")
    void deleteById(Long personId);
}
