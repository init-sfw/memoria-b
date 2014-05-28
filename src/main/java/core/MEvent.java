package core;

import java.util.Date;

/**
 * Clase que representa a un evento de memoria con sus atributos
 * @author fede
 *
 */
public class MEvent {
	
	private Date fecha;
	private Date fechaCreacion;
	private String titulo;
	private String categoria;
	private String pais;
	private String descripcionBreve;
	private String link;
	private byte[] imagen;
	private int ponderacion;
	
	public MEvent() {
		
	}

	public MEvent(Date fecha, Date fechaCreacion, String titulo,
			String categoria, String pais, String descripcionBreve,
			String link, byte[] imagen, int ponderacion) {
		super();
		this.fecha = fecha;
		this.fechaCreacion = fechaCreacion;
		this.titulo = titulo;
		this.categoria = categoria;
		this.pais = pais;
		this.descripcionBreve = descripcionBreve;
		this.link = link;
		this.imagen = imagen;
		this.ponderacion = ponderacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDescripcionBreve() {
		return descripcionBreve;
	}

	public void setDescripcionBreve(String descripcionBreve) {
		this.descripcionBreve = descripcionBreve;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public int getPonderacion() {
		return ponderacion;
	}

	public void setPonderacion(int ponderacion) {
		this.ponderacion = ponderacion;
	}
}
