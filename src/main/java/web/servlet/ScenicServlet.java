package web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: 李旺旺
 * @Date: 2021/4/14 09:43
 * @Description:
 */
@WebServlet("/ScenicServlet")
public class ScenicServlet extends BaseServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("没进入doPost");
        request.setCharacterEncoding("utf-8");
        System.out.println("没获取参数");
        String funcName = request.getParameter("searchText");

        System.out.println("没进入查找方法");
        System.out.println(funcName);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    private void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        System.out.println("CHULAILE");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
