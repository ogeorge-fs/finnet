package com.example.app.controller;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.SignedJWT;
import com.nimbusds.jwt.JWTClaimsSet;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private static final String SECRET = "12345678901234567890123456789012"; // 32-char secret

    @PostMapping("/getToken")
    public Map<String, String> token(@RequestParam String username, @RequestParam String password) throws Exception {
        System.out.println(username + " :: "+password);
        if ("user".equals(username) && "password".equals(password)) {
            JWSSigner signer = new MACSigner(SECRET);
            JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
                    .subject(username)
                    .issuer("self")
                    .expirationTime(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // 1 hour
                    .claim("scope", "read")
                    .build();

            SignedJWT signedJWT = new SignedJWT(
                    new JWSHeader(JWSAlgorithm.HS256),
                    claimsSet
            );
            signedJWT.sign(signer);

            return Map.of("access_token", signedJWT.serialize(), "token_type", "bearer","expires_in","3600");
        } else {
            return Map.of("status", "Failed", "message", "Invalid Credentials used");
        }
    }
}
