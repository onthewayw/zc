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
public class ZcCommissionRecord implements Serializable {

    private static final long serialVersionUID = 1573053219375L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * code
    * isNullAble:1
    */
    private String code;

    /**
    * 记录创建时间
    * isNullAble:1
    */
    private String createTime;

    /**
    * 0增加 1减少
    * isNullAble:1
    */
    private Integer changeType;

    /**
    * 需除100  变更的金额
    * isNullAble:1
    */
    private Long changeAmount;

    /**
    * 需除100  变更后账户余额
    * isNullAble:1
    */
    private Long changeAfterAmount;

    /**
    * 
    * isNullAble:1
    */
    private String remark;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setCode(String code){this.code = code;}

    public String getCode(){return this.code;}

    public void setCreateTime(String createTime){this.createTime = createTime;}

    public String getCreateTime(){return this.createTime;}

    public void setChangeType(Integer changeType){this.changeType = changeType;}

    public Integer getChangeType(){return this.changeType;}

    public void setChangeAmount(Long changeAmount){this.changeAmount = changeAmount;}

    public Long getChangeAmount(){return this.changeAmount;}

    public void setChangeAfterAmount(Long changeAfterAmount){this.changeAfterAmount = changeAfterAmount;}

    public Long getChangeAfterAmount(){return this.changeAfterAmount;}

    public void setRemark(String remark){this.remark = remark;}

