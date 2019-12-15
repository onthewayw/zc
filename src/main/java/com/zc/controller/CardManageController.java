package com.zc.controller;

import com.github.pagehelper.PageInfo;
import com.zc.bean.ZcCardManage;
import com.zc.bean.ZcUser;
import com.zc.constant.StatusEnum;
import com.zc.constant.WebUserConstant;
import com.zc.service.ZcCardManageService;
import com.zc.utils.RedisTokenOper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cardManage")
public class CardManageController {
    private static final Logger logger = LoggerFactory.getLogger(CardManageController.class);

    @Autowired(required = false)
    private ZcCardManageService zcCardManageService;

    @Autowired(required = false)
    private HttpServletRequest request;

    @Autowired(required = false)
    private RedisTokenOper redisTokenOper;

    /**
     * 获取三种总数
     * */


    /**
     * 批量充值
     */
    @RequestMapping("/batchRecharge")
    public Map<String, Object> batchRecharge(ZcCardManage cardManage) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器错误");
        try {
            if (null != cardManage.getBeginIccid() && null != cardManage.getEndIccid()) {
                if (cardManage.getEndIccid() - cardManage.getBeginIccid() > WebUserConstant.FIVEHUNDRED) {
                    returnObject.put("code", WebUserConstant.STATUBIGERROR);
                    returnObject.put("message", "超过500");
                    return returnObject;
                }
            } else {
                returnObject.put("code", WebUserConstant.STATUICCICNOERROR);
                returnObject.put("message", "iccid为空");
                return returnObject;
            }
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                cardManage.setUserId(zcUser.getId());
                List<ZcCardManage> zcCardManages = zcCardManageService.queryZcCardManage(cardManage);
                if (null != zcCardManages && zcCardManages.size() > 0) {
                    List<ZcCardManage> collect = zcCardManages.stream().filter(c -> c.getType().equals(zcCardManages.get(0).getType())).collect(Collectors.toList());
                    if (collect.size() == 0) {
                        returnObject.put("code", WebUserConstant.STATUNOERROR);
                        returnObject.put("message", "查询不到数据");
                        return returnObject;
                    }
                    logger.info("批量充值----" + zcCardManages.size());
                    returnObject.put("recordNum", cardManage.getEndIccid() - cardManage.getBeginIccid());
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    returnObject.put("message", "请求成功");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 批量划卡
     */
    @RequestMapping("/batchStrokeCard")
    public Map<String, Object> batchStrokeCard(ZcCardManage cardManage) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器错误");
        try {
            if (null != cardManage.getBeginIccid() && null != cardManage.getEndIccid()) {
                if (cardManage.getEndIccid() - cardManage.getBeginIccid() > WebUserConstant.FIVEHUNDRED) {
                    returnObject.put("code", WebUserConstant.STATUBIGERROR);
                    returnObject.put("message", "超过500");
                    return returnObject;
                }
            } else {
                returnObject.put("code", WebUserConstant.STATUICCICNOERROR);
                returnObject.put("message", "iccid为空");
                return returnObject;
            }
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                cardManage.setUserId(zcUser.getId());
                List<ZcCardManage> zcCardManages = zcCardManageService.queryZcCardManage(cardManage);
                if (null != zcCardManages && zcCardManages.size() > 0) {
                    List<ZcCardManage> collect = zcCardManages.stream().filter(c -> c.getType().equals(zcCardManages.get(0).getType())).collect(Collectors.toList());
                    if (collect.size() == 0) {
                        returnObject.put("code", WebUserConstant.STATUNOERROR);
                        returnObject.put("message", "查询不到数据");
                        return returnObject;
                    }
                    logger.info("批量划卡----" + zcCardManages.size());
                    returnObject.put("recordNum", cardManage.getEndIccid() - cardManage.getBeginIccid());
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    returnObject.put("message", "请求成功");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 分页查询
     */
    @RequestMapping("/queryByPage")
    public Map<String, Object> queryByPage(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size, ZcCardManage cardManage) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器错误");
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                cardManage.setUserId(zcUser.getId());
                PageInfo<ZcCardManage> zcCardManagePageInfo = zcCardManageService.queryByPage(page, size, cardManage);
                returnObject.put("data", zcCardManagePageInfo);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                returnObject.put("message", "请求成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 新增记录
     */
    @RequestMapping("/add")
    public Map<String, Object> addRecord(ZcCardManage zcCardManage) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器错误");
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                zcCardManage.setUserId(zcUser.getId());
                Long id = zcCardManageService.insertZcCardManage(zcCardManage);
                if (null != id) {
                    returnObject.put("id", id);
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    returnObject.put("message", "请求成功");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 更新信息
     */
    @PostMapping("/update")
    public Map<String, Object> updateRecord(ZcCardManage zcCardManage) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器错误");
        try {
            String token = request.getHeader(WebUserConstant.TOKENAUTHORIZATION);
            ZcUser zcUser = redisTokenOper.getInfo(token, WebUserConstant.SESSIONUSERINFO, ZcUser.class);
            if (null != zcUser) {
                int i = zcCardManageService.updateZcCardManage(zcCardManage);
                if (i != 0) {
                    returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                    returnObject.put("message", "请求成功");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }

    /**
     * 通过iccid 只有一条
     */
    @GetMapping("/queryByIccid")
    public Map<String, Object> queryByIccid(String iccid) {
        Map<String, Object> returnObject = new HashMap<>();
        returnObject.put("code", WebUserConstant.STATUSERROR);
        returnObject.put("message", "服务器错误");
        try {
            if (!StringUtils.isEmpty(iccid)) {
                ZcCardManage zcCardManage = zcCardManageService.queryByIccid(iccid);
                returnObject.put("code", WebUserConstant.STATUSSUCCESS);
                returnObject.put("data", zcCardManage);
                returnObject.put("message", "请求成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnObject;
    }
}
