
/*ENCAPSULAMIENTO
 * 
 * 		Ocultar informacion que no es reelevante para algunos contextos  
 */

class CuentaUsuario{
	private String nombreUsuario;
	private String contraseña;
	private int cantidadConexiones;
	private boolean activa;
	
	public CuentaUsuario () {}
	
	public CuentaUsuario (String nombreUsuario, String contraseña, int cantidadConexiones, boolean activa) {
		this.nombreUsuario=nombreUsuario;
		this.contraseña=contraseña;
		this.cantidadConexiones=cantidadConexiones;
		this.activa=activa;
	}
	
	//metodos accesores (GETTER´s y SETTER´s)
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario=nombreUsuario;
	}
	
	
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña=contraseña;
	}
	
	
	public int getCantidadConexiones() {
		return cantidadConexiones;
	}
	public void setCantidadConexiones(int cantidadConexiones) {
		this.cantidadConexiones=cantidadConexiones;
	}
	
	
	public boolean getActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa=activa;
	}
	
	
	public boolean verificarAcceso() {
		//busca en la bd el usuario y la conexion
		verificarConexiones();
		return false;
	}
	
	public void verificarConexiones() {
		
	}
	
	
}//class CuentaUsuario

public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		
		CuentaUsuario cu1 = new CuentaUsuario();
		//System.out.println(cu1.nombreUsuario); (Ya no se puede acceder directamente al atributo 
												//debido  a que esta encapsulado)
		System.out.println(cu1.getNombreUsuario());//Se accede a traves de un getter
		
		cu1.setNombreUsuario("Magia magia");
		System.out.println(cu1.getNombreUsuario());
		System.out.println(cu1.getContraseña());
		System.out.println(cu1.getCantidadConexiones());
		System.out.println(cu1.getActiva());
		
		System.out.println("------------------------------------------------");
		CuentaUsuario cu2 = new CuentaUsuario("U1","U1",0, true);
		System.out.println(cu2.getNombreUsuario());
		System.out.println(cu2.getContraseña());
		System.out.println(cu2.getCantidadConexiones());
		System.out.println(cu2.getActiva());
		
		
		
		
	}

}
