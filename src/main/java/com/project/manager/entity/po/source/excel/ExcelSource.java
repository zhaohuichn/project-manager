package com.project.manager.entity.po.source.excel;

import com.project.manager.entity.po.source.AbstractReadWriteSource;

/**
 * ExcelSource
 *
 * @author ZHAOHUI
 */
public abstract class ExcelSource extends AbstractReadWriteSource {

    private String abstractPath;

    public ExcelSource(String abstractPath) {
        super(abstractPath);
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
