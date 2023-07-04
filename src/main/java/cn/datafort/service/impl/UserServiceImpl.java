package cn.datafort.service.impl;

import cn.datafort.mapper.UserMapper;
import cn.datafort.model.User;
import cn.datafort.service.UserService;
import com.alibaba.fastjson2.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: dxd
 * @Date: 2023/07/04
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public JSONObject login(User user) {
        JSONObject jsonObject = new JSONObject();
        User localUser = null;
        try {
            localUser = userMapper.selectUserByName(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (localUser != null && user.getPassword().equals(localUser.getPassword())){
            jsonObject.put("msg","登录成功");
            return jsonObject;
        }
        jsonObject.put("msg","登录失败");
        return jsonObject;
    }
}
