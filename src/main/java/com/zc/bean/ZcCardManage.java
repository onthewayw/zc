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
public class ZcCardManage implements Serializable {

    private static final long serialVersionUID = 1573053187981L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 1联通卡 2移动卡 3 电信卡
    * isNullAble:1
    */
    private Integer type;

    /**
    * 
    * isNullAble:1
    */
    private String code;

    /**
    * 
    * isNullAble:1
    */
    private String iccid;

    /**
    * 所属代理
    * isNullAble:1
    */
    private String belongUser;

    /**
    * 1正常使用 2库存  3停用
    * isNullAble:1
    */
    private Integer status;

    /**
    * api名称
    * isNullAble:1
    */
    private String apiName;

    /**
    * api  id
    * isNullAble:1
    */
    private Long apiId;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setCode(String code){this.code = code;}

    public String getCode(){return this.code;}

    public void setIccid(String iccid){this.iccid = iccid;}

    public String getIccid(){return this.iccid;}

    public void setBelongUser(String belongUser){this.belongUser = belongUser;}

    public String getBelongUser(){return this.belongUser;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setApiName(String apiName){this.apiName = apiName;}

    public String getApiName(){return this.apiName;}

    public void setApiId(Long apiId){this.apiId = apiId;}

    public Long getApiId(){return this.apiId;}
    @Override
    public String toString() {
        return "ZcCardManage{" +
                "id='" + id + '\'' +
                "type='" + type + '\'' +
                "code='" + code + '\'' +
                "iccid='" + iccid + '\'' +
                "belongUser='" + belongUser + '\'' +
                "status='" + status + '\'' +
                "apiName='" + apiName + '\'' +
                "apiId='" + apiId + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ZcCardManage set;

        private ConditionBuilder where;

        public UpdateBuilder set(ZcCardManage set){
            this.set = set;
            return this;
        }

        public ZcCardManage getSet(){
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

    public static class QueryBuilder extends ZcCardManage{
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

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<String> iccidList;

        public List<String> getIccidList(){return this.iccidList;}


        private List<String> fuzzyIccid;

        public List<String> getFuzzyIccid(){return this.fuzzyIccid;}

        private List<String> rightFuzzyIccid;

        public List<String> getRightFuzzyIccid(){return this.rightFuzzyIccid;}
        private List<String> belongUserList;

        public List<String> getBelongUserList(){return this.belongUserList;}


        private List<String> fuzzyBelongUser;

        public List<String> getFuzzyBelongUser(){return this.fuzzyBelongUser;}

        private List<String> rightFuzzyBelongUser;

        public List<String> getRightFuzzyBelongUser(){return this.rightFuzzyBelongUser;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<String> apiNameList;

        public List<String> getApiNameList(){return this.apiNameList;}


        private List<String> fuzzyApiName;

        public List<String> getFuzzyApiName(){return this.fuzzyApiName;}

        private List<String> rightFuzzyApiName;

        public List<String> getRightFuzzyApiName(){return this.rightFuzzyApiName;}
        private List<Long> apiIdList;

        public List<Long> getApiIdList(){return this.apiIdList;}

        private Long apiIdSt;

        private Long apiIdEd;

        public Long getApiIdSt(){return this.apiIdSt;}

        public Long getApiIdEd(){return this.apiIdEd;}

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

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public QueryBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public QueryBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public QueryBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public QueryBuilder code(String code){
            setCode(code);
            return this;
        }

        public QueryBuilder codeList(String ... code){
            this.codeList = solveNullList(code);
            return this;
        }

        public QueryBuilder codeList(List<String> code){
            this.codeList = code;
            return this;
        }

        public QueryBuilder fetchCode(){
            setFetchFields("fetchFields","code");
            return this;
        }

        public QueryBuilder excludeCode(){
            setFetchFields("excludeFields","code");
            return this;
        }

        public QueryBuilder fuzzyIccid (List<String> fuzzyIccid){
            this.fuzzyIccid = fuzzyIccid;
            return this;
        }

        public QueryBuilder fuzzyIccid (String ... fuzzyIccid){
            this.fuzzyIccid = solveNullList(fuzzyIccid);
            return this;
        }

        public QueryBuilder rightFuzzyIccid (List<String> rightFuzzyIccid){
            this.rightFuzzyIccid = rightFuzzyIccid;
            return this;
        }

        public QueryBuilder rightFuzzyIccid (String ... rightFuzzyIccid){
            this.rightFuzzyIccid = solveNullList(rightFuzzyIccid);
            return this;
        }

        public QueryBuilder iccid(String iccid){
            setIccid(iccid);
            return this;
        }

        public QueryBuilder iccidList(String ... iccid){
            this.iccidList = solveNullList(iccid);
            return this;
        }

        public QueryBuilder iccidList(List<String> iccid){
            this.iccidList = iccid;
            return this;
        }

        public QueryBuilder fetchIccid(){
            setFetchFields("fetchFields","iccid");
            return this;
        }

        public QueryBuilder excludeIccid(){
            setFetchFields("excludeFields","iccid");
            return this;
        }

        public QueryBuilder fuzzyBelongUser (List<String> fuzzyBelongUser){
            this.fuzzyBelongUser = fuzzyBelongUser;
            return this;
        }

        public QueryBuilder fuzzyBelongUser (String ... fuzzyBelongUser){
            this.fuzzyBelongUser = solveNullList(fuzzyBelongUser);
            return this;
        }

        public QueryBuilder rightFuzzyBelongUser (List<String> rightFuzzyBelongUser){
            this.rightFuzzyBelongUser = rightFuzzyBelongUser;
            return this;
        }

        public QueryBuilder rightFuzzyBelongUser (String ... rightFuzzyBelongUser){
            this.rightFuzzyBelongUser = solveNullList(rightFuzzyBelongUser);
            return this;
        }

        public QueryBuilder belongUser(String belongUser){
            setBelongUser(belongUser);
            return this;
        }

        public QueryBuilder belongUserList(String ... belongUser){
            this.belongUserList = solveNullList(belongUser);
            return this;
        }

        public QueryBuilder belongUserList(List<String> belongUser){
            this.belongUserList = belongUser;
            return this;
        }

        public QueryBuilder fetchBelongUser(){
            setFetchFields("fetchFields","belongUser");
            return this;
        }

        public QueryBuilder excludeBelongUser(){
            setFetchFields("excludeFields","belongUser");
            return this;
        }

        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder fuzzyApiName (List<String> fuzzyApiName){
            this.fuzzyApiName = fuzzyApiName;
            return this;
        }

        public QueryBuilder fuzzyApiName (String ... fuzzyApiName){
            this.fuzzyApiName = solveNullList(fuzzyApiName);
            return this;
        }

        public QueryBuilder rightFuzzyApiName (List<String> rightFuzzyApiName){
            this.rightFuzzyApiName = rightFuzzyApiName;
            return this;
        }

        public QueryBuilder rightFuzzyApiName (String ... rightFuzzyApiName){
            this.rightFuzzyApiName = solveNullList(rightFuzzyApiName);
            return this;
        }

        public QueryBuilder apiName(String apiName){
            setApiName(apiName);
            return this;
        }

        public QueryBuilder apiNameList(String ... apiName){
            this.apiNameList = solveNullList(apiName);
            return this;
        }

        public QueryBuilder apiNameList(List<String> apiName){
            this.apiNameList = apiName;
            return this;
        }

        public QueryBuilder fetchApiName(){
            setFetchFields("fetchFields","apiName");
            return this;
        }

        public QueryBuilder excludeApiName(){
            setFetchFields("excludeFields","apiName");
            return this;
        }

        public QueryBuilder apiIdBetWeen(Long apiIdSt,Long apiIdEd){
            this.apiIdSt = apiIdSt;
            this.apiIdEd = apiIdEd;
            return this;
        }

        public QueryBuilder apiIdGreaterEqThan(Long apiIdSt){
            this.apiIdSt = apiIdSt;
            return this;
        }
        public QueryBuilder apiIdLessEqThan(Long apiIdEd){
            this.apiIdEd = apiIdEd;
            return this;
        }


        public QueryBuilder apiId(Long apiId){
            setApiId(apiId);
            return this;
        }

        public QueryBuilder apiIdList(Long ... apiId){
            this.apiIdList = solveNullList(apiId);
            return this;
        }

        public QueryBuilder apiIdList(List<Long> apiId){
            this.apiIdList = apiId;
            return this;
        }

        public QueryBuilder fetchApiId(){
            setFetchFields("fetchFields","apiId");
            return this;
        }

        public QueryBuilder excludeApiId(){
            setFetchFields("excludeFields","apiId");
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

        public ZcCardManage build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<String> iccidList;

        public List<String> getIccidList(){return this.iccidList;}


        private List<String> fuzzyIccid;

        public List<String> getFuzzyIccid(){return this.fuzzyIccid;}

        private List<String> rightFuzzyIccid;

        public List<String> getRightFuzzyIccid(){return this.rightFuzzyIccid;}
        private List<String> belongUserList;

        public List<String> getBelongUserList(){return this.belongUserList;}


        private List<String> fuzzyBelongUser;

        public List<String> getFuzzyBelongUser(){return this.fuzzyBelongUser;}

        private List<String> rightFuzzyBelongUser;

        public List<String> getRightFuzzyBelongUser(){return this.rightFuzzyBelongUser;}
        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<String> apiNameList;

        public List<String> getApiNameList(){return this.apiNameList;}


        private List<String> fuzzyApiName;

        public List<String> getFuzzyApiName(){return this.fuzzyApiName;}

        private List<String> rightFuzzyApiName;

        public List<String> getRightFuzzyApiName(){return this.rightFuzzyApiName;}
        private List<Long> apiIdList;

        public List<Long> getApiIdList(){return this.apiIdList;}

        private Long apiIdSt;

        private Long apiIdEd;

        public Long getApiIdSt(){return this.apiIdSt;}

        public Long getApiIdEd(){return this.apiIdEd;}


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

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder fuzzyCode (List<String> fuzzyCode){
            this.fuzzyCode = fuzzyCode;
            return this;
        }

        public ConditionBuilder fuzzyCode (String ... fuzzyCode){
            this.fuzzyCode = solveNullList(fuzzyCode);
            return this;
        }

        public ConditionBuilder rightFuzzyCode (List<String> rightFuzzyCode){
            this.rightFuzzyCode = rightFuzzyCode;
            return this;
        }

        public ConditionBuilder rightFuzzyCode (String ... rightFuzzyCode){
            this.rightFuzzyCode = solveNullList(rightFuzzyCode);
            return this;
        }

        public ConditionBuilder codeList(String ... code){
            this.codeList = solveNullList(code);
            return this;
        }

        public ConditionBuilder codeList(List<String> code){
            this.codeList = code;
            return this;
        }

        public ConditionBuilder fuzzyIccid (List<String> fuzzyIccid){
            this.fuzzyIccid = fuzzyIccid;
            return this;
        }

        public ConditionBuilder fuzzyIccid (String ... fuzzyIccid){
            this.fuzzyIccid = solveNullList(fuzzyIccid);
            return this;
        }

        public ConditionBuilder rightFuzzyIccid (List<String> rightFuzzyIccid){
            this.rightFuzzyIccid = rightFuzzyIccid;
            return this;
        }

        public ConditionBuilder rightFuzzyIccid (String ... rightFuzzyIccid){
            this.rightFuzzyIccid = solveNullList(rightFuzzyIccid);
            return this;
        }

        public ConditionBuilder iccidList(String ... iccid){
            this.iccidList = solveNullList(iccid);
            return this;
        }

        public ConditionBuilder iccidList(List<String> iccid){
            this.iccidList = iccid;
            return this;
        }

        public ConditionBuilder fuzzyBelongUser (List<String> fuzzyBelongUser){
            this.fuzzyBelongUser = fuzzyBelongUser;
            return this;
        }

        public ConditionBuilder fuzzyBelongUser (String ... fuzzyBelongUser){
            this.fuzzyBelongUser = solveNullList(fuzzyBelongUser);
            return this;
        }

        public ConditionBuilder rightFuzzyBelongUser (List<String> rightFuzzyBelongUser){
            this.rightFuzzyBelongUser = rightFuzzyBelongUser;
            return this;
        }

        public ConditionBuilder rightFuzzyBelongUser (String ... rightFuzzyBelongUser){
            this.rightFuzzyBelongUser = solveNullList(rightFuzzyBelongUser);
            return this;
        }

        public ConditionBuilder belongUserList(String ... belongUser){
            this.belongUserList = solveNullList(belongUser);
            return this;
        }

        public ConditionBuilder belongUserList(List<String> belongUser){
            this.belongUserList = belongUser;
            return this;
        }

        public ConditionBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public ConditionBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public ConditionBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public ConditionBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder fuzzyApiName (List<String> fuzzyApiName){
            this.fuzzyApiName = fuzzyApiName;
            return this;
        }

        public ConditionBuilder fuzzyApiName (String ... fuzzyApiName){
            this.fuzzyApiName = solveNullList(fuzzyApiName);
            return this;
        }

        public ConditionBuilder rightFuzzyApiName (List<String> rightFuzzyApiName){
            this.rightFuzzyApiName = rightFuzzyApiName;
            return this;
        }

        public ConditionBuilder rightFuzzyApiName (String ... rightFuzzyApiName){
            this.rightFuzzyApiName = solveNullList(rightFuzzyApiName);
            return this;
        }

        public ConditionBuilder apiNameList(String ... apiName){
            this.apiNameList = solveNullList(apiName);
            return this;
        }

        public ConditionBuilder apiNameList(List<String> apiName){
            this.apiNameList = apiName;
            return this;
        }

        public ConditionBuilder apiIdBetWeen(Long apiIdSt,Long apiIdEd){
            this.apiIdSt = apiIdSt;
            this.apiIdEd = apiIdEd;
            return this;
        }

        public ConditionBuilder apiIdGreaterEqThan(Long apiIdSt){
            this.apiIdSt = apiIdSt;
            return this;
        }
        public ConditionBuilder apiIdLessEqThan(Long apiIdEd){
            this.apiIdEd = apiIdEd;
            return this;
        }


        public ConditionBuilder apiIdList(Long ... apiId){
            this.apiIdList = solveNullList(apiId);
            return this;
        }

        public ConditionBuilder apiIdList(List<Long> apiId){
            this.apiIdList = apiId;
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

        private ZcCardManage obj;

        public Builder(){
            this.obj = new ZcCardManage();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder code(String code){
            this.obj.setCode(code);
            return this;
        }
        public Builder iccid(String iccid){
            this.obj.setIccid(iccid);
            return this;
        }
        public Builder belongUser(String belongUser){
            this.obj.setBelongUser(belongUser);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder apiName(String apiName){
            this.obj.setApiName(apiName);
            return this;
        }
        public Builder apiId(Long apiId){
            this.obj.setApiId(apiId);
            return this;
        }
        public ZcCardManage build(){return obj;}
    }

}
