package com.mysite.sbb.user;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long>{

    Optional<SiteUser> findByUsername(String username);
}
