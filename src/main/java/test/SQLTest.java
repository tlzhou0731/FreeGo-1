package test;

import dao.impl.UserInfoDaoImpl;
import domain.UserInfo;

/**
 * @Author: 李旺旺
 * @Date: 2021/4/4 14:04
 * @Description: 数据库语句测试类
 */
public class SQLTest {
    public static void main(String[] args) {
        UserInfoDaoImpl userInfoDao = new UserInfoDaoImpl();
        /*
        Boolean result1 = userInfoDao.isUserCellnumberExist("11156145755");
        System.out.println(result1);
        UserInfo userInfo = new UserInfo("15555555555","2455555555@qq.com","浅浅的回忆","123456789","男","我是个很快乐的人","","N","",false);
        Boolean result2 = userInfoDao.saveUserInfo(userInfo);
        System.out.println(result2);
        Boolean result3 = userInfoDao.isAccountRight("", "2458581048@qq.com", "123456789");
        System.out.println(result3);
        Boolean result = userInfoDao.isUserFollowed(1001,5);
        System.out.println(result);
        */
    }
}
