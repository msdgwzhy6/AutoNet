package cn.xiaoxige.autonet_api;

import java.util.Map;

import cn.xiaoxige.annotation.AutoNetPatternAnontation;
import cn.xiaoxige.autonet_api.interfaces.IAutoNetCallBack;
import cn.xiaoxige.autonet_api.interfaces.IAutoNetRequest;
import io.reactivex.FlowableTransformer;

/**
 * @author by xiaoxige on 2018/5/20.
 *         The executor of AutoNet
 */

public class AutoNetExecutor {


    public AutoNetExecutor(IAutoNetRequest requestEntity, String extraDynamicParam, String url, String mediaType, Long writeOutTime, Long readOutTime, Long connectOutTime, Long encryptionKey, Boolean isEncryption, Map<String, String> heads, FlowableTransformer transformer, IAutoNetCallBack callBack) {

    }

    public void doNetGet() {

    }

    public void doNetPost() {

    }

    public void doNetDelete() {

    }

    public void doNetPut() {

    }

    public void doLocal() {

    }

    public void doLocalNet(AutoNetPatternAnontation.NetPattern netPattern) {

    }

    public void doNetLocal(AutoNetPatternAnontation.NetPattern netPattern) {

    }

    public void pushFile(String pushFileKey, String filePath) {

    }

    public void pullFile(String filePath, String fileName) {

    }

}