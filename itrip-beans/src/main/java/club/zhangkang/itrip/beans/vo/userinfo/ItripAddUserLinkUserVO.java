package club.zhangkang.itrip.beans.vo.userinfo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 前端输入-新增常用联系人VO
 * Created by donghai on 2017/5/10.
 */
@ApiModel(value = "ItripAddUserLinkUserVO",description = "添加常用联系人")
public class ItripAddUserLinkUserVO {

    @ApiModelProperty("[必填] 常用联系人姓名")
    private String linkUserName;
    @ApiModelProperty("[必填] 证件类型")
    private Integer linkIdCardType;
    @ApiModelProperty("[必填] 证件号码")
    private String linkIdCard;
    @ApiModelProperty("[非必填] 联系电话")
    private String linkPhone;
    @ApiModelProperty("[必填] 用户ID")
    private Long userId;

    public void setLinkUserName (String  linkUserName){
        this.linkUserName=linkUserName;
    }

    public  String getLinkUserName(){
        return this.linkUserName;
    }
    public void setLinkIdCard (String  linkIdCard){
        this.linkIdCard=linkIdCard;
    }

    public Integer getLinkIdCardType() {
        return linkIdCardType;
    }

    public void setLinkIdCardType(Integer linkIdCardType) {
        this.linkIdCardType = linkIdCardType;
    }

    public  String getLinkIdCard(){
        return this.linkIdCard;
    }
    public void setLinkPhone (String  linkPhone){
        this.linkPhone=linkPhone;
    }

    public  String getLinkPhone(){
        return this.linkPhone;
    }
    public void setUserId (Long  userId){
        this.userId=userId;
    }

    public  Long getUserId(){
        return this.userId;
    }
}
