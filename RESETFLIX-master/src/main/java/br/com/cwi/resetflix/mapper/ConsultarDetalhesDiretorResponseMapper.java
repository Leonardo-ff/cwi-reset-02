package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.DiretoresEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.FilmeResponse;

import java.util.List;

public class ConsultarDetalhesDiretorResponseMapper {

    public ConsultarDetalhesDiretorResponse mapear(final DiretoresEntity diretorSalvo,
                                                   final List<FilmeEntity> filmesDiretor){
        List<FilmeResponse> filmeResponse = new FilmeResponseMapper().mapear(filmesDiretor);
        return new ConsultarDetalhesDiretorResponse(diretorSalvo.getId(), diretorSalvo.getNome(),
                filmeResponse);
    }

    /*public ConsultarDetalhesAtorResponse mapear(final AtorEntity atorSalvo, final List<FilmeEntity> filmesAtor) {
        List<FilmeResponse> filmesResponse = new FilmeResponseMapper().mapear(filmesAtor);
        return new ConsultarDetalhesAtorResponse(atorSalvo.getId(),
            atorSalvo.getNome(), filmesResponse);
    }*/
}
