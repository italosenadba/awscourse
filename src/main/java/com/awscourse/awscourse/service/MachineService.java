package com.awscourse.awscourse.service;

import com.awscourse.awscourse.entity.*;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class MachineService {

    // get machine information
    public Machine getMachineInformation() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        String name = address.getHostName();
        String os = System.getProperty("os.name");
        String arch = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");

        Machine machine = new Machine(ip, name, os, arch, osVersion);

        return machine;

    }

    // get detailed machine information

    public DetailedMachine getDetaildeMachine() throws UnknownHostException{

        Machine machine = getMachineInformation();
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorUrl = System.getProperty("java.vendor.url");

        DetailedMachine detailedMachine = new DetailedMachine(machine.getIp(), machine.getName(),
                machine.getOs(), machine.getArchitecture(), machine.getOsVersion(),
                javaVersion, javaVendor, javaVendorUrl);
        
        return detailedMachine;

    }
}
