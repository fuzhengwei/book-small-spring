package cn.bugstack.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 小傅哥，微信：fustack
 * @description 资源处理接口
 * @date 2022/3/9
 * @github https://github.com/fuzhengwei
 * @copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
