package cn.bugstack.springframework.core.convert;

/**
 *
 * @description 类型转换抽象接口
 * @date 2022/3/16
 *
 *
 */
public interface ConversionService {

    /** Return {@code true} if objects of {@code sourceType} can be converted to the {@code targetType}. */
    boolean canConvert(Class<?> sourceType, Class<?> targetType);

    /** Convert the given {@code source} to the specified {@code targetType}. */
    <T> T convert(Object source, Class<T> targetType);

}
