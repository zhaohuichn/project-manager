package com.project.manager.entity.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * ExcelDataVo
 *
 * @author ZHAOHUI
 */
public class ExcelSheetData implements Serializable {

    private String url;

    /**
     * 列名键值对
     * key-列索引
     * value-列名
     */
    private Map<Integer, String> cellNameMap;
    /**
     * 列名键值对
     * key-列索引
     * value-列数据
     */
    private Map<Integer, Map<Integer, String>> cellValueMap;

    public Map<Integer, String> getCellNameMap() {
        return cellNameMap;
    }

    public void setCellNameMap(Map<Integer, String> cellNameMap) {
        this.cellNameMap = cellNameMap;
    }

    public Map<Integer, Map<Integer, String>> getCellValueMap() {
        return cellValueMap;
    }

    public void setCellValueMap(Map<Integer, Map<Integer, String>> cellValueMap) {
        this.cellValueMap = cellValueMap;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
