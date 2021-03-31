package domain;

/**
 * @Author: 李旺旺
 * @Date: 2021/3/30 21:20
 * @Description: 景点信息实体类
 */
public class ScenicInfo {
    private int scenicId;                   //景点id
    private String scenicName;              //景点名称
    private String scenicAddress;           //景点地址
    private String scenicIntro;             //景点介绍
    private String senicDetail;             //景点详细介绍
    private String scenicTele;              //景点电话
    private int scenicSuitbaleMonth;        //景点开放时间
    private int scenicSuitableTravelDays;   //适合天数
    private int scenicViewNums;             //适合人数
    private Boolean scenicState;            //景点开放状态
    private Boolean flag;                   //景点状态(是否删除)

    public ScenicInfo() {}

    public ScenicInfo(int scenicId, String scenicName, String scenicAddress, String scenicIntro, String senicDetail,
                      String scenicTele, int scenicSuitbaleMonth, int scenicSuitableTravelDays, int scenicViewNums,
                      Boolean scenicState, Boolean flag) {
        this.scenicId = scenicId;
        this.scenicName = scenicName;
        this.scenicAddress = scenicAddress;
        this.scenicIntro = scenicIntro;
        this.senicDetail = senicDetail;
        this.scenicTele = scenicTele;
        this.scenicSuitbaleMonth = scenicSuitbaleMonth;
        this.scenicSuitableTravelDays = scenicSuitableTravelDays;
        this.scenicViewNums = scenicViewNums;
        this.scenicState = scenicState;
        this.flag = flag;
    }
    public int getScenicId() {
        return scenicId;
    }

    public void setScenicId(int scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public String getScenicAddress() {
        return scenicAddress;
    }

    public void setScenicAddress(String scenicAddress) {
        this.scenicAddress = scenicAddress;
    }

    public String getScenicIntro() {
        return scenicIntro;
    }

    public void setScenicIntro(String scenicIntro) {
        this.scenicIntro = scenicIntro;
    }

    public String getSenicDetail() {
        return senicDetail;
    }

    public void setSenicDetail(String senicDetail) {
        this.senicDetail = senicDetail;
    }

    public String getScenicTele() {
        return scenicTele;
    }

    public void setScenicTele(String scenicTele) {
        this.scenicTele = scenicTele;
    }

    public int getScenicSuitbaleMonth() {
        return scenicSuitbaleMonth;
    }

    public void setScenicSuitbaleMonth(int scenicSuitbaleMonth) {
        this.scenicSuitbaleMonth = scenicSuitbaleMonth;
    }

    public int getScenicSuitableTravelDays() {
        return scenicSuitableTravelDays;
    }

    public void setScenicSuitableTravelDays(int scenicSuitableTravelDays) {
        this.scenicSuitableTravelDays = scenicSuitableTravelDays;
    }

    public int getScenicViewNums() {
        return scenicViewNums;
    }

    public void setScenicViewNums(int scenicViewNums) {
        this.scenicViewNums = scenicViewNums;
    }

    public Boolean getScenicState() {
        return scenicState;
    }

    public void setScenicState(Boolean scenicState) {
        this.scenicState = scenicState;
    }

    @Override
    public String toString() {
        return "景点信息{" +
                "景点id=" + scenicId +
                ", 景点名称='" + scenicName + '\'' +
                ", 景点地址='" + scenicAddress + '\'' +
                ", 景点介绍='" + scenicIntro + '\'' +
                ", 景点详细介绍='" + senicDetail + '\'' +
                ", 景点电话='" + scenicTele + '\'' +
                ", 景点开放时间=" + scenicSuitbaleMonth +
                ", 适合天数=" + scenicSuitableTravelDays +
                ", 适合人数=" + scenicViewNums +
                ", 景点开放状态=" + scenicState +
                ", 景点状态(是否删除)=" + flag +
                '}';
    }
}
