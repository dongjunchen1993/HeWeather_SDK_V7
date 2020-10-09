## 本SDK提供获取和风天气V7数据的方法
具体的接口说明文档请看官方文档，[飞机、拿走不谢](https://dev.heweather.com/docs/api/weather)
如有问题，欢迎指正
### **SDK下载**
#### 1.配置用户 public id 和 private key
```
// 全局只需初始化一次
HeWeatherInitialize.init("HExxxxxxxxxxxxxxxx", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
```
#### 2.创建服务、获取数据
具体的参数，请参考官方文档进行填写
```
// 创建城市、poi检索服务（搜索服务）
// 获取3天预报
HeWeatherLocationService locationService = new HeWeatherLocationServiceImpl();
HeWeatherLookupResponse response = this.locationService.getLocation("beijing");
// 判定结果是否正常
if (response.getCode().isOk()) {
    System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(response));
} else {
    // todo 以下写非正常结果的处理逻辑
}

// 创建城市数据服务（天气数据服务）
// 获取3天预报， eg 城市id可通过 检索服务 获取
HeWeatherWeatherDailyResponse weather3d = this.weatherService.getWeather3d("101010100");
// 判定结果是否正常
if (weather3d.getCode().isOk()) {
    System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(weather3d));
} else {
    // todo 以下写非正常结果的处理逻辑
}
```


#### 服务类数名
1. HeWeatherAirService
空气质量相关
2. HeWeatherAstronomyService
太阳和月亮相关
4. HeWeatherHistoricalService
历史数据相关
5. HeWeatherLifestyleService
生活指数相关
6. HeWeatherLocationService
城市、POI 检索相关
7. HeWeatherMinutelyService
分钟降水相关
8. HeWeatherPoiService
Poi天气数据 相关
9. HeWeatherWarningService
城市预警信息相关
10. HeWeatherWeatherService
城市天气数据相关




