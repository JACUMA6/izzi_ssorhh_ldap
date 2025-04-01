package com.usuario.service.feignclients;

import com.usuario.service.modelos.Usuarios;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "mcsv-izzi-usuarios-service")
@RequestMapping("/users")
public interface EmpleadoFeignClient {

	@PostMapping()
	public Usuarios save(@RequestBody Usuarios users);
	
	@GetMapping("/usuario/{usuarioId}")
	public List<Usuarios> getCarros(@PathVariable("usuarioId") int usuarioId);
}
