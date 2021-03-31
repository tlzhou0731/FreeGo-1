package domain;

/**
 * @Author: 李旺旺
 * @Date: 2021/3/30 20:21
 * @Description: 酒店信息实体类
 */
public class HotelInfo {
    private int hotelId;            //酒店id
    private String hotelName;       //酒店名称
    private String hotelAddress;    //酒店地址
    private String hotelTele;       //酒店电话
    private float overallScore;     //酒店评分
    private float brand;            //酒店品牌
    private int level;              //酒店星级
    private int hot;                //酒店热度
    private String sketch;          //酒店描述
    private String province;        //省
    private String downtown;        //市
    private String county;          //县
    private Boolean flag;           //酒店状态(是否删除)

    public HotelInfo() {}

    public HotelInfo(int hotelId, String hotelName, String hotelAddress, String hotelTele, float overallScore,
                     float brand, int level, int hot, String sketch, String province, String downtown, String county, Boolean flag) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelTele = hotelTele;
        this.overallScore = overallScore;
        this.brand = brand;
        this.level = level;
        this.hot = hot;
        this.sketch = sketch;
        this.province = province;
        this.downtown = downtown;
        this.county = county;
        this.flag = flag;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelTele() {
        return hotelTele;
    }

    public void setHotelTele(String hotelTele) {
        this.hotelTele = hotelTele;
    }

    public float getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(float overallScore) {
        this.overallScore = overallScore;
    }

    public float getBrand() {
        return brand;
    }

    public void setBrand(float brand) {
        this.brand = brand;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDowntown() {
        return downtown;
    }

    public void setDowntown(String downtown) {
        this.downtown = downtown;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "酒店信息{" +
                "酒店id=" + hotelId +
                ", 酒店名称='" + hotelName + '\'' +
                ", 酒店地址='" + hotelAddress + '\'' +
                ", 酒店电话='" + hotelTele + '\'' +
                ", 酒店评分=" + overallScore +
                ", 酒店品牌=" + brand +
                ", 酒店星级=" + level +
                ", 酒店热度=" + hot +
                ", 酒店描述='" + sketch + '\'' +
                ", 省='" + province + '\'' +
                ", 市='" + downtown + '\'' +
                ", 县='" + county + '\'' +
                ", 酒店状态(是否删除)=" + flag +
                '}';
    }
}