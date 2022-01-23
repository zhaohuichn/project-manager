package com.project.manager.entity.source.excel;

import com.project.manager.entity.source.Source;
import com.project.manager.enums.SourceTypeEnum;

/**
 * ExcelSource
 *
 * @author ZHAOHUI
 */
public interface ExcelSource extends Source {

    default SourceTypeEnum type() {
        return SourceTypeEnum.EXCEL;
    }

}