    public String getRemark(){return this.remark;}
    @Override
    public String toString() {
        return "ZcCommissionRecord{" +
                "id='" + id + '\'' +
                "code='" + code + '\'' +
                "createTime='" + createTime + '\'' +
                "changeType='" + changeType + '\'' +
                "changeAmount='" + changeAmount + '\'' +
                "changeAfterAmount='" + changeAfterAmount + '\'' +
                "remark='" + remark + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ZcCommissionRecord set;

        private ConditionBuilder where;

        public UpdateBuilder set(ZcCommissionRecord set){
            this.set = set;
            return this;
        }

        public ZcCommissionRecord getSet(){
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

    public static class QueryBuilder extends ZcCommissionRecord{
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

        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<String> createTimeList;

        public List<String> getCreateTimeList(){return this.createTimeList;}


        private List<String> fuzzyCreateTime;

        public List<String> getFuzzyCreateTime(){return this.fuzzyCreateTime;}

        private List<String> rightFuzzyCreateTime;

        public List<String> getRightFuzzyCreateTime(){return this.rightFuzzyCreateTime;}
        private List<Integer> changeTypeList;

        public List<Integer> getChangeTypeList(){return this.changeTypeList;}

        private Integer changeTypeSt;

        private Integer changeTypeEd;

        public Integer getChangeTypeSt(){return this.changeTypeSt;}

        public Integer getChangeTypeEd(){return this.changeTypeEd;}

        private List<Long> changeAmountList;

        public List<Long> getChangeAmountList(){return this.changeAmountList;}

        private Long changeAmountSt;

        private Long changeAmountEd;

        public Long getChangeAmountSt(){return this.changeAmountSt;}

        public Long getChangeAmountEd(){return this.changeAmountEd;}

        private List<Long> changeAfterAmountList;

        public List<Long> getChangeAfterAmountList(){return this.changeAfterAmountList;}

        private Long changeAfterAmountSt;

        private Long changeAfterAmountEd;

        public Long getChangeAfterAmountSt(){return this.changeAfterAmountSt;}

        public Long getChangeAfterAmountEd(){return this.changeAfterAmountEd;}

        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
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

        public QueryBuilder fuzzyCreateTime (List<String> fuzzyCreateTime){
            this.fuzzyCreateTime = fuzzyCreateTime;
            return this;
        }

        public QueryBuilder fuzzyCreateTime (String ... fuzzyCreateTime){
            this.fuzzyCreateTime = solveNullList(fuzzyCreateTime);
            return this;
        }

        public QueryBuilder rightFuzzyCreateTime (List<String> rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = rightFuzzyCreateTime;
            return this;
        }

        public QueryBuilder rightFuzzyCreateTime (String ... rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = solveNullList(rightFuzzyCreateTime);
            return this;
        }

        public QueryBuilder createTime(String createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(String ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<String> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder changeTypeBetWeen(Integer changeTypeSt,Integer changeTypeEd){
            this.changeTypeSt = changeTypeSt;
            this.changeTypeEd = changeTypeEd;
            return this;
        }

        public QueryBuilder changeTypeGreaterEqThan(Integer changeTypeSt){
            this.changeTypeSt = changeTypeSt;
            return this;
        }
        public QueryBuilder changeTypeLessEqThan(Integer changeTypeEd){
            this.changeTypeEd = changeTypeEd;
            return this;
        }


        public QueryBuilder changeType(Integer changeType){
            setChangeType(changeType);
            return this;
        }

        public QueryBuilder changeTypeList(Integer ... changeType){
            this.changeTypeList = solveNullList(changeType);
            return this;
        }

        public QueryBuilder changeTypeList(List<Integer> changeType){
            this.changeTypeList = changeType;
            return this;
        }

        public QueryBuilder fetchChangeType(){
            setFetchFields("fetchFields","changeType");
            return this;
        }

        public QueryBuilder excludeChangeType(){
            setFetchFields("excludeFields","changeType");
            return this;
        }

        public QueryBuilder changeAmountBetWeen(Long changeAmountSt,Long changeAmountEd){
            this.changeAmountSt = changeAmountSt;
            this.changeAmountEd = changeAmountEd;
            return this;
        }

        public QueryBuilder changeAmountGreaterEqThan(Long changeAmountSt){
            this.changeAmountSt = changeAmountSt;
            return this;
        }
        public QueryBuilder changeAmountLessEqThan(Long changeAmountEd){
            this.changeAmountEd = changeAmountEd;
            return this;
        }


        public QueryBuilder changeAmount(Long changeAmount){
            setChangeAmount(changeAmount);
            return this;
        }

        public QueryBuilder changeAmountList(Long ... changeAmount){
            this.changeAmountList = solveNullList(changeAmount);
            return this;
        }

        public QueryBuilder changeAmountList(List<Long> changeAmount){
            this.changeAmountList = changeAmount;
            return this;
        }

        public QueryBuilder fetchChangeAmount(){
            setFetchFields("fetchFields","changeAmount");
            return this;
        }

        public QueryBuilder excludeChangeAmount(){
            setFetchFields("excludeFields","changeAmount");
            return this;
        }

        public QueryBuilder changeAfterAmountBetWeen(Long changeAfterAmountSt,Long changeAfterAmountEd){
            this.changeAfterAmountSt = changeAfterAmountSt;
            this.changeAfterAmountEd = changeAfterAmountEd;
            return this;
        }

        public QueryBuilder changeAfterAmountGreaterEqThan(Long changeAfterAmountSt){
            this.changeAfterAmountSt = changeAfterAmountSt;
            return this;
        }
        public QueryBuilder changeAfterAmountLessEqThan(Long changeAfterAmountEd){
            this.changeAfterAmountEd = changeAfterAmountEd;
            return this;
        }


        public QueryBuilder changeAfterAmount(Long changeAfterAmount){
            setChangeAfterAmount(changeAfterAmount);
            return this;
        }

        public QueryBuilder changeAfterAmountList(Long ... changeAfterAmount){
            this.changeAfterAmountList = solveNullList(changeAfterAmount);
            return this;
        }

        public QueryBuilder changeAfterAmountList(List<Long> changeAfterAmount){
            this.changeAfterAmountList = changeAfterAmount;
            return this;
        }

        public QueryBuilder fetchChangeAfterAmount(){
            setFetchFields("fetchFields","changeAfterAmount");
            return this;
        }

        public QueryBuilder excludeChangeAfterAmount(){
            setFetchFields("excludeFields","changeAfterAmount");
            return this;
        }

        public QueryBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public QueryBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public QueryBuilder remark(String remark){
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public QueryBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark(){
            setFetchFields("fetchFields","remark");
            return this;
        }

        public QueryBuilder excludeRemark(){
            setFetchFields("excludeFields","remark");
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

        public ZcCommissionRecord build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> codeList;

        public List<String> getCodeList(){return this.codeList;}


        private List<String> fuzzyCode;

        public List<String> getFuzzyCode(){return this.fuzzyCode;}

        private List<String> rightFuzzyCode;

        public List<String> getRightFuzzyCode(){return this.rightFuzzyCode;}
        private List<String> createTimeList;

        public List<String> getCreateTimeList(){return this.createTimeList;}


        private List<String> fuzzyCreateTime;

        public List<String> getFuzzyCreateTime(){return this.fuzzyCreateTime;}

        private List<String> rightFuzzyCreateTime;

        public List<String> getRightFuzzyCreateTime(){return this.rightFuzzyCreateTime;}
        private List<Integer> changeTypeList;

        public List<Integer> getChangeTypeList(){return this.changeTypeList;}

        private Integer changeTypeSt;

        private Integer changeTypeEd;

        public Integer getChangeTypeSt(){return this.changeTypeSt;}

        public Integer getChangeTypeEd(){return this.changeTypeEd;}

        private List<Long> changeAmountList;

        public List<Long> getChangeAmountList(){return this.changeAmountList;}

        private Long changeAmountSt;

        private Long changeAmountEd;

        public Long getChangeAmountSt(){return this.changeAmountSt;}

        public Long getChangeAmountEd(){return this.changeAmountEd;}

        private List<Long> changeAfterAmountList;

        public List<Long> getChangeAfterAmountList(){return this.changeAfterAmountList;}

        private Long changeAfterAmountSt;

        private Long changeAfterAmountEd;

        public Long getChangeAfterAmountSt(){return this.changeAfterAmountSt;}

        public Long getChangeAfterAmountEd(){return this.changeAfterAmountEd;}

        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}

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

        public ConditionBuilder fuzzyCreateTime (List<String> fuzzyCreateTime){
            this.fuzzyCreateTime = fuzzyCreateTime;
            return this;
        }

        public ConditionBuilder fuzzyCreateTime (String ... fuzzyCreateTime){
            this.fuzzyCreateTime = solveNullList(fuzzyCreateTime);
            return this;
        }

        public ConditionBuilder rightFuzzyCreateTime (List<String> rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = rightFuzzyCreateTime;
            return this;
        }

        public ConditionBuilder rightFuzzyCreateTime (String ... rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = solveNullList(rightFuzzyCreateTime);
            return this;
        }

        public ConditionBuilder createTimeList(String ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<String> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder changeTypeBetWeen(Integer changeTypeSt,Integer changeTypeEd){
            this.changeTypeSt = changeTypeSt;
            this.changeTypeEd = changeTypeEd;
            return this;
        }

        public ConditionBuilder changeTypeGreaterEqThan(Integer changeTypeSt){
            this.changeTypeSt = changeTypeSt;
            return this;
        }
        public ConditionBuilder changeTypeLessEqThan(Integer changeTypeEd){
            this.changeTypeEd = changeTypeEd;
            return this;
        }


        public ConditionBuilder changeTypeList(Integer ... changeType){
            this.changeTypeList = solveNullList(changeType);
            return this;
        }

        public ConditionBuilder changeTypeList(List<Integer> changeType){
            this.changeTypeList = changeType;
            return this;
        }

        public ConditionBuilder changeAmountBetWeen(Long changeAmountSt,Long changeAmountEd){
            this.changeAmountSt = changeAmountSt;
            this.changeAmountEd = changeAmountEd;
            return this;
        }

        public ConditionBuilder changeAmountGreaterEqThan(Long changeAmountSt){
            this.changeAmountSt = changeAmountSt;
            return this;
        }
        public ConditionBuilder changeAmountLessEqThan(Long changeAmountEd){
            this.changeAmountEd = changeAmountEd;
            return this;
        }


        public ConditionBuilder changeAmountList(Long ... changeAmount){
            this.changeAmountList = solveNullList(changeAmount);
            return this;
        }

        public ConditionBuilder changeAmountList(List<Long> changeAmount){
            this.changeAmountList = changeAmount;
            return this;
        }

        public ConditionBuilder changeAfterAmountBetWeen(Long changeAfterAmountSt,Long changeAfterAmountEd){
            this.changeAfterAmountSt = changeAfterAmountSt;
            this.changeAfterAmountEd = changeAfterAmountEd;
            return this;
        }

        public ConditionBuilder changeAfterAmountGreaterEqThan(Long changeAfterAmountSt){
            this.changeAfterAmountSt = changeAfterAmountSt;
            return this;
        }
        public ConditionBuilder changeAfterAmountLessEqThan(Long changeAfterAmountEd){
            this.changeAfterAmountEd = changeAfterAmountEd;
            return this;
        }


        public ConditionBuilder changeAfterAmountList(Long ... changeAfterAmount){
            this.changeAfterAmountList = solveNullList(changeAfterAmount);
            return this;
        }

        public ConditionBuilder changeAfterAmountList(List<Long> changeAfterAmount){
            this.changeAfterAmountList = changeAfterAmount;
            return this;
        }

        public ConditionBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public ConditionBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public ConditionBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public ConditionBuilder remarkList(List<String> remark){
            this.remarkList = remark;
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

        private ZcCommissionRecord obj;

        public Builder(){
            this.obj = new ZcCommissionRecord();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder code(String code){
            this.obj.setCode(code);
            return this;
        }
        public Builder createTime(String createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder changeType(Integer changeType){
            this.obj.setChangeType(changeType);
            return this;
        }
        public Builder changeAmount(Long changeAmount){
            this.obj.setChangeAmount(changeAmount);
            return this;
        }
        public Builder changeAfterAmount(Long changeAfterAmount){
            this.obj.setChangeAfterAmount(changeAfterAmount);
            return this;
        }
        public Builder remark(String remark){
            this.obj.setRemark(remark);
            return this;
        }
        public ZcCommissionRecord build(){return obj;}
    }

}
