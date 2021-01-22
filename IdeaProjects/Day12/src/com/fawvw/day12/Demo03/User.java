package com.fawvw.day12.Demo03;

public class User {
    private String name;
    private int id;
    private Tool tool;

    public User(String name, int id, Tool tool) {
        this.name = name;
        this.id = id;
        this.tool = tool;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
    public void work(){
        System.out.println(name +"用"+tool.getToolname()+tool.getToolfunction());
    }
}
