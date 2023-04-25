package proyecto;

import java.io.Serializable;

public class datos_compra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private String id;
	 private String productos;
	 private String cantidad;
	 private String precio;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductos() {
		return productos;
	}
	public void setProductos(String productos) {
		this.productos = productos;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
