package com.example.manager.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manager.login.model.JwtRequest;
import com.example.manager.login.model.JwtResponse;
import com.example.manager.login.model.Manager;

import com.example.manager.login.service.ManagerService;
import com.example.manager.login.utility.JwtUtility;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:3000")
public class ManagerController {
	
	@Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ManagerService managerService;
    
    
    
    @GetMapping("/loginmanager/{token}")
    public String getLoginUser(@PathVariable("token") String token) {
    	return jwtUtility.extractUsername(token);
    }
    
    
	


    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{

    	System.out.println(jwtRequest);
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                             jwtRequest.getMail(),
                             jwtRequest.getPassword()
                    )
            );
        }
        catch (BadCredentialsException e) {
            //throw new Exception("INVALID_CREDENTIALS", e);
        	
        	
        	System.out.println("Invalid Credentials.. Provide correct credentails to match with the database record");
        	throw new BadCredentialsException("Incorrect Credentials");
        }
        
        

        final UserDetails userDetails = managerService.loadUserByUsername((jwtRequest).getMail());

        final String token = jwtUtility.generateToken(userDetails);

        return  ResponseEntity.ok(new JwtResponse(token));
    }

}
