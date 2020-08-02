package cn.geminiplanet.vueblog.service.impl;

import cn.geminiplanet.vueblog.entity.Blog;
import cn.geminiplanet.vueblog.mapper.BlogMapper;
import cn.geminiplanet.vueblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
