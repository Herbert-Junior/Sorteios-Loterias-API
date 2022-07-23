package br.com.api.sorteios.loteriasAPI.services;

import br.com.api.sorteios.loteriasAPI.model.SorteiosLotofacil;
import br.com.api.sorteios.loteriasAPI.repository.SorteioLotofacilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SorteioLotofacil {

    @Autowired
    private SorteioLotofacilRepository repository;



    public void salvar(SorteiosLotofacil sorteio){
        repository.save(sorteio);
    }

    public Iterable<SorteiosLotofacil> getAll(){
        return repository.findAll();
    }

    public Optional<SorteiosLotofacil> getById(Integer id){
        return repository.findById(id);
    }
}
