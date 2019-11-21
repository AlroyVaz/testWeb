package com.testwpl.www.testwpl.api;

import com.testwpl.www.testwpl.model.Credentials;
import com.testwpl.www.testwpl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public boolean login(@RequestBody Credentials credentials){
        //call service to login

        return loginService.login();
    }
}
