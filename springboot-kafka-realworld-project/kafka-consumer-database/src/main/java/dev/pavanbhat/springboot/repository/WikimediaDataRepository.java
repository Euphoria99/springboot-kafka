package dev.pavanbhat.springboot.repository;

import dev.pavanbhat.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
