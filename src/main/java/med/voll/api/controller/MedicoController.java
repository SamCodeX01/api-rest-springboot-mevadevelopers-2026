package med.voll.api.controller;

import med.voll.api.medico.DadosCadastrados;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
    public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastrados dados){ //(pega do corpo inteiro da requisição, nesse caso Strings em json)
        System.out.println(dados);

    }

}



