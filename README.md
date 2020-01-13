跟随作者代码学习Rxjava的使用
比较老，所以作者接入的和风天气也升级了
rxjava这里使用的是1，但是现在都到2了
和风天气的SDK接入
https://dev.heweather.com/docs/api/weather
查询当前地理位置
http://api.map.baidu.com/geocoder?location=31.300525%2C120.57900833333333&key=28bcdd84fae25699606ffad27f8da77b&output=json
{
    "status": "OK",
    "result": {
        "location": {
            "lng": 120.579008,
            "lat": 31.300525
        },
        "formatted_address": "江苏省苏州市虎丘区运河路78号",
        "business": "狮山,虎丘,三香路",
        "addressComponent": {
            "city": "苏州市",
            "direction": "附近",
            "distance": "20",
            "district": "虎丘区",
            "province": "江苏省",
            "street": "运河路",
            "street_number": "78号"
        },
        "cityCode": 224
    }
}
根据cid查询苏州天气
https://free-api.heweather.com/s6/weather?key=29fa754431304550b49cc3187c58cb06&location=CN101190401
{
    "HeWeather6": [
        {
            "basic": {
                "cid": "CN101190401",
                "location": "苏州",
                "parent_city": "苏州",
                "admin_area": "江苏",
                "cnty": "中国",
                "lat": "31.29937935",
                "lon": "120.61958313",
                "tz": "+8.00"
            },
            "update": {
                "loc": "2020-01-13 15:42",
                "utc": "2020-01-13 07:42"
            },
            "status": "ok",
            "now": {
                "cloud": "91",
                "cond_code": "101",
                "cond_txt": "多云",
                "fl": "4",
                "hum": "67",
                "pcpn": "0.0",
                "pres": "1021",
                "tmp": "6",
                "vis": "8",
                "wind_deg": "355",
                "wind_dir": "北风",
                "wind_sc": "2",
                "wind_spd": "6"
            },
            "daily_forecast": [
                {
                    "cond_code_d": "101",
                    "cond_code_n": "104",
                    "cond_txt_d": "多云",
                    "cond_txt_n": "阴",
                    "date": "2020-01-13",
                    "hum": "76",
                    "mr": "19:58",
                    "ms": "08:55",
                    "pcpn": "0.0",
                    "pop": "2",
                    "pres": "1025",
                    "sr": "06:57",
                    "ss": "17:16",
                    "tmp_max": "8",
                    "tmp_min": "2",
                    "uv_index": "9",
                    "vis": "25",
                    "wind_deg": "28",
                    "wind_dir": "东北风",
                    "wind_sc": "3-4",
                    "wind_spd": "21"
                },
                {
                    "cond_code_d": "101",
                    "cond_code_n": "101",
                    "cond_txt_d": "多云",
                    "cond_txt_n": "多云",
                    "date": "2020-01-14",
                    "hum": "69",
                    "mr": "21:06",
                    "ms": "09:39",
                    "pcpn": "0.0",
                    "pop": "24",
                    "pres": "1028",
                    "sr": "06:56",
                    "ss": "17:16",
                    "tmp_max": "8",
                    "tmp_min": "1",
                    "uv_index": "8",
                    "vis": "25",
                    "wind_deg": "324",
                    "wind_dir": "西北风",
                    "wind_sc": "4-5",
                    "wind_spd": "25"
                },
                {
                    "cond_code_d": "305",
                    "cond_code_n": "305",
                    "cond_txt_d": "小雨",
                    "cond_txt_n": "小雨",
                    "date": "2020-01-15",
                    "hum": "90",
                    "mr": "22:12",
                    "ms": "10:18",
                    "pcpn": "5.1",
                    "pop": "80",
                    "pres": "1023",
                    "sr": "06:56",
                    "ss": "17:17",
                    "tmp_max": "9",
                    "tmp_min": "5",
                    "uv_index": "1",
                    "vis": "14",
                    "wind_deg": "89",
                    "wind_dir": "东风",
                    "wind_sc": "3-4",
                    "wind_spd": "16"
                }
            ],
            "lifestyle": [
                {
                    "type": "comf",
                    "brf": "较不舒适",
                    "txt": "白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"
                },
                {
                    "type": "drsg",
                    "brf": "冷",
                    "txt": "天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"
                },
                {
                    "type": "flu",
                    "brf": "易发",
                    "txt": "天冷，发生感冒机率较大，请注意适当增加衣服，加强自我防护避免感冒。"
                },
                {
                    "type": "sport",
                    "brf": "较不宜",
                    "txt": "天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若在户外运动请注意保暖并做好准备活动。"
                },
                {
                    "type": "trav",
                    "brf": "一般",
                    "txt": "天空状况还是比较好的，但温度稍微有点低，且风稍大，会让您感觉些许凉意。外出请注意防风。"
                },
                {
                    "type": "uv",
                    "brf": "强",
                    "txt": "紫外线辐射强，建议涂擦SPF20左右、PA++的防晒护肤品。避免在10点至14点暴露于日光下。"
                },
                {
                    "type": "cw",
                    "brf": "适宜",
                    "txt": "适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。"
                },
                {
                    "type": "air",
                    "brf": "良",
                    "txt": "气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"
                }
            ]
        }
    ]
}
根据位置名称查询苏州天气
https://free-api.heweather.com/s6/weather?key=29fa754431304550b49cc3187c58cb06&location=%E8%8B%8F%E5%B7%9E
{
    "HeWeather6": [
        {
            "basic": {
                "cid": "CN101190401",
                "location": "苏州",
                "parent_city": "苏州",
                "admin_area": "江苏",
                "cnty": "中国",
                "lat": "31.29937935",
                "lon": "120.61958313",
                "tz": "+8.00"
            },
            "update": {
                "loc": "2020-01-13 15:03",
                "utc": "2020-01-13 07:03"
            },
            "status": "ok",
            "now": {
                "cloud": "91",
                "cond_code": "101",
                "cond_txt": "多云",
                "fl": "4",
                "hum": "64",
                "pcpn": "0.0",
                "pres": "1022",
                "tmp": "7",
                "vis": "8",
                "wind_deg": "288",
                "wind_dir": "西北风",
                "wind_sc": "2",
                "wind_spd": "11"
            },
            "daily_forecast": [
                {
                    "cond_code_d": "101",
                    "cond_code_n": "104",
                    "cond_txt_d": "多云",
                    "cond_txt_n": "阴",
                    "date": "2020-01-13",
                    "hum": "76",
                    "mr": "19:58",
                    "ms": "08:55",
                    "pcpn": "0.0",
                    "pop": "2",
                    "pres": "1025",
                    "sr": "06:57",
                    "ss": "17:16",
                    "tmp_max": "8",
                    "tmp_min": "2",
                    "uv_index": "9",
                    "vis": "25",
                    "wind_deg": "28",
                    "wind_dir": "东北风",
                    "wind_sc": "3-4",
                    "wind_spd": "21"
                },
                {
                    "cond_code_d": "101",
                    "cond_code_n": "101",
                    "cond_txt_d": "多云",
                    "cond_txt_n": "多云",
                    "date": "2020-01-14",
                    "hum": "69",
                    "mr": "21:06",
                    "ms": "09:39",
                    "pcpn": "0.0",
                    "pop": "24",
                    "pres": "1028",
                    "sr": "06:56",
                    "ss": "17:16",
                    "tmp_max": "8",
                    "tmp_min": "1",
                    "uv_index": "8",
                    "vis": "25",
                    "wind_deg": "324",
                    "wind_dir": "西北风",
                    "wind_sc": "4-5",
                    "wind_spd": "25"
                },
                {
                    "cond_code_d": "305",
                    "cond_code_n": "305",
                    "cond_txt_d": "小雨",
                    "cond_txt_n": "小雨",
                    "date": "2020-01-15",
                    "hum": "90",
                    "mr": "22:12",
                    "ms": "10:18",
                    "pcpn": "5.1",
                    "pop": "80",
                    "pres": "1023",
                    "sr": "06:56",
                    "ss": "17:17",
                    "tmp_max": "9",
                    "tmp_min": "5",
                    "uv_index": "1",
                    "vis": "14",
                    "wind_deg": "89",
                    "wind_dir": "东风",
                    "wind_sc": "3-4",
                    "wind_spd": "16"
                }
            ],
            "lifestyle": [
                {
                    "type": "comf",
                    "brf": "较不舒适",
                    "txt": "白天天气晴好，但仍会使您感觉偏冷，不很舒适，请注意适时添加衣物，以防感冒。"
                },
                {
                    "type": "drsg",
                    "brf": "冷",
                    "txt": "天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"
                },
                {
                    "type": "flu",
                    "brf": "易发",
                    "txt": "天冷，发生感冒机率较大，请注意适当增加衣服，加强自我防护避免感冒。"
                },
                {
                    "type": "sport",
                    "brf": "较不宜",
                    "txt": "天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若在户外运动请注意保暖并做好准备活动。"
                },
                {
                    "type": "trav",
                    "brf": "一般",
                    "txt": "天空状况还是比较好的，但温度稍微有点低，且风稍大，会让您感觉些许凉意。外出请注意防风。"
                },
                {
                    "type": "uv",
                    "brf": "强",
                    "txt": "紫外线辐射强，建议涂擦SPF20左右、PA++的防晒护肤品。避免在10点至14点暴露于日光下。"
                },
                {
                    "type": "cw",
                    "brf": "适宜",
                    "txt": "适宜洗车，未来持续两天无雨天气较好，适合擦洗汽车，蓝天白云、风和日丽将伴您的车子连日洁净。"
                },
                {
                    "type": "air",
                    "brf": "良",
                    "txt": "气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"
                }
            ]
        }
    ]
}

