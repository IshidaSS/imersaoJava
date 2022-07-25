package br.com.ishida.linguagens.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class LinguagemController
 {

 

    private List<Linguagem> linguagens =
    List.of (new Linguagem("java", "https://fortee.jp/files/jjug-ccc-2022-spring/image/banner.png","1"),
        new Linguagem("php", "https://upload.wikimedia.org/wikipedia/commons/4/45/Duke3D.png","2" ));    
    
    @GetMapping("/linguagem preferida")
    public String processaLinguagemPreferida(){
        return "Oi java";
    }
    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        return linguagens;
    }
}
