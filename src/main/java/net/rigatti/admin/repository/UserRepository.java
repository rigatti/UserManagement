package net.rigatti.admin.repository;

import org.springframework.data.repository.CrudRepository;

import net.rigatti.admin.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByUsername(String userName);
}
