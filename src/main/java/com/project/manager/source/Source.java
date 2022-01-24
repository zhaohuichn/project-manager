package com.project.manager.source;

import com.project.manager.enums.SourceTypeEnum;

import java.net.URL;

/**
 * Source
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
     * 资源路径
     *
     * @return abs path
     */
    String abstractPath();

    /**
     * 资源url
     *
     * @return url
     */
    URL url();

}
