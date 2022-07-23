package br.com.api.sorteios.loteriasAPI.services;

import br.com.api.sorteios.loteriasAPI.model.SorteiosMegasena;
import br.com.api.sorteios.loteriasAPI.repository.SorteioMegasenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SorteioMegasena {

    @Autowired
    private SorteioMegasenaRepository repository;

    public void salvar(SorteiosMegasena sorteio){
        repository.save(sorteio);
    }

    public Iterable<SorteiosMegasena> getAll(){
        return repository.findAll();
    }

    public Optional<SorteiosMegasena> getById(Integer id){
        return repository.findById(id);
    }

}
