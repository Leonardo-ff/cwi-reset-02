package br.com.cwi.resetflix.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.FilmeResponse;

public class FilmeResponseMapper {

    public List<FilmeResponse> mapear(final List<FilmeEntity> filmesAtor) {
        List<FilmeResponse> responses = new ArrayList<>();

        for(FilmeEntity filmeEntity : filmesAtor){
            responses.add(new FilmeResponse(filmeEntity.getId(),
                filmeEntity.getNome(), filmeEntity.getGenero()));
        }

        return responses;
    }

    public List<FilmeResponse> mapearPorGenero(Genero genero, List<FilmeEntity> filmesGenero) {
        List<FilmeResponse> responses = new ArrayList<>();

        for(FilmeEntity filmeEntity : filmesGenero){
            if(filmeEntity.getGenero() == genero){
                responses.add(new FilmeResponse(filmeEntity.getId(),
                        filmeEntity.getNome(), filmeEntity.getGenero()));
            }
        }
        return responses;
    }
}
