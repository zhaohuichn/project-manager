package com.project.manager.entity.source.excel.sheet;

import com.project.manager.entity.source.Source;
import com.project.manager.enums.SourceTypeEnum;

/**
 * ExcelSheet
 *
 * @author ZHAOHUI
 */
public interface ExcelSheet extends Source {

    default SourceTypeEnum type() {
        return SourceTypeEnum.SHEET;
    }

}
