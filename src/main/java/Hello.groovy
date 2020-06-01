
import com.zielsmart.zeus.net.model.NetRequest
import com.zielsmart.zeus.net.model.ProxyType
void logInfo(){

    NetRequest netRequest = new NetRequest();
    netRequest.setUrl("http://wb.ziel.cn").setProxyType(ProxyType.NO);

    zeusLog.info("我是一个测试");
}
logInfo()