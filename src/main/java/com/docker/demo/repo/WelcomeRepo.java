package com.docker.demo.repo;

import com.docker.demo.entity.Welcome;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 7/3/2024
 * Created time : 11:14 PM
 */
public interface WelcomeRepo extends JpaRepository<Welcome, Integer> {
}
