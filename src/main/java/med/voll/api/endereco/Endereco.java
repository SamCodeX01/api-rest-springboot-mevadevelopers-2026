package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable // Classe embutida, os atributos dessa classe serão utilizados em outra classe
//Lombok
@Getter // Gera métodos getters para todos os campos
@NoArgsConstructor // Cria construtor sem argumentos (vazio)
@AllArgsConstructor // Cria construtor com TODOS os campos
@EqualsAndHashCode(of = "id") // Gera equals() e hashCode() usando apenas o campo "id"
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;
}
