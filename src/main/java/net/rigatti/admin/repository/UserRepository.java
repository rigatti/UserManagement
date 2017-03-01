package net.rigatti.admin.repository;

import net.rigatti.admin.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByName(String name);
}
