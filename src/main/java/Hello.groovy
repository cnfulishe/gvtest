import cn.hutool.json.JSONUtil
import com.zielsmart.zeus.net.model.NetRequest
import com.zielsmart.zeus.net.model.NetResponse
import com.zielsmart.zeus.net.model.ProxyType

void logInfo(){

    NetRequest netRequest = new NetRequest();

    netRequest.setUrl("https://www.baidu.com").setProxyType(ProxyType.NO);
    NetResponse response = zeusHttp.get(netRequest).getResponse();
    zeusLog.info(JSONUtil.toJsonStr(response))
    zeusLog.info("我是一个测试");
}
logInfo()