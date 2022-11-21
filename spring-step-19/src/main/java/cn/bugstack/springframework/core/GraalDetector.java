package cn.bugstack.springframework.core;

/**
 *
 * @description
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
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
