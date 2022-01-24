package com.project.manager.parse.excel;


import com.project.manager.parse.Parser;
import com.project.manager.source.excel.Excel;

import java.io.File;

/**
 * Excel解析器接口
 * <p>
 * Excel资源的解析主要是Sheet页数据的解析
 * Sheet页数据格式支持自定义，所以解析过程需要依赖于Sheet页定制的解析器
 *
 * @author ZHAOHUI
 */
public interface ExcelParser extends Parser<File, Excel> {

}
