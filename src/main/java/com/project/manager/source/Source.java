package com.project.manager.source;

import com.project.manager.enums.SourceTypeEnum;

import java.net.URL;

/**
 * 资源
 *
 * @author ZHAOHUI
 */
public interface Source {

    /**
     * 资源类型
     *
     * @return SourceTypeEnum
     */
    SourceTypeEnum type();

    /**
     * 资源名称
     *
     * @return name
     */
    String name();

    /**
     * 资源url
     *
     * @return url
     */
    URL url();

}
