package br.com.api.sorteios.loteriasAPI.repository;

import br.com.api.sorteios.loteriasAPI.model.SorteiosLotofacil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SorteioLotofacilRepository extends CrudRepository<SorteiosLotofacil, Integer> {
}
