package edu.iu.mbarrant.primesservice.repository;

import edu.iu.mbarrant.primesservice.models.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save (Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}
