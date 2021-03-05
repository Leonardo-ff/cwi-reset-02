package br.com.cwi.resetflix.entity;

import java.util.List;

public class TemporadasEntity {

    private Long idTemporada;
    private List<Long> episodios;

    public TemporadasEntity(Long idTemporada, List<Long> episodios) {
        this.idTemporada = idTemporada;
        this.episodios = episodios;
    }

    public Long getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Long idTemporada) {
        this.idTemporada = idTemporada;
    }

    public List<Long> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Long> episodios) {
        this.episodios = episodios;
    }
}
