package com.aptech.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/preview")
public class MediaPreviewController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String selectedFile = request.getParameter("selectedFile");

        String root = getServletContext().getRealPath("/");
        File path = new File(root + "/uploads");

        File[] allFiles = path.listFiles();
        for (File f : allFiles) {
            pw.print(f.getName());
            pw.print("selectd file:" + selectedFile);
            if (f.getName().equals(selectedFile)) {
                File delFile = new File(path + "/" + selectedFile);
                delFile.delete();

            } else {
                pw.print("file not found !");
            }
        }
        response.sendRedirect("http://localhost:8080/webdemo/upload");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");

        request.setAttribute("name", name);
        request.getRequestDispatcher("preview.jsp").forward(request, response);
    }
}
