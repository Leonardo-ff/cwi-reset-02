package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.SerieResponse;

import java.util.ArrayList;
import java.util.List;

public class SerieResponseMapper {


    public List<SerieResponse> mapearPorGenero(Genero genero, List<SerieEntity> seriesGenero) {
        List<SerieResponse> responses = new ArrayList<>();

        for(SerieEntity serieEntity : seriesGenero){
            if(serieEntity.getGenero() == genero){
                responses.add(new SerieResponse(serieEntity.getId(),
                        serieEntity.getNome(), serieEntity.getGenero()));
            }
        }
        return responses;
    }
}
