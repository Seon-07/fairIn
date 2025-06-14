package com.seon.fairin.auth.service;

import com.seon.fairin.auth.dto.JoinRequest;
import com.seon.fairin.auth.dto.JwtTokens;
import com.seon.fairin.auth.dto.LoginRequest;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-05-06
 */
public interface AuthService {
    void join(JoinRequest joinRequest);
    JwtTokens login(LoginRequest loginRequest);
    JwtTokens reissue(HttpServletRequest request);
    void logout(HttpServletRequest request);
}
