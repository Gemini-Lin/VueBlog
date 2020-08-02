package cn.geminiplanet.vueblog.service.impl;

import cn.geminiplanet.vueblog.entity.User;
import cn.geminiplanet.vueblog.mapper.UserMapper;
import cn.geminiplanet.vueblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Gemini-Lin
 * @since 2020-08-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
