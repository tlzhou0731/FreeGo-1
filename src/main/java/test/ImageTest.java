package test;

import dao.impl.UserInfoDaoImpl;
import domain.ScenicPictureInfo;
import domain.UserInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.ImageUtil;
import utils.JDBCUtils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * Create By Intellij idea
 * Author:Macro
 * Date:2021/4/19
 * Time:15:43
 * Describe:
 */

public class ImageTest {

    // 将图片插入数据库
    public static void readImage2DB() {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String path = "D:/software/软媒桌面/图标/headPic.png";

        FileInputStream in = null;
        try {
            String sql;
            sql = "insert into scenicPicture (scenicId,picturePath,pictureOrder)values(605,?,3)";
            int count = template.update(sql,path);

            if (count > 0) {
                System.out.println("插入成功！");
            } else {
                System.out.println("插入失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 读取数据库中图片
    public static void readDB2Image() {
        String targetPath = "D:/image/1.png";

        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        List<ScenicPictureInfo> scenicPictureInfoList =null;
        String sql = "select * from scenicpicture where id<>?";
        scenicPictureInfoList = template.query(sql, new BeanPropertyRowMapper<ScenicPictureInfo>(ScenicPictureInfo.class), 2);

        try {
            for(int i=0;i<scenicPictureInfoList.size();i++){
                System.out.println(scenicPictureInfoList.get(i).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //测试
    public static void main(String[] args) {
        readImage2DB();
        //readDB2Image();
    }
}