以下是原作者的简介，小凳子的简书
https://www.jianshu.com/p/943ceaccfdff
#RxWeather

![](./images/icon.png)

##@Deprecated

**简介**
-----------------
这是一个简单的天气预报项目，目的是用来演示如何使用RxJava构造一个清晰的Android应用框架，并且加入了Rxbus，为了节约时间成本，界面并没有经过特别的设计，配色和控件的摆放也没有遵循[Material Design](http://www.google.com/design/spec/material-design/introduction.html)设计规范，所以，它并不具备一款Android App所应该具备的素质，为此，我深感抱歉和遗憾。

我写了一篇文章，对这个项目做更深入的描述和解释：

[Architecting Android with RxJava](http://www.jianshu.com/p/943ceaccfdff)

**架构**
-----------------

[*Model View Presenter：*](http://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter)

![MVP-Architecture](http://upload-images.jianshu.io/upload_images/268450-3951595406461dee.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

[*The Clean Architecture：*](http://blog.8thlight.com/uncle-bob/2012/08/13/the-clean-architecture.html)

![Clean-Architecture](http://upload-images.jianshu.io/upload_images/268450-5e567202af6e2671.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**工程结构**
-----------------

![](http://upload-images.jianshu.io/upload_images/268450-377f30361e6fc627.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

- **presentation：** Presenters、Views、Exceptions

- **usercase：** UseCase

- **model：** Service、Entities

- **common：** Util、Constants、Event、RxBus、RxAndroid


**公开API**
-----------------

使用[百度地图](http://developer.baidu.com/map/)获取位置信息。

使用[和风天气](http://www.heweather.com/)公开接口，获取一周天气预报（暂不支持经纬度查询）。

使用[Openweathermap](http://openweathermap.org/)提供的部分资料。


**用法**
-----------------

首先，因为目前这个版本不支持分页加载，所以，没有提供上拉加载功能。

其次，除了HeaderView天气是根据当前位置获取之外，其余天气均通过读取**domain module**下的**city.txt**文件来获取一周内天气。

通过以下步骤进行修改或增加：

1. 下载Openweathermap提供的[资料](http://bulk.openweathermap.org/sample/)，**city.list.json.gz**这个文件，找到需要的城市json字符串，复制到**city.txt**中**cities**数组中。

2. 在和风天气提供的[国内城市ID列表](http://www.heweather.com/documents/cn-city-list)中，找到对应城市的**ID**进行替换。

最后，搜索功能，输入城市地区的时候，请不要以“市”、“区”结尾，例如：用“北京”代替“北京市”，“朝阳”代替“朝阳区”。


**GIF**
-----------------

![](./images/RxWeather.gif)

**关于开发者**
-----------------

- 小鄧子 - Hi4Joker@gmail.com

[小鄧子的简书](http://www.jianshu.com/users/df40282480b4/latest_articles)
 
[小鄧子的慕课网专题](http://www.imooc.com/myclub/article/uid/2536335)

<a href="http://weibo.com/5367097592/profile?rightmod=1&wvr=6&mod=personinfo">
  <img alt="Follow me on Weibo" src="http://upload-images.jianshu.io/upload_images/268450-50e41e15ac29b776.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240" />
</a>

**参考**
-----------------

- [Material-Movies](https://github.com/saulmm/Material-Movies) - Saul Molinero

- [Architecting Android…The clean way?](http://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/) - Fernando Cejas

- [Architecting Android…The evolution](http://fernandocejas.com/2015/07/18/architecting-android-the-evolution/) - Fernando Cejas

- [What is all this Clean Architecture jibber-jabber about? - Part 1](http://pguardiola.com/blog/clean-architecture-part-1/) - Pablo Guardiola

- [What is all this Clean Architecture jibber-jabber about? - Part 2](http://pguardiola.com/blog/clean-architecture-part-2/) - Pablo Guardiola 

