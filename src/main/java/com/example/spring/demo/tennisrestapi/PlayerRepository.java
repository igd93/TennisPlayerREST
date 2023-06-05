package com.example.spring.demo.tennisrestapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="athletes")
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
