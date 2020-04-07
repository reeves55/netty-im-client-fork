package com.xiaolee.im.client;

import com.xiaolee.im.client.interf.IMSClientInterface;
import com.xiaolee.im.client.netty.NettyTcpClient;

/**
 * <p>@ProjectName:     NettyChat</p>
 * <p>@ClassName:       IMSClientFactory.java</p>
 * <p>@PackageName:     com.xiaolee.im.client</p>
 * <b>
 * <p>@Description:     ims实例工厂方法</p>
 * </b>
 * <p>@author:          FreddyChen</p>
 * <p>@date:            2019/03/31 20:54</p>
 * <p>@email:           chenshichao@outlook.com</p>
 */
public class IMSClientFactory {

    public static IMSClientInterface getIMSClient() {
        return NettyTcpClient.getInstance();
    }
}
