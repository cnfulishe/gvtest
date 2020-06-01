
import com.zielsmart.zeus.net.model.NetRequest

void logInfo(){

    NetRequest netRequest = new NetRequest();
    netRequest.setUrl("http://wb.ziel.cn")
    String body = zeusHttp.get(netRequest).getResponse().body();
    zeusLog.info(body)
}

logInfo()