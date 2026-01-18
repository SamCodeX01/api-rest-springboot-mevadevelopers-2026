package med.voll.api.controller;

import med.voll.api.medico.DadosCadastrados;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
    public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastrados dados){ //(pega do corpo inteiro da requisição, nesse caso Strings em json)
            //Recebe como parametro um DTO e converte para um objeto do tipo medico
        repository.save(new Medico(dados));
    }

}

//@Autowired permite que o spring injete automaticamente instancias dessa classe,
// onde elas forem necessárias, evita instancias as classes manualmente com o new

//O @Autowired instrui o spring a procurar um bean que ira injetar na onde for necessario,
// pode serem um atributo,m construtor ou setter


