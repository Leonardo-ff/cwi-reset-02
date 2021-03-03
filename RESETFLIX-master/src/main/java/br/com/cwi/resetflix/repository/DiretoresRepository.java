package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretoresEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DiretoresRepository {

    static List<DiretoresEntity> diretores = new ArrayList<>();
    static Long contadorIdsDiretor = 1l;

    public DiretoresRepository() {
    }

    public static List<DiretoresEntity> getDiretores() {
        return diretores;
    }

    public Long criarDiretor(final DiretoresEntity diretorSalvar){
        if(diretorSalvar.getId() == null){
            diretorSalvar.setId(contadorIdsDiretor);
        }

        diretores.add(diretorSalvar);

        return diretorSalvar.getId();
    }

    public DiretoresEntity acharDiretorPorId(Long id) {
        for(DiretoresEntity diretoresEntity: diretores){
            if(diretoresEntity.getId().equals(id)){
                return diretoresEntity;
            }
        }
        return null;
    }
}
