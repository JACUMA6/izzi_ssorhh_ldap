package mcsv.izzi.usuarios.service.repositorio;

import java.util.List;

import mcsv.izzi.usuarios.service.entidades.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Integer>{

	List<Usuarios> findByUsuarioId(int usuarioId);
	
}
