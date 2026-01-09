package med.voll.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Marcar a classe como um controlador: O Spring reconhece a classe anotada como um componente que gerencia solicitações HTTP.
//Retornar dados diretamente como resposta (corpo da
//@RestController automaticamente serializa o objeto de retorno do método em um formato como JSON ou XML e o envia diretamente como o corpo (body) da resposta HTTP, sem a necessidade de uma tecnologia de visualização.
@RequestMapping("/pizza") // Direciona URLs específicas para o código que deve processá-las. Define o endpoint (caminho da URL) que um método ou classe de controlador irá gerenciar.
//Pizza esta gerenciando batata ou a batata esta gerenciando a pizza?
public class HelloController {

    // A função primária é designar qual método do controlador deve ser executado quando uma requisição HTTP do tipo GET é recebida em um determinado caminho (URL).
    @GetMapping("/batata")
    public String olaMundo1(){
       System.out.println("Hello Samuel 1!");
        return "Hello World!1";
    }

    @PostMapping
    public String olaMundo3(){
       System.out.println("Hello Samuel! 3");
       return "ssssssssssssssss";
    }
}


/*
* 1) Dentro da pasta Main, criar o pacote controller e dentro dele criar a classe Controller

2) Nessa classe Controller colocar em cim dela a annotation @RestController e @ResquestMapping sobre a classe

Exemplo:

@RestController
@RequestMapping
public class HelloController {
   }

3) Criar um método com um println e colocar sobre ele a annottation @GetMapping("/nomeDaRequisição")

Exemplo:

    @GetMapping
    public String olaMundo(){
          System.out.println("Hello World!");
        return "";
    }

4) No Intellij antes de rodar a aplicação, precisa-se fazer uma configuração do Dev Tools no projeto

Ctrl + Alt + S
Ir em Build, Execution, Deployment
Compliler
"Build project automatically" (marcar essa checkbox)
Depois ir em Advanced Settings
Clicar na checkbox "Allow auto-make to start even if developed application is currently running"
*/