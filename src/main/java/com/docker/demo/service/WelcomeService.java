package com.docker.demo.service;

import com.docker.demo.repo.WelcomeRepo;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 7/3/2024
 * Created time : 11:14 PM
 */
public class WelcomeService {

    private final WelcomeRepo welcome;

    public WelcomeService(WelcomeRepo welcome) {
        this.welcome = welcome;
    }


}
