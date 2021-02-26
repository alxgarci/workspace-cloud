package entidad;

public class Direccion {
	private String tipoVia;
	private String nombre;
	private int cp;
	private int num;

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombre=" + nombre + ", cp=" + cp + ", num=" + num + "]";
	}
	
	
}
