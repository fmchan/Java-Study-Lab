package com.example.demo;
import java.io.IOException;
import java.net.*;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/countHeadings")
public class ServletCount extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String queryURL = request.getQueryString();
        if(queryURL == null || queryURL.isEmpty()){
            response.getWriter().println("The URL was not entered");
            return;
        }
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest requestPage = HttpRequest.newBuilder().uri(new URI(queryURL)).GET().build();
            String body = client.send(requestPage,BodyHandlers.ofString()).body();
            String[] headers = body.split("<h[1-6]>");
            response.getWriter().println("Number of headers from page is " + (headers.length - 1));
        }catch (URISyntaxException | InterruptedException | ConnectException e) {
            response.getWriter().println(e.getMessage());
        }     
    }
}