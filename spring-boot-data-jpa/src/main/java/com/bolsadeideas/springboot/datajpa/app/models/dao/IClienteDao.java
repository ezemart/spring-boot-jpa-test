package com.bolsadeideas.springboot.datajpa.app.models.dao;
 
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.datajpa.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	

}
