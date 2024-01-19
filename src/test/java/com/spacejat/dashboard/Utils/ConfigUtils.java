package com.spacejat.dashboard.Utils;

import java.util.Properties;

public class ConfigUtils {
    private Properties properties;
    private static ConfigUtils configUtils;
    private ConfigUtils (){
        String env = System.getProperty("env","PRODUCTION");
        switch (env){
            case "PRODUCTION":
                    properties = propertiesUtils.loadProUtils("src/test/java/com/spacejat/dashboard/config/Production.properties");
                break;
            case "DEVELOPMENT":
                    properties = propertiesUtils.loadProUtils("src/test/java/com/spacejat/dashboard/config/Dev.properties");
                break;
            case "STAGE":
                properties = propertiesUtils.loadProUtils("src/test/java/com/spacejat/dashboard/config/Stage.properties");
                break;
            default:
                throw new RuntimeException("Environment is not supported");
        }
    }
    public static ConfigUtils getInstance(){
        if(configUtils == null){
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }
    public String getBaseUrl(){
        String prop = properties.getProperty("baseUrl");
        if (prop != null) return prop;
        throw new RuntimeException("Could not fine the base url in the property file");
    }
    public String getLinkDeviceIdentity(){
        String prop = properties.getProperty("linkDeviceIdentity");
        if (prop != null) return prop;
        throw new RuntimeException("Could not fine the link device identity in the property file");
    }
    public String getInvalidLinkDeviceIdentity(){
        String prop = properties.getProperty("invalidLinkDeviceIdentity");
        if (prop != null) return prop;
        throw new RuntimeException("Could not fine the invalid link device identity in the property file");
    }
    public String getInvitationLinkSpace(){
        String prop = properties.getProperty("invitationLinkSpace");
        if (prop != null) return prop;
        throw new RuntimeException("Could not fine the invitation link space in the property file");
    }
    public String getInvalidInvitationLinkSpace(){
        String prop = properties.getProperty("invalidInvitationLinkSpace");
        if (prop != null) return prop;
        throw new RuntimeException("Could not fine the invalid invitation link space in the property file");
    }
    public String getInvitationLinkMeeting(){
        String prop = properties.getProperty("invitationLinkMeeting");
        if (prop != null) return prop;
        throw new RuntimeException("Could not fine the invitation link meeting in the property file");
    }
}
