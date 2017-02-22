package net.rigatti.admin;

import net.rigatti.admin.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserRepository extends CrudRepository<Users, Integer> {
    List<Users> findByUsername(String username);
}
