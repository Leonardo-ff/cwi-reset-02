package br.com.cwi.resetflix.web;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import br.com.cwi.resetflix.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/series")
public class SeriesController implements SeriesContract{


    @Autowired
    private SeriesService seriesService;

    @Override
    public List<SerieResponse> getSeries(Genero genero) {
        return seriesService.getSeriesPorGenero(genero);
    }

    @Override
    public ConsultarDetalhesSerieResponse getSerieById(Long id) {
        return null;
    }

    @Override
    public Long criarSerie(CriarSerieRequest request) {
        return null;
    }

    @Override
    public List<SerieResponse> getSeries() {
        return null;
    }

    @Override
    public void assistirSerie(Long id, Integer temporada, Integer episodio) {

    }
}
