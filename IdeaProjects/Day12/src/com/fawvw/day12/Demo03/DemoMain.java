package com.fawvw.day12.Demo03;

public class DemoMain {
    public static void main(String[] args) {
        User user = new User();
        user.setName("电器");
        user.setId(0001);

        Tool tool = new Tool("查询统计");
        user.setTool(tool);
        tool.setToolname("Prodis control");
        //tool.setToolfunction("查询统计哈");
        user.work();

        //System.out.println(user.getName()+"用"+tool.getToolname()+tool.getToolfunction());
    }
}
