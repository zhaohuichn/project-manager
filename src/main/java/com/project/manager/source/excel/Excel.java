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
     * 获取页签
     *
     * @param index 索引
     * @return sheet
     */
    ExcelSheet getSheet(int index);
}
