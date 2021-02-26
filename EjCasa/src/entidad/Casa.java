package entidad;

import java.util.ArrayList;

public class Casa {
	private ArrayList<Habitacion> listaHabitaciones;
	private ArrayList<Persona> listaInquilinos;
	private Persona persona;
	private Direccion direccion;
	private double precio;
	
	
	
	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public ArrayList<Persona> getListaInquilinos() {
		return listaInquilinos;
	}

	public void setListaInquilinos(ArrayList<Persona> listaInquilinos) {
		this.listaInquilinos = listaInquilinos;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Casa [listaHabitaciones=" + listaHabitaciones + ", listaInquilinos=" + listaInquilinos + ", persona="
				+ persona + ", direccion=" + direccion + ", precio=" + precio + "]";
	}



	public double metrosCuadrados() {
		double m2 = 0;
		for (int i = 0; i < listaHabitaciones.size(); i++) {
			m2 += listaHabitaciones.get(i).getM2();
		}
		return m2;
		
	}

}
