package cn.bugstack.springframework.core.convert.converter;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description 类型转换处理接口
 * @date 2022/3/16
 *
 *
 */
public interface Converter<S, T>  {

    /** Convert the source object of type {@code S} to target type {@code T}. */
    T convert(S source);

}
