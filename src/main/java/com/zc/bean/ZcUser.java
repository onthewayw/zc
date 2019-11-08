package com.zc.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class ZcUser implements Serializable {

    private static final long serialVersionUID = 1573052957451L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 登录账号
    * isNullAble:1
    */
    private String loginAccount;

    /**
    * 密码
    * isNullAble:1
    */
    private String password;

    /**
    * 姓名
    * isNullAble:1
    */
    private String userName;

    /**
    * 手机号码
    * isNullAble:1
    */
    private String phoneNum;

    /**
    * 邮箱账号
    * isNullAble:1
    */
    private String mailAddress;

    /**
    * 0 不显示 1显示
    * isNullAble:1,defaultVal:0
    */
    private Integer show;

    /**
    * 0表示为一级代理 别的通过当前id查询
    * isNullAble:1
    */
    private Long parentId;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setLoginAccount(String loginAccount){this.loginAccount = loginAccount;}

    public String getLoginAccount(){return this.loginAccount;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setPhoneNum(String phoneNum){this.phoneNum = phoneNum;}

    public String getPhoneNum(){return this.phoneNum;}

    public void setMailAddress(String mailAddress){this.mailAddress = mailAddress;}

    public String getMailAddress(){return this.mailAddress;}

    public void setShow(Integer show){this.show = show;}

    public Integer getShow(){return this.show;}

    public void setParentId(Long parentId){this.parentId = parentId;}

    public Long getParentId(){return this.parentId;}
    @Override
    public String toString() {
        return "ZcUser{" +
                "id='" + id + '\'' +
                "loginAccount='" + loginAccount + '\'' +
                "password='" + password + '\'' +
                "userName='" + userName + '\'' +
                "phoneNum='" + phoneNum + '\'' +
                "mailAddress='" + mailAddress + '\'' +
                "show='" + show + '\'' +
                "parentId='" + parentId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ZcUser set;

        private ConditionBuilder where;

        public UpdateBuilder set(ZcUser set){
            this.set = set;
            return this;
        }

        public ZcUser getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends ZcUser{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> loginAccountList;

        public List<String> getLoginAccountList(){return this.loginAccountList;}


        private List<String> fuzzyLoginAccount;

        public List<String> getFuzzyLoginAccount(){return this.fuzzyLoginAccount;}

        private List<String> rightFuzzyLoginAccount;

        public List<String> getRightFuzzyLoginAccount(){return this.rightFuzzyLoginAccount;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> phoneNumList;

        public List<String> getPhoneNumList(){return this.phoneNumList;}


        private List<String> fuzzyPhoneNum;

        public List<String> getFuzzyPhoneNum(){return this.fuzzyPhoneNum;}

        private List<String> rightFuzzyPhoneNum;

        public List<String> getRightFuzzyPhoneNum(){return this.rightFuzzyPhoneNum;}
        private List<String> mailAddressList;

        public List<String> getMailAddressList(){return this.mailAddressList;}


        private List<String> fuzzyMailAddress;

        public List<String> getFuzzyMailAddress(){return this.fuzzyMailAddress;}

        private List<String> rightFuzzyMailAddress;

        public List<String> getRightFuzzyMailAddress(){return this.rightFuzzyMailAddress;}
        private List<Integer> showList;

        public List<Integer> getShowList(){return this.showList;}

        private Integer showSt;

        private Integer showEd;

        public Integer getShowSt(){return this.showSt;}

        public Integer getShowEd(){return this.showEd;}

        private List<Long> parentIdList;

        public List<Long> getParentIdList(){return this.parentIdList;}

        private Long parentIdSt;

        private Long parentIdEd;

        public Long getParentIdSt(){return this.parentIdSt;}

        public Long getParentIdEd(){return this.parentIdEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyLoginAccount (List<String> fuzzyLoginAccount){
            this.fuzzyLoginAccount = fuzzyLoginAccount;
            return this;
        }

        public QueryBuilder fuzzyLoginAccount (String ... fuzzyLoginAccount){
            this.fuzzyLoginAccount = solveNullList(fuzzyLoginAccount);
            return this;
        }

        public QueryBuilder rightFuzzyLoginAccount (List<String> rightFuzzyLoginAccount){
            this.rightFuzzyLoginAccount = rightFuzzyLoginAccount;
            return this;
        }

        public QueryBuilder rightFuzzyLoginAccount (String ... rightFuzzyLoginAccount){
            this.rightFuzzyLoginAccount = solveNullList(rightFuzzyLoginAccount);
            return this;
        }

        public QueryBuilder loginAccount(String loginAccount){
            setLoginAccount(loginAccount);
            return this;
        }

        public QueryBuilder loginAccountList(String ... loginAccount){
            this.loginAccountList = solveNullList(loginAccount);
            return this;
        }

        public QueryBuilder loginAccountList(List<String> loginAccount){
            this.loginAccountList = loginAccount;
            return this;
        }

        public QueryBuilder fetchLoginAccount(){
            setFetchFields("fetchFields","loginAccount");
            return this;
        }

        public QueryBuilder excludeLoginAccount(){
            setFetchFields("excludeFields","loginAccount");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }

        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }

        public QueryBuilder fuzzyPhoneNum (List<String> fuzzyPhoneNum){
            this.fuzzyPhoneNum = fuzzyPhoneNum;
            return this;
        }

        public QueryBuilder fuzzyPhoneNum (String ... fuzzyPhoneNum){
            this.fuzzyPhoneNum = solveNullList(fuzzyPhoneNum);
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNum (List<String> rightFuzzyPhoneNum){
            this.rightFuzzyPhoneNum = rightFuzzyPhoneNum;
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNum (String ... rightFuzzyPhoneNum){
            this.rightFuzzyPhoneNum = solveNullList(rightFuzzyPhoneNum);
            return this;
        }

        public QueryBuilder phoneNum(String phoneNum){
            setPhoneNum(phoneNum);
            return this;
        }

        public QueryBuilder phoneNumList(String ... phoneNum){
            this.phoneNumList = solveNullList(phoneNum);
            return this;
        }

        public QueryBuilder phoneNumList(List<String> phoneNum){
            this.phoneNumList = phoneNum;
            return this;
        }

        public QueryBuilder fetchPhoneNum(){
            setFetchFields("fetchFields","phoneNum");
            return this;
        }

        public QueryBuilder excludePhoneNum(){
            setFetchFields("excludeFields","phoneNum");
            return this;
        }

        public QueryBuilder fuzzyMailAddress (List<String> fuzzyMailAddress){
            this.fuzzyMailAddress = fuzzyMailAddress;
            return this;
        }

        public QueryBuilder fuzzyMailAddress (String ... fuzzyMailAddress){
            this.fuzzyMailAddress = solveNullList(fuzzyMailAddress);
            return this;
        }

        public QueryBuilder rightFuzzyMailAddress (List<String> rightFuzzyMailAddress){
            this.rightFuzzyMailAddress = rightFuzzyMailAddress;
            return this;
        }

        public QueryBuilder rightFuzzyMailAddress (String ... rightFuzzyMailAddress){
            this.rightFuzzyMailAddress = solveNullList(rightFuzzyMailAddress);
            return this;
        }

        public QueryBuilder mailAddress(String mailAddress){
            setMailAddress(mailAddress);
            return this;
        }

        public QueryBuilder mailAddressList(String ... mailAddress){
            this.mailAddressList = solveNullList(mailAddress);
            return this;
        }

        public QueryBuilder mailAddressList(List<String> mailAddress){
            this.mailAddressList = mailAddress;
            return this;
        }

        public QueryBuilder fetchMailAddress(){
            setFetchFields("fetchFields","mailAddress");
            return this;
        }

        public QueryBuilder excludeMailAddress(){
            setFetchFields("excludeFields","mailAddress");
            return this;
        }

        public QueryBuilder showBetWeen(Integer showSt,Integer showEd){
            this.showSt = showSt;
            this.showEd = showEd;
            return this;
        }

        public QueryBuilder showGreaterEqThan(Integer showSt){
            this.showSt = showSt;
            return this;
        }
        public QueryBuilder showLessEqThan(Integer showEd){
            this.showEd = showEd;
            return this;
        }


        public QueryBuilder show(Integer show){
            setShow(show);
            return this;
        }

        public QueryBuilder showList(Integer ... show){
            this.showList = solveNullList(show);
            return this;
        }

        public QueryBuilder showList(List<Integer> show){
            this.showList = show;
            return this;
        }

        public QueryBuilder fetchShow(){
            setFetchFields("fetchFields","show");
            return this;
        }

        public QueryBuilder excludeShow(){
            setFetchFields("excludeFields","show");
            return this;
        }

        public QueryBuilder parentIdBetWeen(Long parentIdSt,Long parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public QueryBuilder parentIdGreaterEqThan(Long parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public QueryBuilder parentIdLessEqThan(Long parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public QueryBuilder parentId(Long parentId){
            setParentId(parentId);
            return this;
        }

        public QueryBuilder parentIdList(Long ... parentId){
            this.parentIdList = solveNullList(parentId);
            return this;
        }

        public QueryBuilder parentIdList(List<Long> parentId){
            this.parentIdList = parentId;
            return this;
        }

        public QueryBuilder fetchParentId(){
            setFetchFields("fetchFields","parentId");
            return this;
        }

        public QueryBuilder excludeParentId(){
            setFetchFields("excludeFields","parentId");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public ZcUser build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> loginAccountList;

        public List<String> getLoginAccountList(){return this.loginAccountList;}


        private List<String> fuzzyLoginAccount;

        public List<String> getFuzzyLoginAccount(){return this.fuzzyLoginAccount;}

        private List<String> rightFuzzyLoginAccount;

        public List<String> getRightFuzzyLoginAccount(){return this.rightFuzzyLoginAccount;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> phoneNumList;

        public List<String> getPhoneNumList(){return this.phoneNumList;}


        private List<String> fuzzyPhoneNum;

        public List<String> getFuzzyPhoneNum(){return this.fuzzyPhoneNum;}

        private List<String> rightFuzzyPhoneNum;

        public List<String> getRightFuzzyPhoneNum(){return this.rightFuzzyPhoneNum;}
        private List<String> mailAddressList;

        public List<String> getMailAddressList(){return this.mailAddressList;}


        private List<String> fuzzyMailAddress;

        public List<String> getFuzzyMailAddress(){return this.fuzzyMailAddress;}

        private List<String> rightFuzzyMailAddress;

        public List<String> getRightFuzzyMailAddress(){return this.rightFuzzyMailAddress;}
        private List<Integer> showList;

        public List<Integer> getShowList(){return this.showList;}

        private Integer showSt;

        private Integer showEd;

        public Integer getShowSt(){return this.showSt;}

        public Integer getShowEd(){return this.showEd;}

        private List<Long> parentIdList;

        public List<Long> getParentIdList(){return this.parentIdList;}

        private Long parentIdSt;

        private Long parentIdEd;

        public Long getParentIdSt(){return this.parentIdSt;}

        public Long getParentIdEd(){return this.parentIdEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyLoginAccount (List<String> fuzzyLoginAccount){
            this.fuzzyLoginAccount = fuzzyLoginAccount;
            return this;
        }

        public ConditionBuilder fuzzyLoginAccount (String ... fuzzyLoginAccount){
            this.fuzzyLoginAccount = solveNullList(fuzzyLoginAccount);
            return this;
        }

        public ConditionBuilder rightFuzzyLoginAccount (List<String> rightFuzzyLoginAccount){
            this.rightFuzzyLoginAccount = rightFuzzyLoginAccount;
            return this;
        }

        public ConditionBuilder rightFuzzyLoginAccount (String ... rightFuzzyLoginAccount){
            this.rightFuzzyLoginAccount = solveNullList(rightFuzzyLoginAccount);
            return this;
        }

        public ConditionBuilder loginAccountList(String ... loginAccount){
            this.loginAccountList = solveNullList(loginAccount);
            return this;
        }

        public ConditionBuilder loginAccountList(List<String> loginAccount){
            this.loginAccountList = loginAccount;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public ConditionBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNum (List<String> fuzzyPhoneNum){
            this.fuzzyPhoneNum = fuzzyPhoneNum;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNum (String ... fuzzyPhoneNum){
            this.fuzzyPhoneNum = solveNullList(fuzzyPhoneNum);
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNum (List<String> rightFuzzyPhoneNum){
            this.rightFuzzyPhoneNum = rightFuzzyPhoneNum;
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNum (String ... rightFuzzyPhoneNum){
            this.rightFuzzyPhoneNum = solveNullList(rightFuzzyPhoneNum);
            return this;
        }

        public ConditionBuilder phoneNumList(String ... phoneNum){
            this.phoneNumList = solveNullList(phoneNum);
            return this;
        }

        public ConditionBuilder phoneNumList(List<String> phoneNum){
            this.phoneNumList = phoneNum;
            return this;
        }

        public ConditionBuilder fuzzyMailAddress (List<String> fuzzyMailAddress){
            this.fuzzyMailAddress = fuzzyMailAddress;
            return this;
        }

        public ConditionBuilder fuzzyMailAddress (String ... fuzzyMailAddress){
            this.fuzzyMailAddress = solveNullList(fuzzyMailAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyMailAddress (List<String> rightFuzzyMailAddress){
            this.rightFuzzyMailAddress = rightFuzzyMailAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyMailAddress (String ... rightFuzzyMailAddress){
            this.rightFuzzyMailAddress = solveNullList(rightFuzzyMailAddress);
            return this;
        }

        public ConditionBuilder mailAddressList(String ... mailAddress){
            this.mailAddressList = solveNullList(mailAddress);
            return this;
        }

        public ConditionBuilder mailAddressList(List<String> mailAddress){
            this.mailAddressList = mailAddress;
            return this;
        }

        public ConditionBuilder showBetWeen(Integer showSt,Integer showEd){
            this.showSt = showSt;
            this.showEd = showEd;
            return this;
        }

        public ConditionBuilder showGreaterEqThan(Integer showSt){
            this.showSt = showSt;
            return this;
        }
        public ConditionBuilder showLessEqThan(Integer showEd){
            this.showEd = showEd;
            return this;
        }


        public ConditionBuilder showList(Integer ... show){
            this.showList = solveNullList(show);
            return this;
        }

        public ConditionBuilder showList(List<Integer> show){
            this.showList = show;
            return this;
        }

        public ConditionBuilder parentIdBetWeen(Long parentIdSt,Long parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public ConditionBuilder parentIdGreaterEqThan(Long parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public ConditionBuilder parentIdLessEqThan(Long parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public ConditionBuilder parentIdList(Long ... parentId){
            this.parentIdList = solveNullList(parentId);
            return this;
        }

        public ConditionBuilder parentIdList(List<Long> parentId){
            this.parentIdList = parentId;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private ZcUser obj;

        public Builder(){
            this.obj = new ZcUser();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder loginAccount(String loginAccount){
            this.obj.setLoginAccount(loginAccount);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder userName(String userName){
            this.obj.setUserName(userName);
            return this;
        }
        public Builder phoneNum(String phoneNum){
            this.obj.setPhoneNum(phoneNum);
            return this;
        }
        public Builder mailAddress(String mailAddress){
            this.obj.setMailAddress(mailAddress);
            return this;
        }
        public Builder show(Integer show){
            this.obj.setShow(show);
            return this;
        }
        public Builder parentId(Long parentId){
            this.obj.setParentId(parentId);
            return this;
        }
        public ZcUser build(){return obj;}
    }

}
