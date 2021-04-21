package web.servlet;

import dao.impl.UserInfoDaoImpl;
import domain.ScenicInfo;
import domain.UserInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: 李旺旺
 * @Date: 2021/4/14 09:43
 * @Description:
 */
@WebServlet("/ScenicServlet")
public class ScenicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("没进入doPost");
//        request.setCharacterEncoding("utf-8");
//        System.out.println("没获取参数");
//        String[] chooses;
//        String searchText = request.getParameter("searchText");
//        String dateChoose = request.getParameter("dateChoose");
//        String addChoose = request.getParameter("addChoose");
//        chooses = request.getParameterValues("themeChoose");
//
//        System.out.println("没进入查找方法");
//        System.out.println("没进入查找方法");
//        System.out.println(searchText);
//        System.out.println(dateChoose);
//        System.out.println(addChoose);
//        for(int i=0;i<chooses.length;i++){
//            System.out.println(chooses[i]);
//        }
//        System.out.println("没进入Test");
//        test(request,response);

        request.setCharacterEncoding("utf-8");
        System.out.println("没获取参数");
        String methodName = request.getParameter("methodName");
        if("queryScenicIndex".equals(methodName)){
            queryScenicIndex(request,response);
        }
        if("findScenicInfo".equals(methodName)){
            test(request,response);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    private void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        System.out.println("出来了");
        //request.getRequestDispatcher("/index.jsp").forward(request,response);

        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = null;
        //1.定义sql语句
        sql = "select * from scenic where province = ? LIMIT 100;";
        //2.执行
        List<ScenicInfo> scenicInfoList = null;
        scenicInfoList = template.query(sql, new BeanPropertyRowMapper<ScenicInfo>(ScenicInfo.class), "北京");
        System.out.println("BIAOGUOWOCHULAILEWO");
        if(scenicInfoList.size()==0){
            System.out.println("ScenicInfo is NULL");
        }else{
            System.out.println("ScenicInfo is not NULL");
            System.out.println(scenicInfoList);
            for(int i=0;i<scenicInfoList.size();i++){
                System.out.println(scenicInfoList.get(i).toString());
            }
        }
        request.removeAttribute("scenicInfoList");
        request.setAttribute("scenicInfoList",scenicInfoList);


        request.getRequestDispatcher("/ScenicMain.jsp").forward(request,response);

    }

    private void queryScenicIndex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        System.out.println("queryScenicIndex");

        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql;
        //1.定义sql语句
        sql = "select scenicTheme,COUNT(*) from scenic GROUP by scenicTheme HAVING COUNT(*)>61 ORDER BY COUNT(*) DESC;";
        //2.执行
        List<String> scenicThemeList = null;
        scenicThemeList = template.query(sql, new RowMapper<String>(){
            public String mapRow(ResultSet rs, int rowNum)
                    throws SQLException {
                return rs.getString(1);
            }
        },null);
        System.out.println("BIAOGUOWOCHULAILEWO");
        if(scenicThemeList.size()==0){
            System.out.println("scenicThemeList is NULL");
        }else{
            System.out.println("scenicThemeList is not NULL");
            for(int i=0;i<scenicThemeList.size();i++){
                System.out.println(scenicThemeList.get(i));
            }
        }
        request.removeAttribute("scenicThemeList");
        request.setAttribute("scenicThemeList",scenicThemeList);


        request.getRequestDispatcher("/SearchScenic.jsp").forward(request,response);

    }
}
