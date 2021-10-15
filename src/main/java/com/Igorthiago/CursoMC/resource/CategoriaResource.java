package com.Igorthiago.CursoMC.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Igorthiago.CursoMC.domain.Categoria;

//classe resposável pelo componentes Rest

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria c1 = new Categoria(1,"informatica");
		Categoria c2 = new Categoria(2,"wscritorio");
		
		List<Categoria> l = new ArrayList<>();
		l.add(c1);
		l.add(c2);
		return l;
		
	}
	

}
