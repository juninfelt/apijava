package apibase.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apibase.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
