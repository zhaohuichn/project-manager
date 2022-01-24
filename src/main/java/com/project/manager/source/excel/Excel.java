package com.project.manager.source.excel;

import com.project.manager.enums.SourceTypeEnum;
import com.project.manager.source.Source;
import com.project.manager.source.excel.sheet.ExcelSheet;

import java.util.List;

/**
 * ExcelSource
 *
 * @author ZHAOHUI
 */
public interface Excel extends Source {

    @Override
    default SourceTypeEnum type() {
        return SourceTypeEnum.EXCEL;
    }

    /**
     * 获取页签
     *
     * @return sheet
     */
    List<ExcelSheet> getSheets();

    /**
     *
     * @param index
     * @return
     */
    ExcelSheet getSheet(int index);
}
