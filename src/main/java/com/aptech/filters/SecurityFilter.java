package com.aptech.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter({"/users", "/dashboard", "/preview", "/upload"})
public class SecurityFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession(false);


        boolean isLoggedIn = session != null && session.getAttribute("user") != null;
        if (isLoggedIn) {
            chain.doFilter(req, resp);
        } else {
            req.getRequestDispatcher("auth/login.jsp")
                    .forward(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
