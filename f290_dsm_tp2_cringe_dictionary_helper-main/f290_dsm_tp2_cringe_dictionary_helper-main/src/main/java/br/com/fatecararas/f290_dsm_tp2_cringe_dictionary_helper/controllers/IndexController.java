package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String getIndex() {
        return "index";
    }

    @GetMapping("/soma")
    public String somaRequestParam(@RequestParam("a") Integer a, @RequestParam("b") Integer b){
        Integer soma = a + b;
        System.out.printf("@RequestParam");
        System.out.printf("A soma de %d e %d é %d.\n",a,b,soma);
        return "redirect:/";
    }

    @GetMapping("/soma/{a}/{b}")
    public String somaPathVariable(@PathVariable("a") Integer a, @PathVariable("b") Integer b){
        Integer soma = a + b;
        System.out.printf("@PathVariable");
        System.out.printf("A soma de %d e %d é %d.\n",a,b,soma);
        return "redirect:/";
    }

    @PostMapping("/post")
    public String post(@RequestBody Palavra palavra) {
        System.out.println("@PostMapping");
        System.out.println(palavra);
        return "redirect:/";
    }
}

// Download Thunder Client