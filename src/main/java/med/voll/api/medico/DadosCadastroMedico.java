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

/*
* },


  {
    "nome": "Mariana Alves",
    "email": "mariana.alves@voll.med",
    "crm": "234567",
    "telefone": "11988887777",
    "especialidade": "CARDIOLOGIA",
    "endereco": {
      "logradouro": "Rua das Flores",
      "bairro": "Jardim Paulista",
      "cep": "04567000",
      "cidade": "São Paulo",
      "uf": "SP",
      "numero": "120",
      "complemento": "Apto 45"
    }
  },


  {
    "nome": "Carlos Eduardo Lima",
    "email": "carlos.lima@voll.med",
    "crm": "345678",
    "telefone": "21977776666",
    "especialidade": "DERMATOLOGIA",
    "endereco": {
      "logradouro": "Avenida Atlântica",
      "bairro": "Copacabana",
      "cep": "22021001",
      "cidade": "Rio de Janeiro",
      "uf": "RJ",
      "numero": "980",
      "complemento": "Sala 302"
    }
  },

  {
    "nome": "Fernanda Souza",
    "email": "fernanda.souza@voll.med",
    "crm": "456789",
    "telefone": "31966665555",
    "especialidade": "ORTOPEDIA",
    "endereco": {
      "logradouro": "Rua Goiás",
      "bairro": "Centro",
      "cep": "30190060",
      "cidade": "Belo Horizonte",
      "uf": "MG",
      "numero": "45",
      "complemento": "Consultório 2"
    }
  },

  {
    "nome": "Ricardo Menezes",
    "email": "ricardo.menezes@voll.med",
    "crm": "567890",
    "telefone": "41955554444",
    "especialidade": "GINECOLOGIA",
    "endereco": {
      "logradouro": "Rua XV de Novembro",
      "bairro": "Centro",
      "cep": "80020010",
      "cidade": "Curitiba",
      "uf": "PR",
      "numero": "300",
      "complemento": "Conjunto 801"
    }
  }

]*/