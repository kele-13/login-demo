package cn.datafort.service;

import cn.datafort.model.User;
import com.alibaba.fastjson2.JSONObject;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dxd
 * @Date: 2023/07/04
 * @Description:
 */
public interface UserService {

    JSONObject login(User user);
}
