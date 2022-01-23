package com.project.manager.entity.po.source.excel;

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
