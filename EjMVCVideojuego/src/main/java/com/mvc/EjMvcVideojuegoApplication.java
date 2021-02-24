package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mvc.modelo.entidad.Usuario;
import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.persistencia.DaoUsuario;
import com.mvc.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class EjMvcVideojuegoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjMvcVideojuegoApplication.class, args);
		
		DaoVideojuego dv = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		Videojuego v1 = new Videojuego();
		v1.setNombre("Sonic Remastered");
		v1.setCompania("Soga");
		v1.setPrecio(34.99);
		v1.setPuntuacion(4.6);
		
		dv.save(v1);
		
		Videojuego v2 = new Videojuego();
		v2.setNombre("New Super Ultra Mega Hiper Mario Bros");
		v2.setCompania("Nontiendo");
		v2.setPrecio(26.99);
		v2.setPuntuacion(3.4);
		
		dv.save(v2);
		
		Videojuego v3 = new Videojuego();
		v3.setNombre("FIFA 2077");
		v3.setCompania("EA");
		v3.setPrecio(22.83);
		v3.setPuntuacion(2.3);
		
		dv.save(v3);
		
		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
		
		Usuario u1 = new Usuario();
		u1.setNombre("admin");
		u1.setPassword("admin");
		
		du.save(u1);
	}

}
