package br.com.cwi.resetflix.repository;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;

@Repository
public class FilmeRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();
    static Long contadorIdFilmes = 1l;

    public List<FilmeEntity> getFilmes(){
        return filmes;
    }

    public List<FilmeEntity> acharFilmesAtor(final Long id) {
        //TODO Filtrar na repository por id de ator
        List<FilmeEntity> filmesAtor = new ArrayList<>();

        for(FilmeEntity filmeEntity: filmes){
            if(filmeEntity.getIdsAtores().equals(id)){
                filmesAtor.add(filmeEntity);
            }
        }
            return filmesAtor;
    }


    public List<FilmeEntity> acharFilmesDiretor(final Long id) {
        //TODO Filtrar na repository por Id de Diretor
        List<FilmeEntity> filmesDiretor = new ArrayList<>();

        for(FilmeEntity filmeEntity: filmes){
            if(filmeEntity.getIdDiretor().equals(id)){
                filmesDiretor.add(filmeEntity);
            }
        }
            return filmesDiretor;
    }

    public Long criarFilme(FilmeEntity filmesSalvar) {
        if(filmesSalvar.getId() == null){
            filmesSalvar.setId(contadorIdFilmes);
            contadorIdFilmes++;
        }
        filmes.add(filmesSalvar);
        return filmesSalvar.getId();
    }
}
