package by.htp.ex.controller.impl;

import java.io.IOException;
import java.sql.SQLException;

import by.htp.ex.controller.Command;
import by.htp.ex.service.INewsService;
import by.htp.ex.service.ServiceException;
import by.htp.ex.service.ServiceProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class DoAddLike implements Command {

    private final INewsService newsService = ServiceProvider.getInstance().getNewsService();


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String newsId = request.getParameter("likeCount");
        
        try {
            newsService.addLike("1");
        } catch (ServiceException e) {
            request.setAttribute("exception", "Error to add like for news!");
        }
    }


}
