package apibase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apibase.model.cidade;

@Repository
public interface CidadeRepository extends JpaRepository<cidade, Long> {

    List<cidade> findByDescricao(String descricao);

    List<cidade> findByUf(String uf);

    List<cidade> findByRegiaoid(Long regiaoid);
}