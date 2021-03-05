package br.com.cwi.resetflix.entity;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class SerieEntity {

    /*
   
    * - As mesmas implementações dos Filmes, mas ao invés de um Diretor, elas terão quantidade de Temporadas
    *  e Episódios.
- Ela pode ser uma entidade, salvando no usuario o episodio e temporada que ja assistitiu*/

    private Long id;
    private String nome;
    private Genero genero;
    private List<TemporadasEntity> temporadas;
    private List<Long> idsAtores;

    public SerieEntity(Long id, String nome, Genero genero, List<TemporadasEntity> temporadas, List<Long> idsAtores) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.temporadas = temporadas;
        this.idsAtores = idsAtores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<TemporadasEntity> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<TemporadasEntity> temporadas) {
        this.temporadas = temporadas;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }
}
