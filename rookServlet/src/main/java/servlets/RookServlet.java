package servlets;

import rook.RookMoves;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reqH = req.getParameter("height");
        String reqW = req.getParameter("width");
        String end = req.getParameter("end");
        String start = req.getParameter("start");
        PrintWriter printWriter = resp.getWriter();
        try{
            int height = Integer.parseInt(reqH);
            int width = Integer.parseInt(reqW);
            int answer = RookMoves.findAnswer(width,height,start,end);
            printWriter.println(answer);
        } catch (Exception e){
            printWriter.println("Bad width or hight");
        }
    }
}
