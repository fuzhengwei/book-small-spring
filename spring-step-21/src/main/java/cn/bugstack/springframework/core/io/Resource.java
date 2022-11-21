package cn.bugstack.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @description 资源处理接口
 * @date 2022/3/9
 *
 *
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
