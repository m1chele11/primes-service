package edu.iu.mbarrant.primesservice.service;


import edu.iu.mbarrant.primesservice.models.Customer;

import java.io.IOException;

public interface IAuthenticationService {

    boolean register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;

}
