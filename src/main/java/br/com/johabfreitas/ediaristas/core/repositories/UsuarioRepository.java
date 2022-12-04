package br.com.johabfreitas.ediaristas.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.johabfreitas.ediaristas.core.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
