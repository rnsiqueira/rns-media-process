package br.com.rns.rest;

import br.com.rns.calcs.approximationCalculation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalcRest {


    @GetMapping("/start/{maxNum}")
    public ResponseEntity start(@PathVariable("maxNum") int maxNum) {

        new approximationCalculation().start(maxNum);

        return ResponseEntity.ok().body("Calculo de aproximação executado com sucesso");
    }
}
