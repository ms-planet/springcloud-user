package com.imooc.user.utils;


import com.imooc.user.enums.ResultEnum;
import com.imooc.user.vo.ResultVO;

/**
 * @author zxlei
 * @date 2019/8/21 14:33
 * ----------------------------------------------
 * TODO
 * ----------------------------------------------
 */
public class ResultVOUtil {

    public static ResultVO success(Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMessage("success");
        resultVO.setData(data);
        return resultVO;
    }

    public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMessage("success");
        return resultVO;
    }

    public static ResultVO error(ResultEnum resultEnum) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMessage(resultEnum.getMessage());
        return resultVO;
    }

}
