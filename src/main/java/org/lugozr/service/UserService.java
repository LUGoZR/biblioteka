package org.lugozr.service;

import org.lugozr.domain.User;

import java.util.List;

/**
 * User Service Interface. Handles data retrieve/send between controllers and User Repository.
 * @see org.lugozr.repository.UserRepository
 * @author Nikola Mirosavljev
 */
public interface UserService {

    User findOneByUsername(String username);

    User findOneById(Long id);

    List<User> findAll();

    User update(User user);

    User save(User user);

    void delete(User user);

}
