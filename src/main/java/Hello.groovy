
int add(int a,int b){
    return a+b;
}
void logInfo(){
    println(add(1,2))
    println("--下面是通过调用Java输出日志----")
   // zeusLog.info("我是Zeus调用的日志:"+add(2,3))
    println("---下面是调用Java方法")
   //helloJob.run(null)

    List<Integer> list = new ArrayList<>();
    for (int i=0;i<10;i++) {
        list.add(i);
    }

   for(Integer i:list){
       println(i)
   }
}

logInfo()