package co.edu.uan.servicio;

import java.util.HashMap;
import com.sun.javafx.collections.MappingChange.Map;
import co.edu.uan.usuarios.modelo.Usuario;

public class UsuarioServicioImpl implements UsuarioServicio {
	
	private static HashMap<Long, Usuario> usuarios = new HashMap<Long,Usuario>();
	
	@Override
	public boolean agregarUsuario(Usuario user) {
	if (usuarios.get(user.getId()) != null ) return false ;
	usuarios.put(user.getId(), user);
	return true ;
	}
	
	@Override
	public boolean borrarUsuario(Long id) {
	if ( usuarios.get(id) == null ) return false ;
	usuarios.remove(id);
	return true ;
	}
	
	@Override
	public Usuario obtenerUsuario(Long id) {
	return usuarios.get(id);
	}
	
	

}
