package com.josiah.studentmanagementsystem.Config;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
public class LoginAuthenticationSucessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication userAuthorities)
            throws IOException, ServletException {
        Set<String> roles = AuthorityUtils.authorityListToSet(userAuthorities.getAuthorities());

        if (roles.contains("ROLE_ADMIN"))
                httpServletResponse.sendRedirect("/admin");
        if (roles.contains("ROLE_STUDENT"))
                httpServletResponse.sendRedirect("/student");

    }
    
}
