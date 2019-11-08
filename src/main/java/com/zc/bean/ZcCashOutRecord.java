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
public class ZcCashOutRecord implements Serializable {

    private static final long serialVersionUID = 1573053199861L;


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
    * 需除100 提现金额
    * isNullAble:1
    */
    private Long cashOutAmount;

    /**
    * 创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 支付宝账号
    * isNullAble:1
    */
    private String alipayAccount;

    /**
    * 支付宝名字
    * isNullAble:1
    */
    private String alipayName;

    /**
    * 1支付宝
    * isNullAble:1
    */
    private Integer type;

    /**
    * 1申请中 2申请成功
    * isNullAble:1
    */
    private String remarkStatus;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setCode(String code){this.code = code;}

    public String getCode(){return this.code;}

    public void setCashOutAmount(Long cashOutAmount){this.cashOutAmount = cashOutAmount;}

    public Long getCashOutAmount(){return this.cashOutAmount;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setAlipayAccount(String alipayAccount){this.alipayAccount = alipayAccount;}

    public String getAlipayAccount(){return this.alipayAccount;}

    public void setAlipayName(String alipayName){this.alipayName = alipayName;}

    public String getAlipayName(){return this.alipayName;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setRemarkStatus(String remarkStatus){this.remarkStatus = remarkStatus;}

    public String getRemarkStatus(){return this.remarkStatus;}
    @Override
    public String toString() {
        return "ZcCashOutRecord{" +
                "id='" + id + '\'' +
                "code='" + code + '\'' +
                "cashOutAmount='" + cashOutAmount + '\'' +
                "createTime='" + createTime + '\'' +
                "alipayAccount='" + alipayAccount + '\'' +
                "alipayName='" + alipayName + '\'' +
                "type='" + type + '\'' +
                "remarkStatus='" + remarkStatus + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ZcCashOutRecord set;

        private ConditionBuilder where;

        public UpdateBuilder set(ZcCashOutRecord set){
            this.set = set;
            return this;
        }

        public ZcCashOutRecord getSet(){
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

    public static class QueryBuilder extends ZcCashOutRecord{
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
        private List<Long> cashOutAmountList;

        public List<Long> getCashOutAmountList(){return this.cashOutAmountList;}

        private Long cashOutAmountSt;

        private Long cashOutAmountEd;

        public Long getCashOutAmountSt(){return this.cashOutAmountSt;}

        public Long getCashOutAmountEd(){return this.cashOutAmountEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> alipayAccountList;

        public List<String> getAlipayAccountList(){return this.alipayAccountList;}


        private List<String> fuzzyAlipayAccount;

        public List<String> getFuzzyAlipayAccount(){return this.fuzzyAlipayAccount;}

        private List<String> rightFuzzyAlipayAccount;

        public List<String> getRightFuzzyAlipayAccount(){return this.rightFuzzyAlipayAccount;}
        private List<String> alipayNameList;

        public List<String> getAlipayNameList(){return this.alipayNameList;}


        private List<String> fuzzyAlipayName;

        public List<String> getFuzzyAlipayName(){return this.fuzzyAlipayName;}

        private List<String> rightFuzzyAlipayName;

        public List<String> getRightFuzzyAlipayName(){return this.rightFuzzyAlipayName;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<String> remarkStatusList;

        public List<String> getRemarkStatusList(){return this.remarkStatusList;}


        private List<String> fuzzyRemarkStatus;

        public List<String> getFuzzyRemarkStatus(){return this.fuzzyRemarkStatus;}

        private List<String> rightFuzzyRemarkStatus;

        public List<String> getRightFuzzyRemarkStatus(){return this.rightFuzzyRemarkStatus;}
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

        public QueryBuilder cashOutAmountBetWeen(Long cashOutAmountSt,Long cashOutAmountEd){
            this.cashOutAmountSt = cashOutAmountSt;
            this.cashOutAmountEd = cashOutAmountEd;
            return this;
        }

        public QueryBuilder cashOutAmountGreaterEqThan(Long cashOutAmountSt){
            this.cashOutAmountSt = cashOutAmountSt;
            return this;
        }
        public QueryBuilder cashOutAmountLessEqThan(Long cashOutAmountEd){
            this.cashOutAmountEd = cashOutAmountEd;
            return this;
        }


        public QueryBuilder cashOutAmount(Long cashOutAmount){
            setCashOutAmount(cashOutAmount);
            return this;
        }

        public QueryBuilder cashOutAmountList(Long ... cashOutAmount){
            this.cashOutAmountList = solveNullList(cashOutAmount);
            return this;
        }

        public QueryBuilder cashOutAmountList(List<Long> cashOutAmount){
            this.cashOutAmountList = cashOutAmount;
            return this;
        }

        public QueryBuilder fetchCashOutAmount(){
            setFetchFields("fetchFields","cashOutAmount");
            return this;
        }

        public QueryBuilder excludeCashOutAmount(){
            setFetchFields("excludeFields","cashOutAmount");
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

        public QueryBuilder fuzzyAlipayAccount (List<String> fuzzyAlipayAccount){
            this.fuzzyAlipayAccount = fuzzyAlipayAccount;
            return this;
        }

        public QueryBuilder fuzzyAlipayAccount (String ... fuzzyAlipayAccount){
            this.fuzzyAlipayAccount = solveNullList(fuzzyAlipayAccount);
            return this;
        }

        public QueryBuilder rightFuzzyAlipayAccount (List<String> rightFuzzyAlipayAccount){
            this.rightFuzzyAlipayAccount = rightFuzzyAlipayAccount;
            return this;
        }

        public QueryBuilder rightFuzzyAlipayAccount (String ... rightFuzzyAlipayAccount){
            this.rightFuzzyAlipayAccount = solveNullList(rightFuzzyAlipayAccount);
            return this;
        }

        public QueryBuilder alipayAccount(String alipayAccount){
            setAlipayAccount(alipayAccount);
            return this;
        }

        public QueryBuilder alipayAccountList(String ... alipayAccount){
            this.alipayAccountList = solveNullList(alipayAccount);
            return this;
        }

        public QueryBuilder alipayAccountList(List<String> alipayAccount){
            this.alipayAccountList = alipayAccount;
            return this;
        }

        public QueryBuilder fetchAlipayAccount(){
            setFetchFields("fetchFields","alipayAccount");
            return this;
        }

        public QueryBuilder excludeAlipayAccount(){
            setFetchFields("excludeFields","alipayAccount");
            return this;
        }

        public QueryBuilder fuzzyAlipayName (List<String> fuzzyAlipayName){
            this.fuzzyAlipayName = fuzzyAlipayName;
            return this;
        }

        public QueryBuilder fuzzyAlipayName (String ... fuzzyAlipayName){
            this.fuzzyAlipayName = solveNullList(fuzzyAlipayName);
            return this;
        }

        public QueryBuilder rightFuzzyAlipayName (List<String> rightFuzzyAlipayName){
            this.rightFuzzyAlipayName = rightFuzzyAlipayName;
            return this;
        }

        public QueryBuilder rightFuzzyAlipayName (String ... rightFuzzyAlipayName){
            this.rightFuzzyAlipayName = solveNullList(rightFuzzyAlipayName);
            return this;
        }

        public QueryBuilder alipayName(String alipayName){
            setAlipayName(alipayName);
            return this;
        }

        public QueryBuilder alipayNameList(String ... alipayName){
            this.alipayNameList = solveNullList(alipayName);
            return this;
        }

        public QueryBuilder alipayNameList(List<String> alipayName){
            this.alipayNameList = alipayName;
            return this;
        }

        public QueryBuilder fetchAlipayName(){
            setFetchFields("fetchFields","alipayName");
            return this;
        }

        public QueryBuilder excludeAlipayName(){
            setFetchFields("excludeFields","alipayName");
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

        public QueryBuilder fuzzyRemarkStatus (List<String> fuzzyRemarkStatus){
            this.fuzzyRemarkStatus = fuzzyRemarkStatus;
            return this;
        }

        public QueryBuilder fuzzyRemarkStatus (String ... fuzzyRemarkStatus){
            this.fuzzyRemarkStatus = solveNullList(fuzzyRemarkStatus);
            return this;
        }

        public QueryBuilder rightFuzzyRemarkStatus (List<String> rightFuzzyRemarkStatus){
            this.rightFuzzyRemarkStatus = rightFuzzyRemarkStatus;
            return this;
        }

        public QueryBuilder rightFuzzyRemarkStatus (String ... rightFuzzyRemarkStatus){
            this.rightFuzzyRemarkStatus = solveNullList(rightFuzzyRemarkStatus);
            return this;
        }

        public QueryBuilder remarkStatus(String remarkStatus){
            setRemarkStatus(remarkStatus);
            return this;
        }

        public QueryBuilder remarkStatusList(String ... remarkStatus){
            this.remarkStatusList = solveNullList(remarkStatus);
            return this;
        }

        public QueryBuilder remarkStatusList(List<String> remarkStatus){
            this.remarkStatusList = remarkStatus;
            return this;
        }

        public QueryBuilder fetchRemarkStatus(){
            setFetchFields("fetchFields","remarkStatus");
            return this;
        }

        public QueryBuilder excludeRemarkStatus(){
            setFetchFields("excludeFields","remarkStatus");
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

        public ZcCashOutRecord build(){return this;}
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
        private List<Long> cashOutAmountList;

        public List<Long> getCashOutAmountList(){return this.cashOutAmountList;}

        private Long cashOutAmountSt;

        private Long cashOutAmountEd;

        public Long getCashOutAmountSt(){return this.cashOutAmountSt;}

        public Long getCashOutAmountEd(){return this.cashOutAmountEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<String> alipayAccountList;

        public List<String> getAlipayAccountList(){return this.alipayAccountList;}


        private List<String> fuzzyAlipayAccount;

        public List<String> getFuzzyAlipayAccount(){return this.fuzzyAlipayAccount;}

        private List<String> rightFuzzyAlipayAccount;

        public List<String> getRightFuzzyAlipayAccount(){return this.rightFuzzyAlipayAccount;}
        private List<String> alipayNameList;

        public List<String> getAlipayNameList(){return this.alipayNameList;}


        private List<String> fuzzyAlipayName;

        public List<String> getFuzzyAlipayName(){return this.fuzzyAlipayName;}

        private List<String> rightFuzzyAlipayName;

        public List<String> getRightFuzzyAlipayName(){return this.rightFuzzyAlipayName;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<String> remarkStatusList;

        public List<String> getRemarkStatusList(){return this.remarkStatusList;}


        private List<String> fuzzyRemarkStatus;

        public List<String> getFuzzyRemarkStatus(){return this.fuzzyRemarkStatus;}

        private List<String> rightFuzzyRemarkStatus;

        public List<String> getRightFuzzyRemarkStatus(){return this.rightFuzzyRemarkStatus;}

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

        public ConditionBuilder cashOutAmountBetWeen(Long cashOutAmountSt,Long cashOutAmountEd){
            this.cashOutAmountSt = cashOutAmountSt;
            this.cashOutAmountEd = cashOutAmountEd;
            return this;
        }

        public ConditionBuilder cashOutAmountGreaterEqThan(Long cashOutAmountSt){
            this.cashOutAmountSt = cashOutAmountSt;
            return this;
        }
        public ConditionBuilder cashOutAmountLessEqThan(Long cashOutAmountEd){
            this.cashOutAmountEd = cashOutAmountEd;
            return this;
        }


        public ConditionBuilder cashOutAmountList(Long ... cashOutAmount){
            this.cashOutAmountList = solveNullList(cashOutAmount);
            return this;
        }

        public ConditionBuilder cashOutAmountList(List<Long> cashOutAmount){
            this.cashOutAmountList = cashOutAmount;
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

        public ConditionBuilder fuzzyAlipayAccount (List<String> fuzzyAlipayAccount){
            this.fuzzyAlipayAccount = fuzzyAlipayAccount;
            return this;
        }

        public ConditionBuilder fuzzyAlipayAccount (String ... fuzzyAlipayAccount){
            this.fuzzyAlipayAccount = solveNullList(fuzzyAlipayAccount);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayAccount (List<String> rightFuzzyAlipayAccount){
            this.rightFuzzyAlipayAccount = rightFuzzyAlipayAccount;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayAccount (String ... rightFuzzyAlipayAccount){
            this.rightFuzzyAlipayAccount = solveNullList(rightFuzzyAlipayAccount);
            return this;
        }

        public ConditionBuilder alipayAccountList(String ... alipayAccount){
            this.alipayAccountList = solveNullList(alipayAccount);
            return this;
        }

        public ConditionBuilder alipayAccountList(List<String> alipayAccount){
            this.alipayAccountList = alipayAccount;
            return this;
        }

        public ConditionBuilder fuzzyAlipayName (List<String> fuzzyAlipayName){
            this.fuzzyAlipayName = fuzzyAlipayName;
            return this;
        }

        public ConditionBuilder fuzzyAlipayName (String ... fuzzyAlipayName){
            this.fuzzyAlipayName = solveNullList(fuzzyAlipayName);
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayName (List<String> rightFuzzyAlipayName){
            this.rightFuzzyAlipayName = rightFuzzyAlipayName;
            return this;
        }

        public ConditionBuilder rightFuzzyAlipayName (String ... rightFuzzyAlipayName){
            this.rightFuzzyAlipayName = solveNullList(rightFuzzyAlipayName);
            return this;
        }

        public ConditionBuilder alipayNameList(String ... alipayName){
            this.alipayNameList = solveNullList(alipayName);
            return this;
        }

        public ConditionBuilder alipayNameList(List<String> alipayName){
            this.alipayNameList = alipayName;
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

        public ConditionBuilder fuzzyRemarkStatus (List<String> fuzzyRemarkStatus){
            this.fuzzyRemarkStatus = fuzzyRemarkStatus;
            return this;
        }

        public ConditionBuilder fuzzyRemarkStatus (String ... fuzzyRemarkStatus){
            this.fuzzyRemarkStatus = solveNullList(fuzzyRemarkStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyRemarkStatus (List<String> rightFuzzyRemarkStatus){
            this.rightFuzzyRemarkStatus = rightFuzzyRemarkStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyRemarkStatus (String ... rightFuzzyRemarkStatus){
            this.rightFuzzyRemarkStatus = solveNullList(rightFuzzyRemarkStatus);
            return this;
        }

        public ConditionBuilder remarkStatusList(String ... remarkStatus){
            this.remarkStatusList = solveNullList(remarkStatus);
            return this;
        }

        public ConditionBuilder remarkStatusList(List<String> remarkStatus){
            this.remarkStatusList = remarkStatus;
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

        private ZcCashOutRecord obj;

        public Builder(){
            this.obj = new ZcCashOutRecord();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder code(String code){
            this.obj.setCode(code);
            return this;
        }
        public Builder cashOutAmount(Long cashOutAmount){
            this.obj.setCashOutAmount(cashOutAmount);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder alipayAccount(String alipayAccount){
            this.obj.setAlipayAccount(alipayAccount);
            return this;
        }
        public Builder alipayName(String alipayName){
            this.obj.setAlipayName(alipayName);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder remarkStatus(String remarkStatus){
            this.obj.setRemarkStatus(remarkStatus);
            return this;
        }
        public ZcCashOutRecord build(){return obj;}
    }

}
