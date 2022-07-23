package br.com.api.sorteios.loteriasAPI.controller.sorteios;

import br.com.api.sorteios.loteriasAPI.model.SorteiosMegasena;
import br.com.api.sorteios.loteriasAPI.model.SorteiosQuina;
import br.com.api.sorteios.loteriasAPI.services.SorteioMegasena;
import br.com.api.sorteios.loteriasAPI.services.SorteioQuina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("quina")
public class Quina {

    @Autowired
    private SorteioQuina service;

    @GetMapping
    public Iterable<SorteiosQuina> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<SorteiosQuina> getById(@PathVariable Integer id){
        return this.service.getById(id);
    }

    @PostMapping
    public ResponseEntity<SorteiosQuina> inserir(SorteiosQuina sorteio){
        this.service.salvar(sorteio);
        return ResponseEntity.ok(sorteio);
    }
}
