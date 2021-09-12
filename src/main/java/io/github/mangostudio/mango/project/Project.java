package io.github.mangostudio.mango.project;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Project {

    private String project_num;     //数字
    private String project_logo;    //图片路径
    private String project_name;    //名字
    private String project_Path;    //图片路径

    public String getProjectNum() {
        return project_num;
    }


    public void setProjectNum(String project_num) {
        this.project_num = project_num;
    }


    public String getProjectLogo() {
        return project_logo;
    }


    public void setProjectLogo(String project_logo) {
        this.project_logo = project_logo;
    }


    public String getProjectName() {
        return project_name;
    }


    public void setProjectName(String project_name) {
        this.project_name = project_name;
    }


    public String getProjectPath() {
        return project_Path;
    }


    public void setProjectPath(String project_Path) {
        this.project_Path = project_Path;
    }

}
