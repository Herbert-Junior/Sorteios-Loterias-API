package br.com.api.sorteios.loteriasAPI.controller.sorteios;

import br.com.api.sorteios.loteriasAPI.model.SorteiosLotofacil;
import br.com.api.sorteios.loteriasAPI.model.SorteiosMegasena;
import br.com.api.sorteios.loteriasAPI.services.SorteioLotofacil;
import br.com.api.sorteios.loteriasAPI.services.SorteioMegasena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("megasena")
public class Megasena {

    @Autowired
    private SorteioMegasena service;

    @GetMapping
    public Iterable<SorteiosMegasena> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<SorteiosMegasena> getById(@PathVariable Integer id){
        return this.service.getById(id);
    }

    @PostMapping
    public ResponseEntity<SorteiosMegasena> inserir(SorteiosMegasena sorteio){
        this.service.salvar(sorteio);
        return ResponseEntity.ok(sorteio);
    }
}
