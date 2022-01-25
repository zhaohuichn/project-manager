package com.project.manager.builder;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.project.manager.source.descriptor.StandardExcelCellDescriptor;
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
        sheet.setHeader(buildSheetHeader(sheet));
        sheet.setDataRows(buildSheetDataRows(sheet));
        List<ExcelRow> rows = Lists.newArrayList();

        rows.addAll(sheet.getDataRows());
        rows.add(sheet.getHeader());
        sheet.setRows(rows);
    }

    private List<ExcelRow> buildSheetDataRows(StandardSheet sheet) {
        List<ExcelRow> excelRows = Lists.newArrayList();

        // add data row
        ExcelSheet srcExcelSheet = srcExcel.getSheet(0);
        for (ExcelRow srcRow : srcExcelSheet.getDataRows()) {
            StandardRow todoRow = new StandardRow();

            int rowNum = srcRow.getRowNo();
            todoRow.setRowNo(rowNum);
            todoRow.setSheet(sheet);
            todoRow.setHeader(false);
            buildCells(todoRow);

            excelRows.add(todoRow);
        }
        return excelRows;
    }

    /**
     * 自定义表头
     *
     * @param sheet 页签
     * @return row
     */
    private ExcelRow buildSheetHeader(ExcelSheet sheet) {
        StandardRow row = new StandardRow();

        row.setRowNo(0);
        row.setSheet(sheet);
        row.setHeader(true);
        buildCells(row);

        return row;
    }

    /**
     * 构建行列
     *
     * @param toRow
     * @return
     */
    private List<ExcelCell> buildCells(ExcelRow toRow) {
        List<ExcelCell> cells = Lists.newArrayList();
        for (Map.Entry<Integer, String> entry : COLUMN_INDEX_NAME_MAP.entrySet()) {
            StandardExcelCell cell = new StandardExcelCell();
            cell.setColumnNo(entry.getKey());
            cell.setExcelRow(toRow);
            cell.setValue(entry.getValue());
            cell.setDescriptor(new StandardExcelCellDescriptor());

            cells.add(cell);
        }
        return cells;
    }

    private Excel obtainExcel() {
        return new StandardExcel();
    }

}
