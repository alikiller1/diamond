package com.starit.diamond.client;

import java.util.concurrent.Executor;

import com.starit.diamond.manager.DiamondManager;
import com.starit.diamond.manager.ManagerListener;
import com.starit.diamond.manager.impl.DefaultDiamondManager;

public class DiamondClientTest {
	public static void main(String[] str) {
        DiamondManager manager = new DefaultDiamondManager("config", "riches_adminAnaly_config",
            new ManagerListener() {//填写你服务端后台保存过的group和dataId
            public void receiveConfigInfo(String configInfo) {
            }
            public Executor getExecutor() {
            return null;
            }
        });
        //设置diamond-server服务的端口
        manager.getDiamondConfigure().setPort(80);
        String availableConfigureInfomation = manager.getAvailableConfigureInfomation(5000);
        System.out.println("start config: " + availableConfigureInfomation);
    }
}
