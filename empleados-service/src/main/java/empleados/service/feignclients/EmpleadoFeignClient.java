package empleados.service.feignclients;

import empleados.service.modelos.Usuarios;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "usuarios-service")
@RequestMapping("/users")
public interface EmpleadoFeignClient {

	@PostMapping()
	public Usuarios save(@RequestBody Usuarios users);
	
	@GetMapping("/usuario/{usuarioId}")
	public List<Usuarios> getUsuarios(@PathVariable("usuarioId") int usuarioId);
}
