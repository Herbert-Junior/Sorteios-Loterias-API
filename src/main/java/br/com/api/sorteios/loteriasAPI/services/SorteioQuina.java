package br.com.api.sorteios.loteriasAPI.services;

import br.com.api.sorteios.loteriasAPI.model.SorteiosMegasena;
import br.com.api.sorteios.loteriasAPI.model.SorteiosQuina;

import br.com.api.sorteios.loteriasAPI.repository.SorteioQuinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SorteioQuina {

    @Autowired
    private SorteioQuinaRepository repository;

    public void salvar(SorteiosQuina sorteio){
        repository.save(sorteio);
    }

    public Iterable<SorteiosQuina> getAll(){
        return repository.findAll();
    }

    public Optional<SorteiosQuina> getById(Integer id){
        return repository.findById(id);
    }
}
