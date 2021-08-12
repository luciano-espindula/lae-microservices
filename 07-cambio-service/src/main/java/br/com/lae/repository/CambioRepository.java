package br.com.lae.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lae.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio,	Long>{

	Cambio findByFromAndTo(String from, String to);
}
