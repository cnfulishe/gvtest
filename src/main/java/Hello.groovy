import cn.hutool.json.JSONUtil
import com.zielsmart.zeus.net.http.ZeusHttpTemplate
import com.zielsmart.zeus.net.model.NetRequest
import com.zielsmart.zeus.net.model.NetResponse
import com.zielsmart.zeus.net.model.ProxyType
void logInfo(){

    NetRequest netRequest = new NetRequest();
    ZeusHttpTemplate zeusHttpTemplate = new ZeusHttpTemplate();

    netRequest.setUrl("https://www.baidu.com").setProxyType(ProxyType.NO);

    NetResponse response = zeusHttpTemplate.get(netRequest).getResponse();
    zeusLog.info(JSONUtil.toJsonStr(response))
    zeusLog.info("我是一个测试");
}
logInfo()