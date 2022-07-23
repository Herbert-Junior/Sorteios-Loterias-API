package br.com.api.sorteios.loteriasAPI.controller.sorteios;

import br.com.api.sorteios.loteriasAPI.model.SorteiosLotofacil;
import br.com.api.sorteios.loteriasAPI.services.SorteioLotofacil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("lotofacil")
public class Lotofacil {

    @Autowired
    private SorteioLotofacil service;
    
    @GetMapping
    public Iterable<SorteiosLotofacil> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<SorteiosLotofacil> getById(@PathVariable Integer id){
        return this.service.getById(id);
    }

    @PostMapping
    public ResponseEntity<SorteiosLotofacil> inserir(SorteiosLotofacil sorteio){
        this.service.salvar(sorteio);
        return ResponseEntity.ok(sorteio);
    }
}
