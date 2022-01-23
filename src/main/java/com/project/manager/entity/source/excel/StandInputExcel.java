package com.project.manager.entity.source.excel;

import com.project.manager.entity.source.AbstractInputSource;
import com.project.manager.entity.source.sheet.ExcelSheet;
import com.project.manager.enums.SourceTypeEnum;

import java.util.List;

/**
 * 标准输入Excel文件
 * <p>
 * Excel文件由多个sheet页组成，每个sheet页支持自定义解析
 *
 * @author ZHAOHUI
 */
public class StandInputExcel extends AbstractInputSource implements ExcelSheet {

    private List<ExcelSheet> sheets;

    public StandInputExcel(String abstractPath) {
        super(abstractPath);
    }

    @Override
    public SourceTypeEnum type() {
        return null;
    }
}
