package com.project.manager.source;

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
