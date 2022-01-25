package com.project.manager.enums;

/**
 * ExcelColumnMap
 *
 * @author ZHAOHUI
 */
public enum TodoDailyExcelColumnMap {
    /**
     * all
     */
    MEMBER(TodoExcelColumnEnum.MEMBER, DailyExcelColumnEnum.MEMBER),
    MODULE(TodoExcelColumnEnum.MODULE, DailyExcelColumnEnum.MODULE),
    REQUIREMENT(TodoExcelColumnEnum.REQUIREMENT, DailyExcelColumnEnum.REQUIREMENT_NAME),
    DOC_URL(TodoExcelColumnEnum.DOCUMENT_URL, DailyExcelColumnEnum.DOCUMENT_URL),
    TODO_TYPE(TodoExcelColumnEnum.TODO_TYPE, DailyExcelColumnEnum.REQUIREMENT_STATUS),
    TODO_CONTENT(TodoExcelColumnEnum.TODO_CONTENT, DailyExcelColumnEnum.REQUIREMENT_STATUS),

    ;

    private DailyExcelColumnEnum dailyColumn;

    private TodoExcelColumnEnum todoColumn;

    TodoDailyExcelColumnMap(TodoExcelColumnEnum todoColumn, DailyExcelColumnEnum dailyColumn) {
        this.dailyColumn = dailyColumn;
        this.todoColumn = todoColumn;
    }

    public DailyExcelColumnEnum getDailyColumn() {
        return dailyColumn;
    }

    public void setDailyColumn(DailyExcelColumnEnum dailyColumn) {
        this.dailyColumn = dailyColumn;
    }

    public TodoExcelColumnEnum getTodoColumn() {
        return todoColumn;
    }

    public void setTodoColumn(TodoExcelColumnEnum todoColumn) {
        this.todoColumn = todoColumn;
    }
}
