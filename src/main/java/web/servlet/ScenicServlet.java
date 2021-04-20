package web.servlet;

import dao.impl.UserInfoDaoImpl;
import domain.ScenicInfo;
import domain.UserInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
        System.out.println("没进入doPost");
        request.setCharacterEncoding("utf-8");
        System.out.println("没获取参数");
        String[] chooses;
        String searchText = request.getParameter("searchText");
        String dateChoose = request.getParameter("dateChoose");
        String addChoose = request.getParameter("addChoose");
        chooses = request.getParameterValues("themeChoose");

        System.out.println("没进入查找方法");
        System.out.println("没进入查找方法");
        System.out.println(searchText);
        System.out.println(dateChoose);
        System.out.println(addChoose);
        for(int i=0;i<chooses.length;i++){
            System.out.println(chooses[i]);
        }
        System.out.println("没进入Test");
        test(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    private void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        System.out.println("出来了");
        //request.getRequestDispatcher("/index.jsp").forward(request,response);

        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

//        UserInfoDaoImpl userInfoDao = new UserInfoDaoImpl();
//
//        UserInfo userInfo = new UserInfo("15356145755","876213908@qq.com","Joshua Genter","123456789","男","湖人总冠军","","","",false);
//        userInfo.setUserId(1055);
        /*
        Boolean result = userInfoDao.isUserCellnumberExist("11156145755");

        Boolean result = userInfoDao.saveUserInfo(userInfo);

        Boolean result = userInfoDao.isAccountRight("", "2458581048@qq.com", "123456789");

        Boolean result = userInfoDao.isUserFollowed(1001,5);
        Boolean result = userInfoDao.updateUserInfo(userInfo);
        System.out.println(result);
        */

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
}
