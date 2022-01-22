package com.project.manager.entity.po.source;

import java.net.URL;
import java.util.List;

/**
 * Excel输入源
 *
 * @author ZHAOHUI
 */
public class InputExcelSource extends AbstractInputSource {

    private int rowNo;
    /**
     * 需求归属分组
     */
    private int group;
    /**
     * 需求分组二级分组
     */
    private int subModule;

    private String requirementNo;
    /**
     * 需求简称
     */
    private String simpleRequirementName;
    /**
     * 需求名称
     */
    private String requirementName;
    /**
     * 需求排期
     */
    private String requirementSchedule;
    /**
     * 需求参与人安排
     */
    private String memberArrangement;

    private URL documentUrl;

    private List<String> problems;

    private List<String> notes;

    public InputExcelSource(String abstractPath) {
        super(abstractPath);
    }

    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public String abstractPath() {
        return null;
    }

    @Override
    public URL url() {
        return null;
    }
}
