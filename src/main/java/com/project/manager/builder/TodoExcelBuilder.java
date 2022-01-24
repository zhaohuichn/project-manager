package com.project.manager.builder;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.project.manager.source.descriptor.Descriptor;
import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.StandardExcel;
import com.project.manager.source.excel.cell.ExcelCell;
import com.project.manager.source.excel.cell.StandardExcelCell;
import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.source.excel.row.StandardRow;
import com.project.manager.source.excel.sheet.ExcelSheet;
import com.project.manager.source.excel.sheet.StandardSheet;

import java.util.List;
import java.util.Map;

/**
 * TodoExcelBuilder
 *
 * @author zhaohui
 */
public class TodoExcelBuilder implements Builder<Excel> {

    private static final Map<Integer, String> COLUMN_INDEX_NAME_MAP = Maps.newHashMap();

    static {
        COLUMN_INDEX_NAME_MAP.put(0, "经办人");
        COLUMN_INDEX_NAME_MAP.put(1, "所属模块");
        COLUMN_INDEX_NAME_MAP.put(2, "需求名称");
        COLUMN_INDEX_NAME_MAP.put(3, "Jira链接");
        COLUMN_INDEX_NAME_MAP.put(4, "待办类型");
        COLUMN_INDEX_NAME_MAP.put(5, "待办事项");
    }


    private Excel srcExcel;

    public TodoExcelBuilder(Excel src) {
        this.srcExcel = src;
    }

    @Override
    public Excel build() {
        Excel excel = obtainExcel();

        buildSheet(excel);

        return null;
    }

    private void buildSheet(Excel excel) {
        StandardSheet sheet = new StandardSheet();
        sheet.setExcel(excel);
        sheet.setIndex(0);
        sheet.setName("今日待办");
        setSheetRows(sheet);

        sheet.setColumnIndexNameMap(COLUMN_INDEX_NAME_MAP);
    }

    private void setSheetRows(StandardSheet sheet) {

    }

    private List<ExcelRow> buildSheetRows(StandardSheet sheet) {
        ExcelSheet srcExcelSheet = srcExcel.getSheet(0);

        List<ExcelRow> excelRows = Lists.newArrayList();

        // add header
        ExcelRow header = buildSheetHeader(sheet);
        excelRows.add(header);

        // add data row
        for (ExcelRow srcRow : srcExcelSheet.getDataRows()) {
            StandardRow todoRow = new StandardRow();

            int rowNum = srcRow.getRowNo();
            todoRow.setRowNo(rowNum);
            todoRow.setSheet(sheet);
            todoRow.setHeader(false);
            setRowCells(todoRow);

            excelRows.add(todoRow);
        }
        return excelRows;
    }

    private ExcelRow buildSheetHeader(ExcelSheet sheet) {
        StandardRow row = new StandardRow();

        row.setRowNo(0);
        row.setSheet(sheet);
        row.setHeader(true);
        setRowCells(row);

        return null;
    }

    private void setRowCells(ExcelRow toRow) {


    }


    private List<ExcelCell> buildCells(ExcelRow toRow) {

        protected ExcelRow excelRow;

        protected int columnNo;

        private String value;

        private Descriptor descriptor;

        StandardExcelCell cell = new StandardExcelCell();
        cell.setExcelRow(toRow);


        for (Map.Entry<Integer, String> entry : COLUMN_INDEX_NAME_MAP.entrySet()) {
            Integer cellNo = entry.getKey();
            ExcelCellValueBuilder
        }

    }

    private Excel obtainExcel() {
        return new StandardExcel();
    }

}
