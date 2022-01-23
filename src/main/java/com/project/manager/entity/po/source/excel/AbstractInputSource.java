package com.project.manager.entity.po.source.excel;

import java.net.MalformedURLException;
import java.net.URL;

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

    @Override
    public String abstractPath() {
        return this.abstractPath;
    }

    @Override
    public URL url() {
        try {
            return new URL(this.abstractPath);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
