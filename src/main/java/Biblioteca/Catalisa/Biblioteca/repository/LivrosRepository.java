package Biblioteca.Catalisa.Biblioteca.repository;

import Biblioteca.Catalisa.Biblioteca.model.LivrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository<LivrosModel, Long> {

}
