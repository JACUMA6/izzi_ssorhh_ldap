package usuarios.service.servicios;

import java.util.List;

import usuarios.service.entidades.Usuarios;
import usuarios.service.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuarios> getAll(){
		return repository.findAll();
	}
	
	public Usuarios getUsersById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Usuarios save(Usuarios users) {
		Usuarios newUsers = repository.save(users);
		return newUsers;
	}
	
	public List<Usuarios> byUsuarioId(int usuarioId){
		return repository.findByUsuarioId(usuarioId);
	}
}
