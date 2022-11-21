package cn.bugstack.springframework.core.convert.converter;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description 类型转换工厂
 * @date 2022/3/16
 *
 *
 */
public interface ConverterFactory<S, R>{

    /**
     * Get the converter to convert from S to target type T, where T is also an instance of R.
     * @param <T> the target type
     * @param targetType the target type to convert to
     * @return a converter from S to T
     */
    <T extends R> Converter<S, T> getConverter(Class<T> targetType);

}
