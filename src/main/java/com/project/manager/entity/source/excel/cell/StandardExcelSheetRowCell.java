package com.project.manager.entity.source.excel.cell;

import com.project.manager.entity.source.descriptor.Descriptor;

/**
 * StandardCell
 *
 * @author ZHAOHUI
 */
public class StandardExcelSheetRowCell implements ExcelSheetRowCell {

    private String id;

    private String name;

    private String value;

    private Descriptor descriptor;

    public String d() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
