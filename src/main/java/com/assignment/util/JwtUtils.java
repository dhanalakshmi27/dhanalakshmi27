package com.assignment.util;

import com.assignment.entity.LoginEntity;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class JwtUtils {
	
	private static String secret = "Secret_Key"
	private static long expiration = 60*60;
	
	public String generateJwt(LoginEntity entity){
		
		long milliSecs = System.currentTimeMillis();
		long expirySec = milliSecs + expiration * 1000;
		
		Date issuedAt = new Date(milliSecs);
		Date expiryAt = new Date(expirySec);
	
	Claims claims = Jwts.claims().setIssuer(entity.getUserId().toString())
	                .setIssuedAt(issueAt)
           	        .setExpiration(expiredAt);
	
	return Jwts.builder().setClaims(claims)
	       .signWith(SignatureAlgorithm.HS512,secret).compact();

}
}
