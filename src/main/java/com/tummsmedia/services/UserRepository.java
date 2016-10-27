package com.tummsmedia.services;

import com.tummsmedia.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by john.tumminelli on 10/26/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
