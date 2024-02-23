package edu.iu.mbarrant.primesservice.controllers;


import edu.iu.mbarrant.primesservice.service.IPrimeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {

     IPrimeService primeService;
     public PrimesController(IPrimeService primeService){
         this.primeService = primeService;
     }

     @RequestMapping("/{n}")
     public boolean isPrime(@PathVariable int n){
         return primeService.isPrime(n);
     }

}
