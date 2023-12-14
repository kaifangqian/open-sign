package com.resrun.controller.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: SignResponse
 * @Package: com.resrun.controller.vo.response
 * @ClassName: SignResponse
 * @copyright 北京资源律动科技有限公司
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("文件签署-返回对象")
public class SignResponse implements Serializable {

    private static final long serialVersionUID = 7191345743000212815L;

    @ApiModelProperty("签署后文件")
    private String signFile ;
}