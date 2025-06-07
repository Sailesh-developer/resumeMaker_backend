package com.example.resumeMaker_backend.repository;


import com.example.resumeMaker_backend.model.AppRole;
import com.example.resumeMaker_backend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
