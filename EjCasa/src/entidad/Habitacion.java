package entidad;

public class Habitacion {
	private double m2;
	private String tipoHab;
	
	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public String getTipoHab() {
		return tipoHab;
	}

	public void setTipoHab(String tipoHab) {
		this.tipoHab = tipoHab;
	}
	
	@Override
	public String toString() {
		return "Habitaciones [m2=" + m2 + ", tipoHab=" + tipoHab + "]";
	}

}
