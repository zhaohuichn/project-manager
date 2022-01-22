package com.project.manager.entity.po.source;

import java.net.URL;

/**
 * ExcelSource
 *
 * @author ZHAOHUI
 */
public abstract class ExcelSource extends AbstractReadWriteSource{

    private String abstractPath;

    public ExcelSource(String abstractPath) {
        super(abstractPath);
    }

    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public void write() {

    }

    @Override
    public String abstractPath() {
        return null;
    }

    public String getAbstractPath() {
        return abstractPath;
    }

    public void setAbstractPath(String abstractPath) {
        this.abstractPath = abstractPath;
    }
}
