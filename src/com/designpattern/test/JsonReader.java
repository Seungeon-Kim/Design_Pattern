package com.designpattern.test;

import com.designpattern.study.etc.Constants;
import com.designpattern.study.singleton.SingletonLazy;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonReader {
    public void read(String path) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(path));
            JSONObject jsonObject = (JSONObject) obj;

            String fileName = (String) jsonObject.get("fileName");
            String os = (String) jsonObject.get("os");
            String targetName = (String) jsonObject.get("targetPlatform");
            String version = (String) jsonObject.get("version");

            ConfigVO config = new ConfigVO(fileName, os, targetName, version);

            SingletonLazy.getInstance().add(Constants.Keys.KEY_CONFIGURATION, config);
        }catch (Exception e){

        }
    }
}
