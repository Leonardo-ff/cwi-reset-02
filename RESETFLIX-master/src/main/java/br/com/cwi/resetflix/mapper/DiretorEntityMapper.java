package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.DiretoresEntity;
import br.com.cwi.resetflix.request.CriarDiretorRequest;

public class DiretorEntityMapper {

    public DiretoresEntity mapear(final CriarDiretorRequest request){
        return new DiretoresEntity(request.getNome(), request.getIdFilmes());
    }

}
