package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.mapper.SerieResponseMapper;
import br.com.cwi.resetflix.repository.SeriesRepository;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;

    private SerieResponseMapper MAPPER_SERIE_RESPONSE = new SerieResponseMapper();

    public List<SerieResponse> getSeriesPorGenero(Genero genero) {
        List<SerieEntity> serieResponses = seriesRepository.getSeries();
        return MAPPER_SERIE_RESPONSE.mapearPorGenero(genero, serieResponses);

    }
}
