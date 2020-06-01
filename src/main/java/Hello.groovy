
import com.zielsmart.zeus.net.model.NetRequest
import com.zielsmart.zeus.net.model.ProxyType

void logInfo(){

    NetRequest netRequest = new NetRequest();
    netRequest.setUrl("http://wb.ziel.cn").setProxyType(ProxyType.NO);
    String body = zeusHttp.get(netRequest).getResponse().body();
    zeusLog.info(body);
}
logInfo()