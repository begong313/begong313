package com.example.springtest.repository;

import com.example.springtest.code.StatusCode;
import com.example.springtest.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

    Optional<Developer> findByMemberId(String memberId);

    List<Developer> findDevelopersByStatusCodeEquals(StatusCode statusCode);
}
