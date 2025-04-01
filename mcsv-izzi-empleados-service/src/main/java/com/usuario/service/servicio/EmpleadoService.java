package com.usuario.service.servicio;

import com.usuario.service.entidades.Empleados;
import com.usuario.service.feignclients.EmpleadoFeignClient;
import com.usuario.service.modelos.Usuarios;
import com.usuario.service.repositorio.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Autowired
	private EmpleadoFeignClient empleadoFeignClient;

	public List<Empleados> getAll() {
		return empleadoRepository.findAll();
	}

	public Empleados getUsuarioById(int id) {
		return empleadoRepository.findById(id).orElse(null);
	}

	public Empleados save(Empleados empleados) {
		Empleados nuevoEmpleado = empleadoRepository.save(empleados);
		return nuevoEmpleado;
	}

	public Usuarios saveCarro(int usuarioId, Usuarios users) {
		users.setUsuarioId(usuarioId);
		Usuarios newUsers = empleadoFeignClient.save(users);
		return newUsers;
	}

	
	public Map<String, Object> getUsuarioAndVehiculos(int usuarioId){
		Map<String,Object> resultado = new HashMap<>();
		Empleados empleados = empleadoRepository.findById(usuarioId).orElse(null);
		
		if(empleados == null) {
			resultado.put("Mensaje", "El usuario no existe");
			return resultado;
		}
		
		resultado.put("Empleados",empleados);
		List<Usuarios> users = empleadoFeignClient.getCarros(usuarioId);
		if(users.isEmpty()) {
			resultado.put("Usuarios", "El empleado no tiene usuarios relacionados");
		}
		else {
			resultado.put("Usuarios", users);
		}

		return resultado;
	}

}