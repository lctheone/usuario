package com.lcassuncao.usuario.infrastructure.repository;

import com.lcassuncao.usuario.infrastructure.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    static boolean existsByEmail(String email) {
        return false;
    }

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
