package cn.bugstack.springframework.core;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public abstract class GraalDetector {

    // See https://github.com/oracle/graal/blob/master/sdk/src/org.graalvm.nativeimage/src/org/graalvm/nativeimage/ImageInfo.java
    private static final boolean imageCode = (System.getProperty("org.graalvm.nativeimage.imagecode") != null);

    /**
     * Return whether this runtime environment lives within a native image.
     */
    public static boolean inImageCode() {
        return imageCode;
    }

}
