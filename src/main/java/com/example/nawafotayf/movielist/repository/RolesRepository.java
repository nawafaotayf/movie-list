package com.example.nawafotayf.movielist.repository;

import com.example.nawafotayf.movielist.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
