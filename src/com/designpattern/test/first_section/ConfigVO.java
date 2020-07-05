package com.designpattern.test.first_section;

import java.io.Serializable;


public class ConfigVO implements Serializable{
    private String fileName;
    private String os;
    private String targetPlatform;
    private String version;

    public ConfigVO(String fileName, String os, String targetPlatform, String version){
        this.fileName = fileName;
        this.os = os;
        this.targetPlatform = targetPlatform;
        this.version = version;
    }

    public String getFileName(){
        return fileName;
    }
    public String getOs(){
        return os;
    }
    public String getTargetPlatform(){
        return targetPlatform;
    }
    public String getVersion(){
        return version;
    }
}

//
//{
//        "File Name": "Test Configuration File_1",
//        "OS": "Windows",
//        "Target Platform": "Windows",
//        "Version": "v1.1"
//        }