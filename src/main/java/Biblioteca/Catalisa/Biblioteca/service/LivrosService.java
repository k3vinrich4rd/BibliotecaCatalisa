package Biblioteca.Catalisa.Biblioteca.service;

import Biblioteca.Catalisa.Biblioteca.model.LivrosModel;
import Biblioteca.Catalisa.Biblioteca.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {

    @Autowired
    private LivrosRepository livrosRepository;

    public List<LivrosModel> exibirLivros() {
        return livrosRepository.findAll();
    }

    public Optional<LivrosModel> buscarId(Long codigo) {
        return livrosRepository.findById(codigo);
    }

    public LivrosModel cadastrarLivro(LivrosModel livrosModel) {
        livrosModel.getCodigoDoLivro();
        livrosModel.getNomeDoLivro();
        livrosModel.getAutorDoLivro();
        livrosModel.getDataDeLancamento();

        return livrosRepository.save(livrosModel);
    }

    public LivrosModel alterarLivro(LivrosModel livrosModel) {
        livrosModel.getCodigoDoLivro();
        livrosModel.getNomeDoLivro();
        livrosModel.getAutorDoLivro();
        livrosModel.getDataDeLancamento();

        return livrosRepository.save(livrosModel);
    }

    public void deletar(Long codigo) {
        livrosRepository.deleteById(codigo);
    }


}
