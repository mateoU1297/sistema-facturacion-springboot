package com.udemy.springboot.di.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.udemy.springboot.di.app.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
