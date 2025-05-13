package com.example.servlet_path;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.BufferedWriter;
import java.io.IOException;

@Component
public class ServletPathPrintFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        try (var writer = new BufferedWriter(response.getWriter())) {
            writer.write("Servlet Path: " + request.getServletPath());
            writer.newLine();
            writer.write("Request URI: " + request.getRequestURI());
            writer.newLine();
            writer.write("Request URL: " + request.getRequestURL());
            writer.newLine();
            writer.write("Request Path Info: " + request.getPathInfo());
            writer.newLine();
            writer.flush();
        }
//        String servletPath = request.getServletPath();
//        System.out.println("Servlet Path: " + servletPath);
//        filterChain.doFilter(request, response);
    }
}
