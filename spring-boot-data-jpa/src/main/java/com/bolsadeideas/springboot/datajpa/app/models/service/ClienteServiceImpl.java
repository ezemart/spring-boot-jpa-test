package com.bolsadeideas.springboot.datajpa.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.datajpa.app.models.dao.IClienteDao;
import com.bolsadeideas.springboot.datajpa.app.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	IClienteDao clienteDao;

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDao.save(cliente);
	}

	@Override
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.delete(id);
	}

}
