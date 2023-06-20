package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Alumno;



public interface AlumnoRepository extends JpaRepository<Alumno, String> {

}
