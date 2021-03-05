package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {


    @Autowired
    private FilmeRepository filmesRepository;

    static FilmeResponseMapper MAPPER_FILMES_RESPONSE = new FilmeResponseMapper();
    static FilmeEntityMapper MAPPER_FILMES_ENTITY   = new FilmeEntityMapper();

    public List<FilmeResponse> getFilmesPorGenero(Genero genero) {
        final List<FilmeEntity> filmes = filmesRepository.getFilmes();
        return MAPPER_FILMES_RESPONSE.mapearPorGenero(genero, filmes);
    }

    public Long criarFilme(CriarFilmeRequest request) {
        FilmeEntity filmesSalvar = MAPPER_FILMES_ENTITY.mapear(request);
        return filmesRepository.criarFilme(filmesSalvar);
    }
}
