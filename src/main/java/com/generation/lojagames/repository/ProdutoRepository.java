package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);
	
	/* Interface de consulta para criar consultas personalizadas
	SELECT * FROM tb_postagens WHERE titulo LIKE "%xxxx%" */
}
