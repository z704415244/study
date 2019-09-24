package com.zh.study.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.net.InetAddress;

//@Configuration("envConfig")
public class EnvConfig {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${env.test}")
    private boolean testEnv;

    private String group;

    public String getGroup() {

        if(group == null) {
            group = generateGroup();
        }

        return group;
    }

    private String generateGroup() {

        if(!testEnv) {
            return "prod";
        }else {
            return generateLocalIdentifier();
        }
    }

    private String generateLocalIdentifier() {

       // return "g" + String.valueOf(getLocalIpAsInt());
        return "g" + getHostName();
    }


    private String getHostName(){



        try {

            String hostName = InetAddress.getLocalHost().getHostName();

            return hostName.replaceAll("[^A-Za-z0-9]", "");
        }catch(Exception e) {

            logger.error("failed to get local host name", e);

            return "localhost";
        }
    }

    private int getLocalIpAsInt() {

        try {

            InetAddress localhost = InetAddress.getLocalHost();

            int result = 0;
            for (byte b : localhost.getAddress()) {
                result = result << 8 | (b & 0xFF);
            }

            return result;
        }catch(Exception e) {

            logger.error("failed to get local ip", e);

            return 0;
        }
    }

    public static void main(String[] args) {

        EnvConfig config = new EnvConfig();

        System.out.println(config.generateLocalIdentifier());
    }
}
