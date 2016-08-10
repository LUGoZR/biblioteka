package org.lugozr.service.impl;

import org.lugozr.domain.User;
import org.lugozr.repository.UserRepository;
import org.lugozr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User Service Implementation.
 * @see org.lugozr.service.UserService
 * @author Nikola Mirosavljev
 * TODO: Add detailed documentation about this service
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findOneByUsername(String username) {
        return userRepository.findOneByUsername(username);
    }

    @Override
    public User findOneById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
