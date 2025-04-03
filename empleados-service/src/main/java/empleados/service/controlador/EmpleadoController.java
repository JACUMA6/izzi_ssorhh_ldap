package empleados.service.controlador;

import empleados.service.entidades.Empleados;
import empleados.service.modelos.Usuarios;
import empleados.service.servicio.EmpleadoService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


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

	@CircuitBreaker(name = "usuariosCB", fallbackMethod = "fallBackSaveUsers")
	@PostMapping("/usuario/{usuarioId}")
	public ResponseEntity<Usuarios> guardarUsers(@PathVariable("usuarioId") int usuarioId, @RequestBody Usuarios carro){
		Usuarios nuevoCarro = service.saveCarro(usuarioId, carro);
		return ResponseEntity.ok(nuevoCarro);
	}

	@CircuitBreaker(name = "allCB", fallbackMethod = "fallBackGetAll")
	@GetMapping("/todos/{usuarioId}")
	public ResponseEntity<Map<String, Object>> listarTodosLosUsuarios(@PathVariable("usuarioId") int usuarioId){
		Map<String,Object> resultado = service.getUsuarioAndVehiculos(usuarioId);
		return ResponseEntity.ok(resultado);
	}

	private ResponseEntity<Empleados> fallBackSaveUsers(@PathVariable("userId") int userId, @RequestBody Usuarios users, RuntimeException e) {
		return new ResponseEntity("El Empleado " + userId + "  no tiene ningun usuario asociado", HttpStatus.OK);
	}

	public ResponseEntity<Map<String, Object>> fallBackGetAll(@PathVariable("userId") int userId, RuntimeException e) {
		return new ResponseEntity("El Empleado " + userId + " tiene usuarios asociados", HttpStatus.OK);
	}
}