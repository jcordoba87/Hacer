package co.edu.uan.servicio;

import co.edu.uan.usuarios.modelo.Usuario;

public interface UsuarioServicio {
	
	
	public boolean agregarUsuario(Usuario user);
	public boolean borrarUsuario(Long id);
	public Usuario obtenerUsuario(Long id);

}
