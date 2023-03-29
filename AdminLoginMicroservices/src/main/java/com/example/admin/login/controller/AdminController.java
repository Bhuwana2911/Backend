package com.example.admin.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.admin.login.messages.DisplayMessages;
import com.example.admin.login.model.JwtRequest;
import com.example.admin.login.model.JwtResponse;
import com.example.admin.login.service.AdminService;
import com.example.admin.login.utility.JwtUtility;

@RestController

@RequestMapping
@CrossOrigin("http://localhost:3000")
public class AdminController {
	
	@Autowired
    private JwtUtility jwtUtility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private AdminService adminService;

//    @GetMapping("/hi" )
//    public String home() {
//        return "Welcome to Daily Code Buffer!!";
//    }

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{

    	System.out.println(jwtRequest);
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    jwtRequest.getUsername(),jwtRequest.getPassword()));
        }
        catch (BadCredentialsException e) {        	
        	return DisplayMessages.getResponseEntity("Admin with either username or password is not found", HttpStatus.BAD_REQUEST);
            //throw new Exception("INVALID_CREDENTIALS", e);
        }

        final UserDetails userDetails = adminService.loadUserByUsername((jwtRequest).getUsername());

        final String token = jwtUtility.generateToken(userDetails);

        return  ResponseEntity.ok(new JwtResponse(token));
    }

}
