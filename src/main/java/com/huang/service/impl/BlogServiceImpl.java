package com.huang.service.impl;

import com.huang.entity.Blog;
import com.huang.mapper.BlogMapper;
import com.huang.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 深林中的书海
 * @since 2021-07-27
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
