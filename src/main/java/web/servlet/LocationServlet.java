package web.servlet;

import javax.servlet.http.HttpServlet;

/**
 * Create By Intellij idea
 * Author:Macro
 * Date:2021/4/20
 * Time:16:50
 * Describe:
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class LocationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置request编码格式
        request.setCharacterEncoding("utf-8");

        String methods = request.getParameter("methods");

        if(methods.equals("queryLocation")){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

}
