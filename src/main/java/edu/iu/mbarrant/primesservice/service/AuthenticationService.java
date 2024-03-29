package edu.iu.mbarrant.primesservice.service;


import edu.iu.mbarrant.primesservice.models.Customer;
import edu.iu.mbarrant.primesservice.repository.IAuthenticationRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AuthenticationService implements IAuthenticationService {

    IAuthenticationRepository authenticationRepository;

    public AuthenticationService(IAuthenticationRepository authenticationRepository) {
        this.authenticationRepository = authenticationRepository;
    }

    @Override
    public boolean register(Customer customer) throws IOException{
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        String passwordEndcoded = bc.encode(customer.getPassword());
        customer.setPassword(passwordEndcoded);
        return authenticationRepository.save(customer);
    }
}