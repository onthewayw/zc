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
public class ZcApi implements Serializable {

    private static final long serialVersionUID = 1573053152747L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * api名称
    * isNullAble:1
    */
    private String apiName;

    /**
    * 有效期
    * isNullAble:1
    */
    private java.time.LocalDateTime endTime;

    /**
    * 成本 价格 （用的话除100）
    * isNullAble:1
    */
    private Long costPrice;

    /**
    * 代理成本价格  （应除100）
    * isNullAble:1
    */
    private Long agentCostPrice;

    /**
    * 终端价格  （应除100）
    * isNullAble:1
    */
    private Long terminalPrice;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setApiName(String apiName){this.apiName = apiName;}

    public String getApiName(){return this.apiName;}

    public void setEndTime(java.time.LocalDateTime endTime){this.endTime = endTime;}

    public java.time.LocalDateTime getEndTime(){return this.endTime;}

    public void setCostPrice(Long costPrice){this.costPrice = costPrice;}

    public Long getCostPrice(){return this.costPrice;}

    public void setAgentCostPrice(Long agentCostPrice){this.agentCostPrice = agentCostPrice;}

    public Long getAgentCostPrice(){return this.agentCostPrice;}

    public void setTerminalPrice(Long terminalPrice){this.terminalPrice = terminalPrice;}

