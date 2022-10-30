package cn.bugstack.springframework.core.convert.converter;

/**
 * @author 小傅哥，微信：fustack
 * @description 类型转换处理接口
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei
 * @copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface Converter<S, T>  {

    /** Convert the source object of type {@code S} to target type {@code T}. */
    T convert(S source);

}
