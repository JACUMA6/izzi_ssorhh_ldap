package com.usuario.service.controlador;

import java.util.List;
import java.util.Map;

import com.usuario.service.entidades.Empleados;
import com.usuario.service.modelos.Usuarios;
import com.usuario.service.servicio.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService service;
	
	@GetMapping
	public ResponseEntity<List<Empleados>> listarUsuarios(){
		List<Empleados> empleados = service.getAll();
		if(empleados.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(empleados);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Empleados> obtenerUsuario(@PathVariable("id") int id){
		Empleados empleados = service.getUsuarioById(id);
		if(empleados == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(empleados);
	}
	
	@PostMapping
	public ResponseEntity<Empleados> guardarUsuario(@RequestBody Empleados empleados){
		Empleados nuevoEmpleado = service.save(empleados);
		return ResponseEntity.ok(nuevoEmpleado);
	}

	@PostMapping("/carro/{usuarioId}")
	public ResponseEntity<Usuarios> guardarCarro(@PathVariable("usuarioId") int usuarioId, @RequestBody Usuarios carro){
		Usuarios nuevoCarro = service.saveCarro(usuarioId, carro);
		return ResponseEntity.ok(nuevoCarro);
	} 

	
	@GetMapping("/todos/{usuarioId}")
	public ResponseEntity<Map<String, Object>> listarTodosLosUsuarios(@PathVariable("usuarioId") int usuarioId){
		Map<String,Object> resultado = service.getUsuarioAndVehiculos(usuarioId);
		return ResponseEntity.ok(resultado);
	}
}