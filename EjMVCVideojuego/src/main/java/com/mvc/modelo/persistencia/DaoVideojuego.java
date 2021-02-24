package com.mvc.modelo.persistencia;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.modelo.entidad.Videojuego;

@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer>{
	public Videojuego findById(int id);
	public ArrayList<Videojuego> findAll();

}
