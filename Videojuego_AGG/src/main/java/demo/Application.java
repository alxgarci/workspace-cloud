package demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Videojuego;
import demo.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		DaoVideojuego daoVid = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		Videojuego vid1 = new Videojuego();
		vid1.setCompania("Ubisoft");
		vid1.setNombre("Watch OS 2");
		vid1.setPrecio(12.3);
		vid1.setPuntuacion(3.3);
		daoVid.save(vid1);
		
		Videojuego vid2 = new Videojuego();
		vid2.setCompania("Gameloft");
		vid2.setNombre("Fatman 5");
		vid2.setPrecio(16);
		vid2.setPuntuacion(4.2);
		daoVid.save(vid2);
		
		System.out.println(daoVid.findById(1).get());
		
		Optional<Videojuego> vidOptional = daoVid.findById(2);
		if (vidOptional.isPresent()) {
			System.out.println("Existe el videojuego");
			System.out.println(vidOptional.get());
		} else {
			System.out.println("El videojuego no existe");
		}
		
		List<Videojuego> listaVid = daoVid.findAll();
		System.out.println(listaVid);
		
		daoVid.deleteById(1);
		listaVid = daoVid.findAll();
		System.out.println(listaVid);
	}

}
