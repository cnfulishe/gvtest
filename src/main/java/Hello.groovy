
import com.zielsmart.zeus.net.model.NetRequest

int add(int a,int b){
    return a+b;
}
void logInfo(){

    NetRequest netRequest = new NetRequest();
    netRequest.setUrl("http://wb.ziel.cn")
    String body = zeusHttp.get(netRequest).getResponse().body();
    zeusLog.info(body)
}

logInfo()