package com.project.manager.entity.source.excel;

import com.project.manager.entity.source.Source;
import com.project.manager.entity.source.excel.sheet.ExcelSheet;
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
