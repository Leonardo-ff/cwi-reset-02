package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.SerieEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeriesRepository {

    private List<SerieEntity> series = new ArrayList<>();
    private Long contador = 1l;

    public List<SerieEntity> getSeries() {
        return series;
    }
}
