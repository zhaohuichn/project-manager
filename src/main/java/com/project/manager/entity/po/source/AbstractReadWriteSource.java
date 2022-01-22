package com.project.manager.entity.po.source;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * AbstractReadWriteSource
 *
 * @author ZHAOHUI
 */
public abstract class AbstractReadWriteSource implements InputSource, OutputSource {

    protected String abstractPath;

    public AbstractReadWriteSource(String abstractPath) {
        this.abstractPath = abstractPath;
    }

    @Override
    public URL url() {
        try {
            return new URL(this.abstractPath);
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
