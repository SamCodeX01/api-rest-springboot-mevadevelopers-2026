package med.voll.api.endereco;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/*o record cria automaticamente: construtor, getters, equals(), hashCode(), toString()
É imutável por padrão (seus dados não podem ser alterados depois de criado)
*/
public record DadosEndereco(
        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,

        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        String complemento,
        String numero) {
}



