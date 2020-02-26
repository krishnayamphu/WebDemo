package com.aptech.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter({"/hello"})
public class MyFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();

        pw.print("Filter is invoked before request.");
        chain.doFilter(req, resp);
        pw.print("Filter is invoked after request.");
    }

    public void destroy() {
    }

}
