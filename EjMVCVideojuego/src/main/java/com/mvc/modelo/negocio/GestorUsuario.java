package com.mvc.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.modelo.entidad.Usuario;
import com.mvc.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {

	@Autowired
	private DaoUsuario daoUsuario;
	public boolean validarUsuario(Usuario usuario) {
		Usuario usuarioAux = 
				daoUsuario
				.findByNombreAndPassword(usuario.getNombre(), 
				usuario.getPassword());
		
		if(usuarioAux == null) {
			return false;
		}else {
			return true;
		}
	}
}
