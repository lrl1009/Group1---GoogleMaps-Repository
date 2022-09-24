package sru.edu.luczak.GoogleMaps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sru.edu.luczak.GoogleMaps.domain.Students;

public interface StudentRepository extends JpaRepository<Students, String> {}
