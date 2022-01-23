package com.project.manager.entity.source.excel;

import com.project.manager.entity.source.AbstractInputSource;
import com.project.manager.enums.SourceTypeEnum;

/**
 * 标准输出Excel文件
 * <p>
 * Excel文件由多个sheet页组成，每个sheet页支持自定义解析
 *
 * @author ZHAOHUI
 */
public class StandOutputExcel extends AbstractInputSource {

    public StandOutputExcel(String abstractPath) {
        super(abstractPath);
    }

    @Override
    public SourceTypeEnum type() {
        return SourceTypeEnum.EXCEL;
    }
}