    public Long getTerminalPrice(){return this.terminalPrice;}
    @Override
    public String toString() {
        return "ZcApi{" +
                "id='" + id + '\'' +
                "apiName='" + apiName + '\'' +
                "endTime='" + endTime + '\'' +
                "costPrice='" + costPrice + '\'' +
                "agentCostPrice='" + agentCostPrice + '\'' +
                "terminalPrice='" + terminalPrice + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ZcApi set;

        private ConditionBuilder where;

        public UpdateBuilder set(ZcApi set){
            this.set = set;
            return this;
        }

        public ZcApi getSet(){
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

    public static class QueryBuilder extends ZcApi{
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

        private List<String> apiNameList;

        public List<String> getApiNameList(){return this.apiNameList;}


        private List<String> fuzzyApiName;

        public List<String> getFuzzyApiName(){return this.fuzzyApiName;}

        private List<String> rightFuzzyApiName;

        public List<String> getRightFuzzyApiName(){return this.rightFuzzyApiName;}
        private List<java.time.LocalDateTime> endTimeList;

        public List<java.time.LocalDateTime> getEndTimeList(){return this.endTimeList;}

        private java.time.LocalDateTime endTimeSt;

        private java.time.LocalDateTime endTimeEd;

        public java.time.LocalDateTime getEndTimeSt(){return this.endTimeSt;}

        public java.time.LocalDateTime getEndTimeEd(){return this.endTimeEd;}

        private List<Long> costPriceList;

        public List<Long> getCostPriceList(){return this.costPriceList;}

        private Long costPriceSt;

        private Long costPriceEd;

        public Long getCostPriceSt(){return this.costPriceSt;}

        public Long getCostPriceEd(){return this.costPriceEd;}

        private List<Long> agentCostPriceList;

        public List<Long> getAgentCostPriceList(){return this.agentCostPriceList;}

        private Long agentCostPriceSt;

        private Long agentCostPriceEd;

        public Long getAgentCostPriceSt(){return this.agentCostPriceSt;}

        public Long getAgentCostPriceEd(){return this.agentCostPriceEd;}

        private List<Long> terminalPriceList;

        public List<Long> getTerminalPriceList(){return this.terminalPriceList;}

        private Long terminalPriceSt;

        private Long terminalPriceEd;

        public Long getTerminalPriceSt(){return this.terminalPriceSt;}

        public Long getTerminalPriceEd(){return this.terminalPriceEd;}

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

        public QueryBuilder endTimeBetWeen(java.time.LocalDateTime endTimeSt,java.time.LocalDateTime endTimeEd){
            this.endTimeSt = endTimeSt;
            this.endTimeEd = endTimeEd;
            return this;
        }

        public QueryBuilder endTimeGreaterEqThan(java.time.LocalDateTime endTimeSt){
            this.endTimeSt = endTimeSt;
            return this;
        }
        public QueryBuilder endTimeLessEqThan(java.time.LocalDateTime endTimeEd){
            this.endTimeEd = endTimeEd;
            return this;
        }


        public QueryBuilder endTime(java.time.LocalDateTime endTime){
            setEndTime(endTime);
            return this;
        }

        public QueryBuilder endTimeList(java.time.LocalDateTime ... endTime){
            this.endTimeList = solveNullList(endTime);
            return this;
        }

        public QueryBuilder endTimeList(List<java.time.LocalDateTime> endTime){
            this.endTimeList = endTime;
            return this;
        }

        public QueryBuilder fetchEndTime(){
            setFetchFields("fetchFields","endTime");
            return this;
        }

        public QueryBuilder excludeEndTime(){
            setFetchFields("excludeFields","endTime");
            return this;
        }

        public QueryBuilder costPriceBetWeen(Long costPriceSt,Long costPriceEd){
            this.costPriceSt = costPriceSt;
            this.costPriceEd = costPriceEd;
            return this;
        }

        public QueryBuilder costPriceGreaterEqThan(Long costPriceSt){
            this.costPriceSt = costPriceSt;
            return this;
        }
        public QueryBuilder costPriceLessEqThan(Long costPriceEd){
            this.costPriceEd = costPriceEd;
            return this;
        }


        public QueryBuilder costPrice(Long costPrice){
            setCostPrice(costPrice);
            return this;
        }

        public QueryBuilder costPriceList(Long ... costPrice){
            this.costPriceList = solveNullList(costPrice);
            return this;
        }

        public QueryBuilder costPriceList(List<Long> costPrice){
            this.costPriceList = costPrice;
            return this;
        }

        public QueryBuilder fetchCostPrice(){
            setFetchFields("fetchFields","costPrice");
            return this;
        }

        public QueryBuilder excludeCostPrice(){
            setFetchFields("excludeFields","costPrice");
            return this;
        }

        public QueryBuilder agentCostPriceBetWeen(Long agentCostPriceSt,Long agentCostPriceEd){
            this.agentCostPriceSt = agentCostPriceSt;
            this.agentCostPriceEd = agentCostPriceEd;
            return this;
        }

        public QueryBuilder agentCostPriceGreaterEqThan(Long agentCostPriceSt){
            this.agentCostPriceSt = agentCostPriceSt;
            return this;
        }
        public QueryBuilder agentCostPriceLessEqThan(Long agentCostPriceEd){
            this.agentCostPriceEd = agentCostPriceEd;
            return this;
        }


        public QueryBuilder agentCostPrice(Long agentCostPrice){
            setAgentCostPrice(agentCostPrice);
            return this;
        }

        public QueryBuilder agentCostPriceList(Long ... agentCostPrice){
            this.agentCostPriceList = solveNullList(agentCostPrice);
            return this;
        }

        public QueryBuilder agentCostPriceList(List<Long> agentCostPrice){
            this.agentCostPriceList = agentCostPrice;
            return this;
        }

        public QueryBuilder fetchAgentCostPrice(){
            setFetchFields("fetchFields","agentCostPrice");
            return this;
        }

        public QueryBuilder excludeAgentCostPrice(){
            setFetchFields("excludeFields","agentCostPrice");
            return this;
        }

        public QueryBuilder terminalPriceBetWeen(Long terminalPriceSt,Long terminalPriceEd){
            this.terminalPriceSt = terminalPriceSt;
            this.terminalPriceEd = terminalPriceEd;
            return this;
        }

        public QueryBuilder terminalPriceGreaterEqThan(Long terminalPriceSt){
            this.terminalPriceSt = terminalPriceSt;
            return this;
        }
        public QueryBuilder terminalPriceLessEqThan(Long terminalPriceEd){
            this.terminalPriceEd = terminalPriceEd;
            return this;
        }


        public QueryBuilder terminalPrice(Long terminalPrice){
            setTerminalPrice(terminalPrice);
            return this;
        }

        public QueryBuilder terminalPriceList(Long ... terminalPrice){
            this.terminalPriceList = solveNullList(terminalPrice);
            return this;
        }

        public QueryBuilder terminalPriceList(List<Long> terminalPrice){
            this.terminalPriceList = terminalPrice;
            return this;
        }

        public QueryBuilder fetchTerminalPrice(){
            setFetchFields("fetchFields","terminalPrice");
            return this;
        }

        public QueryBuilder excludeTerminalPrice(){
            setFetchFields("excludeFields","terminalPrice");
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

        public ZcApi build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> apiNameList;

        public List<String> getApiNameList(){return this.apiNameList;}


        private List<String> fuzzyApiName;

        public List<String> getFuzzyApiName(){return this.fuzzyApiName;}

        private List<String> rightFuzzyApiName;

        public List<String> getRightFuzzyApiName(){return this.rightFuzzyApiName;}
        private List<java.time.LocalDateTime> endTimeList;

        public List<java.time.LocalDateTime> getEndTimeList(){return this.endTimeList;}

        private java.time.LocalDateTime endTimeSt;

        private java.time.LocalDateTime endTimeEd;

        public java.time.LocalDateTime getEndTimeSt(){return this.endTimeSt;}

        public java.time.LocalDateTime getEndTimeEd(){return this.endTimeEd;}

        private List<Long> costPriceList;

        public List<Long> getCostPriceList(){return this.costPriceList;}

        private Long costPriceSt;

        private Long costPriceEd;

        public Long getCostPriceSt(){return this.costPriceSt;}

        public Long getCostPriceEd(){return this.costPriceEd;}

        private List<Long> agentCostPriceList;

        public List<Long> getAgentCostPriceList(){return this.agentCostPriceList;}

        private Long agentCostPriceSt;

        private Long agentCostPriceEd;

        public Long getAgentCostPriceSt(){return this.agentCostPriceSt;}

        public Long getAgentCostPriceEd(){return this.agentCostPriceEd;}

        private List<Long> terminalPriceList;

        public List<Long> getTerminalPriceList(){return this.terminalPriceList;}

        private Long terminalPriceSt;

        private Long terminalPriceEd;

        public Long getTerminalPriceSt(){return this.terminalPriceSt;}

        public Long getTerminalPriceEd(){return this.terminalPriceEd;}


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

        public ConditionBuilder endTimeBetWeen(java.time.LocalDateTime endTimeSt,java.time.LocalDateTime endTimeEd){
            this.endTimeSt = endTimeSt;
            this.endTimeEd = endTimeEd;
            return this;
        }

        public ConditionBuilder endTimeGreaterEqThan(java.time.LocalDateTime endTimeSt){
            this.endTimeSt = endTimeSt;
            return this;
        }
        public ConditionBuilder endTimeLessEqThan(java.time.LocalDateTime endTimeEd){
            this.endTimeEd = endTimeEd;
            return this;
        }


        public ConditionBuilder endTimeList(java.time.LocalDateTime ... endTime){
            this.endTimeList = solveNullList(endTime);
            return this;
        }

        public ConditionBuilder endTimeList(List<java.time.LocalDateTime> endTime){
            this.endTimeList = endTime;
            return this;
        }

        public ConditionBuilder costPriceBetWeen(Long costPriceSt,Long costPriceEd){
            this.costPriceSt = costPriceSt;
            this.costPriceEd = costPriceEd;
            return this;
        }

        public ConditionBuilder costPriceGreaterEqThan(Long costPriceSt){
            this.costPriceSt = costPriceSt;
            return this;
        }
        public ConditionBuilder costPriceLessEqThan(Long costPriceEd){
            this.costPriceEd = costPriceEd;
            return this;
        }


        public ConditionBuilder costPriceList(Long ... costPrice){
            this.costPriceList = solveNullList(costPrice);
            return this;
        }

        public ConditionBuilder costPriceList(List<Long> costPrice){
            this.costPriceList = costPrice;
            return this;
        }

        public ConditionBuilder agentCostPriceBetWeen(Long agentCostPriceSt,Long agentCostPriceEd){
            this.agentCostPriceSt = agentCostPriceSt;
            this.agentCostPriceEd = agentCostPriceEd;
            return this;
        }

        public ConditionBuilder agentCostPriceGreaterEqThan(Long agentCostPriceSt){
            this.agentCostPriceSt = agentCostPriceSt;
            return this;
        }
        public ConditionBuilder agentCostPriceLessEqThan(Long agentCostPriceEd){
            this.agentCostPriceEd = agentCostPriceEd;
            return this;
        }


        public ConditionBuilder agentCostPriceList(Long ... agentCostPrice){
            this.agentCostPriceList = solveNullList(agentCostPrice);
            return this;
        }

        public ConditionBuilder agentCostPriceList(List<Long> agentCostPrice){
            this.agentCostPriceList = agentCostPrice;
            return this;
        }

        public ConditionBuilder terminalPriceBetWeen(Long terminalPriceSt,Long terminalPriceEd){
            this.terminalPriceSt = terminalPriceSt;
            this.terminalPriceEd = terminalPriceEd;
            return this;
        }

        public ConditionBuilder terminalPriceGreaterEqThan(Long terminalPriceSt){
            this.terminalPriceSt = terminalPriceSt;
            return this;
        }
        public ConditionBuilder terminalPriceLessEqThan(Long terminalPriceEd){
            this.terminalPriceEd = terminalPriceEd;
            return this;
        }


        public ConditionBuilder terminalPriceList(Long ... terminalPrice){
            this.terminalPriceList = solveNullList(terminalPrice);
            return this;
        }

        public ConditionBuilder terminalPriceList(List<Long> terminalPrice){
            this.terminalPriceList = terminalPrice;
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

        private ZcApi obj;

        public Builder(){
            this.obj = new ZcApi();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder apiName(String apiName){
            this.obj.setApiName(apiName);
            return this;
        }
        public Builder endTime(java.time.LocalDateTime endTime){
            this.obj.setEndTime(endTime);
            return this;
        }
        public Builder costPrice(Long costPrice){
            this.obj.setCostPrice(costPrice);
            return this;
        }
        public Builder agentCostPrice(Long agentCostPrice){
            this.obj.setAgentCostPrice(agentCostPrice);
            return this;
        }
        public Builder terminalPrice(Long terminalPrice){
            this.obj.setTerminalPrice(terminalPrice);
            return this;
        }
        public ZcApi build(){return obj;}
    }

}
