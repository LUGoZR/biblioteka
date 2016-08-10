package org.lugozr.repository;

import org.lugozr.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository that retrieves User domain classes from Database.
 * @see org.lugozr.domain.User
 * @author Nikola Mirosavljev
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);

}
