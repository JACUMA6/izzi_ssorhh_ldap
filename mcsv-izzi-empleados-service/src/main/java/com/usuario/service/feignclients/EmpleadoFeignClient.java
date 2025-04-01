package com.usuario.service.feignclients;

import java.util.List;

import com.usuario.service.modelos.Usuarios;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "mcsv-izzi-usuarios-service")
@RequestMapping("/users")
public interface EmpleadoFeignClient {

	@PostMapping()
	public Usuarios save(@RequestBody Usuarios users);
	
	@GetMapping("/usuario/{usuarioId}")
	public List<Usuarios> getCarros(@PathVariable("usuarioId") int usuarioId);
}
