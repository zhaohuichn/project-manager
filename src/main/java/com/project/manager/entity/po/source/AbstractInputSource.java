package com.project.manager.entity.po.source;

import org.apache.coyote.http11.filters.SavedRequestInputFilter;

/**
 * AbstractInputSource
 *
 * @author ZHAOHUI
 */
public abstract class AbstractInputSource implements InputSource {

    protected String abstractPath;

    public AbstractInputSource(String abstractPath) {
        this.abstractPath = abstractPath;
    }

}
