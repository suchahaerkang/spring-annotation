package com.wolfx.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-05 15:44
 */
public class MyImportSelector implements ImportSelector {

    /**
     * @description:
     * @param importingClassMetadata 当前注解@Import标注的类上面的全部注解信息
     * @return: java.lang.String[]
     * @author: sukang
     * @date: 2020/3/5 15:45
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String[] str = new String[]{"com.wolfx.bean.Blue","com.wolfx.bean.Yellow"};
        return str;
    }
}
