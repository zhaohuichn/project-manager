package com.project.manager.source.excel;

import com.project.manager.source.Source;
import com.project.manager.source.excel.sheet.ExcelSheet;
import com.project.manager.enums.SourceTypeEnum;

import java.util.List;

/**
 * ExcelSource
 *
 * @author ZHAOHUI
 */
public interface Excel extends Source {

    default SourceTypeEnum type() {
        return SourceTypeEnum.EXCEL;
    }

    List<ExcelSheet> getSheets();
}
