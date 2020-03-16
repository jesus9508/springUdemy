package com.formacionbdi.models.dao;

import java.util.List;

import com.formacionbdi.models.entity.Usuario;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/*public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{*/
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
        
}