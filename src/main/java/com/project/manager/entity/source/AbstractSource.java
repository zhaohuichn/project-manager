package com.project.manager.entity.source;

/**
 * AbstractInputSource
 *
 * @author ZHAOHUI
 */
public abstract class AbstractSource implements Source {

    protected String abstractPath;

    public AbstractSource() {

    }

    public AbstractSource(String abstractPath) {
        this.abstractPath = abstractPath;
    }
}
