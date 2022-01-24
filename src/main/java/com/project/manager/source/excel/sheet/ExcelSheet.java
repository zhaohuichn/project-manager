package com.project.manager.source.excel.sheet;

import com.project.manager.enums.SourceTypeEnum;
import com.project.manager.source.excel.row.ExcelRow;

import java.util.List;

/**
 * ExcelSheet
 *
 * @author ZHAOHUI
 */
public interface ExcelSheet {

    Integer getId();

    Integer getIndex();

    ExcelRow getHeader();

    List<ExcelRow> getDataRows();

    default SourceTypeEnum type() {
        return SourceTypeEnum.SHEET;
    }

}
