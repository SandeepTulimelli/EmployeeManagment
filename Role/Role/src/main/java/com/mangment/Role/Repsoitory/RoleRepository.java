package com.mangment.Role.Repsoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mangment.Role.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
