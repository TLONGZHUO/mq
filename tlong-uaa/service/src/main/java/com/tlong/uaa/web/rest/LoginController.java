package com.tlong.uaa.web.rest;

import com.tlong.api.UserApi;
import com.tlong.dto.UserDto;
import com.tlong.uaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;

@RestController
@RequestMapping("/api/user")
public class LoginController implements UserApi {

    @Autowired
    private UserService userService;


    /**
     * 测试方法
     */
    @Override
    public String test(@RequestParam String plainText) {

            String mmm = "";
            try {
                //生成实现指定摘要算法的 MessageDigest 对象。
                MessageDigest md = MessageDigest.getInstance("MD5");
                //使用指定的字节数组更新摘要。
                md.update(plainText.getBytes());
                //通过执行诸如填充之类的最终操作完成哈希计算。
                byte b[] = md.digest();
                //生成具体的md5密码到buf数组
                int i;
                StringBuffer buf = new StringBuffer("");
                for (int offset = 0; offset < b.length; offset++) {
                    i = b[offset];
                    if (i < 0)
                        i += 256;
                    if (i < 16)
                        buf.append("0");
                    buf.append(Integer.toHexString(i));
                }
                mmm = buf.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
            return mmm;
    }

    /**
     * 登录方法
     */
    @Override
    public Boolean login(UserDto userDto) {
        System.out.println("登陆方法被执行");
        return userService.login();
    }
}
