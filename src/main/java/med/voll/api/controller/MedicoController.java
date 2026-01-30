package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
    public class MedicoController {

    @Autowired //O @Autowired pede ao Spring que encontre um objeto que eu preciso e coloque-o aqui automaticamente para mim".
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){ //(pega do corpo inteiro da requisição, nesse caso Strings em json)
        //Recebe como parametro um DTO e converte para um objeto do tipo medico
        repository.save(new Medico(dados)); //passo os parametros que estao vindo da requisição Json para o construtor da Classe Medico
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao){
//        return repository.findAll(paginacao).stream().map(DadosListagemMedico::new).toList(); //findAll() serve para buscar e retornar todos os registros existentes em uma determinada tabela de banco de dados.
        return repository.findAll(paginacao).map(DadosListagemMedico::new); //findAll() serve para buscar e retornar todos os registros existentes em uma determinada tabela de banco de dados.
    }

}

//@Autowired permite que o spring injete automaticamente instancias dessa classe,
// onde elas forem necessárias, evita instancias as classes manualmente com o new

//O @Autowired instrui o spring a procurar um bean que ira injetar na onde for necessario,
// pode serem um atributo,m construtor ou setter

