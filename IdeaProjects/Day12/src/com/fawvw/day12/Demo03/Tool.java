package com.fawvw.day12.Demo03;

public class Tool {
    private String toolname;
    private int toolnum;

    public String getToolfunction() {
        return toolfunction;
    }

    public void setToolfunction(String toolfunction) {
        this.toolfunction = toolfunction;
    }

    public Tool(String toolfunction) {
        this.toolfunction = toolfunction;
    }

    private String toolfunction;

    public Tool() {
    }

    public Tool(String toolname, int toolnum) {
        this.toolname = toolname;
        this.toolnum = toolnum;
    }

    public String getToolname() {
        return toolname;
    }

    public void setToolname(String toolname) {
        this.toolname = toolname;
    }

    public int getToolnum() {
        return toolnum;
    }

    public void setToolnum(int toolnum) {
        this.toolnum = toolnum;
    }
}
