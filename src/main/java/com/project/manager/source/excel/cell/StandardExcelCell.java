package com.project.manager.source.excel.cell;

import com.project.manager.source.descriptor.Descriptor;

/**
 * StandardCell
 *
 * @author ZHAOHUI
 */
public class StandardExcelCell implements ExcelCell {

    private int id;

    private int index;

    private String value;

    private Descriptor descriptor;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Descriptor getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }
}
