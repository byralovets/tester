package by.ralovets.tester.controller.command.impl;

import by.ralovets.tester.controller.command.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToEditCommand implements Command {

    private static final String EDIT_PAGE_URI = "WEB-INF/jsp/editEntity.jsp";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        RequestDispatcher dispatcher = req.getRequestDispatcher(EDIT_PAGE_URI);
        dispatcher.forward(req, resp);
    }
}
