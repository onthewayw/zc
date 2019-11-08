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
public class ZcBalance implements Serializable {

    private static final long serialVersionUID = 1573053171970L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:1
    */
    private String code;

    /**
    * 类型 1上级充值 2下级扣费  3后台充值套餐  4总后台扣除  5自动充值
    * isNullAble:1
    */
    private Integer type;

    /**
    * 金额 都是乘100之后
    * isNullAble:1
    */
    private Long amount;

    /**
    * 变更后余额 都是乘100之后
    * isNullAble:1
    */
    private Long balanceAfterChange;

    /**
    * 创建记录时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 备注
    * isNullAble:1
    */
    private String remarks;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setCode(String code){this.code = code;}

    public String getCode(){return this.code;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setAmount(Long amount){this.amount = amount;}

    public Long getAmount(){return this.amount;}

    public void setBalanceAfterChange(Long balanceAfterChange){this.balanceAfterChange = balanceAfterChange;}

    public Long getBalanceAfterChange(){return this.balanceAfterChange;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setRemarks(String remarks){this.remarks = remarks;}

    public String getRemarks(){return this.remarks;}
    @Override
    public String toString() {
        return "ZcBalance{" +
                "id='" + id + '\'' +
                "code='" + code + '\'' +
                "type='" + type + '\'' +
                "amount='" + amount + '\'' +
                "balanceAfterChange='" + balanceAfterChange + '\'' +
                "createTime='" + createTime + '\'' +
                "remarks='" + remarks + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ZcBalance set;

        private ConditionBuilder where;

        public UpdateBuilder set(ZcBalance set){
            this.set = set;
            return this;
        }

        public ZcBalance getSet(){
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

    public static class QueryBuilder extends ZcBalance{
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
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Long> amountList;

        public List<Long> getAmountList(){return this.amountList;}

        private Long amountSt;

        private Long amountEd;

        public Long getAmountSt(){return this.amountSt;}

        public Long getAmountEd(){return this.amountEd;}

        private List<Long> balanceAfterChangeList;

        public List<Long> getBalanceAfterChangeList(){return this.balanceAfterChangeList;}

        private Long balanceAfterChangeSt;

        private Long balanceAfterChangeEd;

        public Long getBalanceAfterChangeSt(){return this.balanceAfterChangeSt;}

        public Long getBalanceAfterChangeEd(){return this.balanceAfterChangeEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> remarksList;

        public List<String> getRemarksList(){return this.remarksList;}


        private List<String> fuzzyRemarks;

        public List<String> getFuzzyRemarks(){return this.fuzzyRemarks;}

        private List<String> rightFuzzyRemarks;

        public List<String> getRightFuzzyRemarks(){return this.rightFuzzyRemarks;}
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

        public QueryBuilder amountBetWeen(Long amountSt,Long amountEd){
            this.amountSt = amountSt;
            this.amountEd = amountEd;
            return this;
        }

        public QueryBuilder amountGreaterEqThan(Long amountSt){
            this.amountSt = amountSt;
            return this;
        }
        public QueryBuilder amountLessEqThan(Long amountEd){
            this.amountEd = amountEd;
            return this;
        }


        public QueryBuilder amount(Long amount){
            setAmount(amount);
            return this;
        }

        public QueryBuilder amountList(Long ... amount){
            this.amountList = solveNullList(amount);
            return this;
        }

        public QueryBuilder amountList(List<Long> amount){
            this.amountList = amount;
            return this;
        }

        public QueryBuilder fetchAmount(){
            setFetchFields("fetchFields","amount");
            return this;
        }

        public QueryBuilder excludeAmount(){
            setFetchFields("excludeFields","amount");
            return this;
        }

        public QueryBuilder balanceAfterChangeBetWeen(Long balanceAfterChangeSt,Long balanceAfterChangeEd){
            this.balanceAfterChangeSt = balanceAfterChangeSt;
            this.balanceAfterChangeEd = balanceAfterChangeEd;
            return this;
        }

        public QueryBuilder balanceAfterChangeGreaterEqThan(Long balanceAfterChangeSt){
            this.balanceAfterChangeSt = balanceAfterChangeSt;
            return this;
        }
        public QueryBuilder balanceAfterChangeLessEqThan(Long balanceAfterChangeEd){
            this.balanceAfterChangeEd = balanceAfterChangeEd;
            return this;
        }


        public QueryBuilder balanceAfterChange(Long balanceAfterChange){
            setBalanceAfterChange(balanceAfterChange);
            return this;
        }

        public QueryBuilder balanceAfterChangeList(Long ... balanceAfterChange){
            this.balanceAfterChangeList = solveNullList(balanceAfterChange);
            return this;
        }

        public QueryBuilder balanceAfterChangeList(List<Long> balanceAfterChange){
            this.balanceAfterChangeList = balanceAfterChange;
            return this;
        }

        public QueryBuilder fetchBalanceAfterChange(){
            setFetchFields("fetchFields","balanceAfterChange");
            return this;
        }

        public QueryBuilder excludeBalanceAfterChange(){
            setFetchFields("excludeFields","balanceAfterChange");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
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

        public QueryBuilder fuzzyRemarks (List<String> fuzzyRemarks){
            this.fuzzyRemarks = fuzzyRemarks;
            return this;
        }

        public QueryBuilder fuzzyRemarks (String ... fuzzyRemarks){
            this.fuzzyRemarks = solveNullList(fuzzyRemarks);
            return this;
        }

        public QueryBuilder rightFuzzyRemarks (List<String> rightFuzzyRemarks){
            this.rightFuzzyRemarks = rightFuzzyRemarks;
            return this;
        }

        public QueryBuilder rightFuzzyRemarks (String ... rightFuzzyRemarks){
            this.rightFuzzyRemarks = solveNullList(rightFuzzyRemarks);
            return this;
        }

        public QueryBuilder remarks(String remarks){
            setRemarks(remarks);
            return this;
        }

        public QueryBuilder remarksList(String ... remarks){
            this.remarksList = solveNullList(remarks);
            return this;
        }

        public QueryBuilder remarksList(List<String> remarks){
            this.remarksList = remarks;
            return this;
        }

        public QueryBuilder fetchRemarks(){
            setFetchFields("fetchFields","remarks");
            return this;
        }

        public QueryBuilder excludeRemarks(){
            setFetchFields("excludeFields","remarks");
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

        public ZcBalance build(){return this;}
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
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Long> amountList;

        public List<Long> getAmountList(){return this.amountList;}

        private Long amountSt;

        private Long amountEd;

        public Long getAmountSt(){return this.amountSt;}

        public Long getAmountEd(){return this.amountEd;}

        private List<Long> balanceAfterChangeList;

        public List<Long> getBalanceAfterChangeList(){return this.balanceAfterChangeList;}

        private Long balanceAfterChangeSt;

        private Long balanceAfterChangeEd;

        public Long getBalanceAfterChangeSt(){return this.balanceAfterChangeSt;}

        public Long getBalanceAfterChangeEd(){return this.balanceAfterChangeEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> remarksList;

        public List<String> getRemarksList(){return this.remarksList;}


        private List<String> fuzzyRemarks;

        public List<String> getFuzzyRemarks(){return this.fuzzyRemarks;}

        private List<String> rightFuzzyRemarks;

        public List<String> getRightFuzzyRemarks(){return this.rightFuzzyRemarks;}

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

        public ConditionBuilder amountBetWeen(Long amountSt,Long amountEd){
            this.amountSt = amountSt;
            this.amountEd = amountEd;
            return this;
        }

        public ConditionBuilder amountGreaterEqThan(Long amountSt){
            this.amountSt = amountSt;
            return this;
        }
        public ConditionBuilder amountLessEqThan(Long amountEd){
            this.amountEd = amountEd;
            return this;
        }


        public ConditionBuilder amountList(Long ... amount){
            this.amountList = solveNullList(amount);
            return this;
        }

        public ConditionBuilder amountList(List<Long> amount){
            this.amountList = amount;
            return this;
        }

        public ConditionBuilder balanceAfterChangeBetWeen(Long balanceAfterChangeSt,Long balanceAfterChangeEd){
            this.balanceAfterChangeSt = balanceAfterChangeSt;
            this.balanceAfterChangeEd = balanceAfterChangeEd;
            return this;
        }

        public ConditionBuilder balanceAfterChangeGreaterEqThan(Long balanceAfterChangeSt){
            this.balanceAfterChangeSt = balanceAfterChangeSt;
            return this;
        }
        public ConditionBuilder balanceAfterChangeLessEqThan(Long balanceAfterChangeEd){
            this.balanceAfterChangeEd = balanceAfterChangeEd;
            return this;
        }


        public ConditionBuilder balanceAfterChangeList(Long ... balanceAfterChange){
            this.balanceAfterChangeList = solveNullList(balanceAfterChange);
            return this;
        }

        public ConditionBuilder balanceAfterChangeList(List<Long> balanceAfterChange){
            this.balanceAfterChangeList = balanceAfterChange;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder fuzzyRemarks (List<String> fuzzyRemarks){
            this.fuzzyRemarks = fuzzyRemarks;
            return this;
        }

        public ConditionBuilder fuzzyRemarks (String ... fuzzyRemarks){
            this.fuzzyRemarks = solveNullList(fuzzyRemarks);
            return this;
        }

        public ConditionBuilder rightFuzzyRemarks (List<String> rightFuzzyRemarks){
            this.rightFuzzyRemarks = rightFuzzyRemarks;
            return this;
        }

        public ConditionBuilder rightFuzzyRemarks (String ... rightFuzzyRemarks){
            this.rightFuzzyRemarks = solveNullList(rightFuzzyRemarks);
            return this;
        }

        public ConditionBuilder remarksList(String ... remarks){
            this.remarksList = solveNullList(remarks);
            return this;
        }

        public ConditionBuilder remarksList(List<String> remarks){
            this.remarksList = remarks;
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

        private ZcBalance obj;

        public Builder(){
            this.obj = new ZcBalance();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder code(String code){
            this.obj.setCode(code);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder amount(Long amount){
            this.obj.setAmount(amount);
            return this;
        }
        public Builder balanceAfterChange(Long balanceAfterChange){
            this.obj.setBalanceAfterChange(balanceAfterChange);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder remarks(String remarks){
            this.obj.setRemarks(remarks);
            return this;
        }
        public ZcBalance build(){return obj;}
    }

}
