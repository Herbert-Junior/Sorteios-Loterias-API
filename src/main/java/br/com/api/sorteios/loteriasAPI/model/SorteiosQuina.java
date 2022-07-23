package br.com.api.sorteios.loteriasAPI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "sorteios_quina")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SorteiosQuina {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Integer nr_sorteio;
    private Date data_sorteio;
    private String numeros;
    private Date data_proximo_sorteio;
    private Boolean acumulou;
    private String primeiro_premio;
    private String segundo_premio;
    private String terceiro_premio;
    private String quarto_premio;
    private String quinto_premio;
    private String sexto_premio;
    private Integer qnt_primeiro;
    private Integer qnt_segundo;
    private Integer qnt_terceiro;
    private Integer qnt_quarto;
    private Integer qnt_cinco;
    private String nome_img;
    private String url_video;
    private Boolean verify;
}
