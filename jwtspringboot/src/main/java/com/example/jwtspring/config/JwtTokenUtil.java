package com.example.jwtspring.config;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;

import java.io.*;
import java.util.*;
import java.util.function.*;

@Component
public class JwtTokenUtil implements Serializable {
    @Value("${jwt.secret}")
    private String secret;
    public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

    public String generateToken(String s) {
        return Jwts.builder()
                   .setSubject(s)
                   .setIssuer("CodeJava")
                   .setIssuedAt(new Date())
                   .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY))
                   .signWith(SignatureAlgorithm.HS512, secret)
                   .compact();

    }
}
