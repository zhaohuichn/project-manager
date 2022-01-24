package com.project.manager.source;

import com.project.manager.enums.SourceTypeEnum;
import com.project.manager.ext.Customizable;

import java.net.URL;

/**
 * 资源
 *
 * @author ZHAOHUI
 */
public interface Source extends Customizable {

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
