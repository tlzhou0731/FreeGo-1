package dao.impl;

import dao.UserInfoDao;
import domain.UserInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

import java.util.List;

/**
 * @Author: 李旺旺
 * @Date: 2021/4/5 16:12
 * @Description: 用户信息
 */
public class UserInfoDaoImpl implements UserInfoDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
    * @Author:  李旺旺
    * @Date:    2021/4/5 16:14
    * @param:   [userTele]
    * @Description: 检查手机号是否已经存在
    */
    @Override
    public Boolean isUserCellnumberExist(String userTele) {
        UserInfo user = null;
        try {
            //1.定义sql语句
            String sql = "select * from user where userTele = ?";
            //2.执行
            user = template.queryForObject(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class), userTele);
        } catch (Exception e){
            System.out.println("根据用户手机号查询用户信息失败");
        }
        if (user != null){
            return true;
        }
        return false;
    }

    /**
    * @Author:  李旺旺
    * @Date:    2021/4/5 16:28
    * @param:   [userTele, nickName, password]
    * @Description: 将用户手机号、昵称、密码存到用户信息表，如果存储失败返回false，如果存储成功，返回true。
    */
    @Override
    public Boolean saveUserInfo(String userTele, String nickName, String password) {
        //1.定义sql语句
        String sql = "insert into user (userTele, userNickName, userPassword) values(?,?,?)";
        //2.执行
        int result = template.update(sql, userTele, nickName, password);
        if (result == 1){
            return true;
        }
        return false;
    }

    @Override
    public Boolean isAccountRight(String userTele, String email, String password) {
        String sql = null;
        UserInfo userInfo = null;
        if (userTele != null){
            sql = "select * from user where userTele = ? and userPassword = ?";
            userInfo = template.queryForObject(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class), userTele, password);
        } else {
            sql = "select * from user where userEmail = ? and userPassword = ?";
            userInfo = template.queryForObject(sql, new BeanPropertyRowMapper<UserInfo>(UserInfo.class), email, password);
        }
        if (userInfo != null) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean isUserFollowed(int userId, int travelNoteId) {
        //1.定义sql语句
        //2.执行
        return null;
    }

    @Override
    public Boolean updateUserFollowByTravelNoteId(int userId, int travelNoteId) {
        //1.定义sql语句
        //2.执行
        return null;
    }

    @Override
    public Boolean updateUserPrefer(int userId, int tagId, float preferWeight) {
        //1.定义sql语句
        //2.执行
        return null;
    }

    @Override
    public Boolean updateUserPreferByTravelNote(int userId, int travelNoteId, float preferWeight) {
        //1.定义sql语句
        //2.执行
        return null;
    }

    @Override
    public Boolean updateUserPreferByHotel(int userId, int hotelId, float preferWeight) {
        //1.定义sql语句
        //2.执行
        return null;
    }

    @Override
    public Boolean updateUserPreferByScenic(int userId, int scenicId, float preferWeight) {
        //1.定义sql语句
        //2.执行
        return null;
    }

    @Override
    public Boolean changeUserInfo(UserInfo userInfo) {
        //1.定义sql语句
        //2.执行
        return null;
    }

    @Override
    public List<UserInfo> queryConcernInfo(int userId) {
        //1.定义sql语句
        //2.执行
        return null;
    }

    @Override
    public List<UserInfo> queryFollowInfo(int userId) {
        //1.定义sql语句
        //2.执行
        return null;
    }
}
