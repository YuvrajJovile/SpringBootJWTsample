package com.utterance.utteranceProj.security;

import com.utterance.utteranceProj.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenGenerator {

    public String  generate(JwtUser jwtUser) {

        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        claims.put("userId",jwtUser.getUserId());
        claims.put("role",jwtUser.getRole());

            return  Jwts.builder()
                    .setClaims(claims)
                //.setExpiration()
                .signWith(SignatureAlgorithm.HS512,"secret").compact();

    }
}
