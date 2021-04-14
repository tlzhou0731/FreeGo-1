package web.servlet;

import domain.ResultInfo;
import domain.UserInfo;
import org.apache.commons.beanutils.BeanUtils;
import service.UserInfoService;
import service.impl.UserInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Author: 李旺旺
 * @Date: 2021/4/11 21:19
 * @Description: 用户Servlet
 */
@WebServlet("/user/*")
public class UserServlet extends BaseServlet {

    //声明一个UserInfoService成员变量
    UserInfoService userInfoService = new UserInfoServiceImpl();

    /**
     * 用户注册功能
     */
    public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isError = checkCodeIsError(request, response);
        if (!isError) {
            return;
        }
        //1.获取数据
        Map<String, String[]> map1 = request.getParameterMap();
        //2.封装对象
        UserInfo userInfo = new UserInfo();
        try {
            BeanUtils.populate(userInfo, map1);
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //3.调用Service，完成注册
        boolean flag = userInfoService.register(userInfo);
        ResultInfo resultInfo = new ResultInfo();
        //4.响应结果
        if (flag) {
            resultInfo.setFlag(true);
        } else {
            resultInfo.setFlag(false);
            resultInfo.setErrorMsg("注册失败");
        }
        getWriterWrite(resultInfo, response);
    }
}
