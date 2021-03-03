package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.entity.DiretoresEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.*;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarDiretorRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretoresService {

    @Autowired
    private DiretoresRepository diretoresRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    static DiretoresResponseMapper MAPPER_RESPONSE_DIRETOR = new DiretoresResponseMapper();
    static DiretorEntityMapper MAPPER_ENTITY_DIRETOR = new DiretorEntityMapper();
    static ConsultarDetalhesDiretorResponseMapper MAPPER_DETALHES_DIRETOR = new ConsultarDetalhesDiretorResponseMapper();

    public List<DiretoresResponse> getDiretors() {
        final List<DiretoresEntity> diretores = diretoresRepository.getDiretores();
        return MAPPER_RESPONSE_DIRETOR.mapear(diretores);
    }

    public Long criarDiretor(final CriarDiretorRequest request){
        DiretoresEntity diretorSalvar = MAPPER_ENTITY_DIRETOR.mapear(request);
        return diretoresRepository.criarDiretor(diretorSalvar);
    }

    public ConsultarDetalhesDiretorResponse consultarDetalhesDiretor(final Long id){
        DiretoresEntity diretorSalvo = diretoresRepository.acharDiretorPorId(id);
        List<FilmeEntity> filmesDiretor = filmeRepository.acharFilmesDiretor(id);
        return MAPPER_DETALHES_DIRETOR.mapear(diretorSalvo, filmesDiretor);
    }
    /*
    * public ConsultarDetalhesAtorResponse consultarDetalhesAtor(final Long id) {
        AtorEntity atorSalvo = atoresRepository.acharAtorPorId(id);
        List<FilmeEntity> filmesAtor = filmeRepository.acharFilmesAtor(id);
        return MAPPER_DETALHES_ATOR.mapear(atorSalvo, filmesAtor);
    }*/
}
