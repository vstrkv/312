package com.javaMentor.CRUD.repository;

import com.javaMentor.CRUD.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
