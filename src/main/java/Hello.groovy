import cn.hutool.json.JSONUtil
import com.zielsmart.zeus.net.http.ZeusHttpTemplate
import com.zielsmart.zeus.net.model.NetRequest
import com.zielsmart.zeus.net.model.NetResponse
import com.zielsmart.zeus.net.model.ProxyType

void logInfo(){

    NetRequest netRequest = new NetRequest();
    ZeusHttpTemplate zeusHttpTemplate = new ZeusHttpTemplate();
    netRequest.setUrl("https://wb.ziel.cn").setProxyType(ProxyType.NO);
    String response = zeusHttp.get(netRequest).getResponse().body();
    zeusLog.info("返回的文本："+response)
}
logInfo()