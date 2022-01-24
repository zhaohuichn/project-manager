package com.project.manager.source.excel.sheet;

import com.project.manager.source.Source;
import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.enums.SourceTypeEnum;

import java.util.List;

/**
 * ExcelSheet
 *
 * @author ZHAOHUI
 */
public interface ExcelSheet extends Source {

    int getId();

    ExcelRow getHeader();

    List<ExcelRow> getDataRows();

    default SourceTypeEnum type() {
        return SourceTypeEnum.SHEET;
    }

}
