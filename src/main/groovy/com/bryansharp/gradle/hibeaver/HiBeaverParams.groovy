package com.bryansharp.gradle.hibeaver

public class HiBeaverParams {
    String hiBeaverModifyName = ''
    boolean enableModify = true
    boolean watchTimeConsume = false
    boolean keepQuiet = false
    boolean showHelp = true
    Map<String, List<Map<String, Object>>> modifyMatchMaps = [:]
}