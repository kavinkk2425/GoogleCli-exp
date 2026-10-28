package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/"})
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("<!doctype html><html lang='en'><head><meta charset='UTF-8'>" +
            "<meta name='viewport' content='width=device-width, initial-scale=1'>" +
            "<title>Hello World - Google App Engine</title><style>" +
            "body{margin:0;font-family:Arial;background:#f3f6fb;color:#182230;display:grid;min-height:100vh;place-items:center}" +
            "main{background:white;padding:48px;border-radius:16px;box-shadow:0 8px 30px #152b4b18;max-width:620px;margin:20px;text-align:center}" +
            "h1{color:#1967d2;font-size:3rem;margin:20px 0}" +
            ".status{display:inline-block;background:#e6f4ea;color:#137333;padding:8px 16px;border-radius:20px;font-weight:bold}" +
            "p{color:#555;font-size:1rem}" +
            "</style></head><body><main>" +
            "<span class='status'>&#9989; Java Servlet is running on Google App Engine</span>" +
            "<h1>Hello, World!</h1>" +
            "<p>Google App Engine &mdash; Java 17 Servlet</p>" +
            "<p>Project: Google App Engine Java Web Application</p>" +
            "</main></body></html>");
    }
}
