package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;


/*o record cria automaticamente: construtor, getters, equals(), hashCode(), toString()
É imutável por padrão (seus dados não podem ser alterados depois de criado)
*/
public record DadosCadastroMedico(
        @NotNull //Não pode ser nulo
        @NotBlank //Não pode ser nulo e vazio, serve só para campos em Strings
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        String telefone,

        @NotNull
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco){
}
