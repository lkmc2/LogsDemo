# LogsDemo
一个Android的Log开源库，可以简化对Log的操作。

使用本开源库的配置如下：
1.在Project的build.gradle添加一行maven { url 'https://jitpack.io' }，如：
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

2.在app的build.gradle添加一行compile 'com.github.lkmc2:LogsDemo:v7.0'，如：
```
dependencies {
	compile 'com.github.lkmc2:LogsDemo:v7.0'
}
```

本开源库的使用方法如下：
1.可与android.util.Log有着一样的使用方法，此方式默认的全局TAG名为LogInfo：
```
Logs.i("When all those shadows almost killed your light");
```

2.可直接传入Activity的Context，此方式的TAG名为Activity的类名（不含包名）：
```
Logs.t(this).i("Come morning light, you and I'll be safe and sound");
```

3.可自定义TAG名：
```
Logs.t("safe").i("Just close your eyes");
```

以上三种方式除了i(String)方法外，都含有e(String)、w(String)、d(String)、v(String)方法。


PS：
 * 1.如果是想全局打印同一个Log名，直接修改下面的TAG变量的名称，然后使用类名 + 点 + 方法名即可，
如：Log.v("你想输入的信息");
 
 * 2.如果想每一个Activity都使用不同的Log名，直接在t(String)方法中传入自定义的TAG名，然后再调用方法，
如：Log.t("自定义的TAG名").v("你想输入的信息");
 
 * 3.如果想每一个Activity都使用不同的Log名，又不想另行定义TAG名，直接在t(Activity)方法中传入Activity的Context，
然后再调用方法，如：Log.t(this).v("你想输入的信息");，这时将类名作为TAG名（不含包名）;
 
 * 4.使用t(String)或者t(Activity)方法后，全局TAG的名字将永久改变，不建议将Log.v(String)方法与
 Log.t(String).v(String)混搭使用。要么只使用Log.v(String)，或者只使用Log.t(String).v(String)的方式。

 * 5.如果不喜欢编译器出现黄线警告，可在类上添加@SuppressWarnings("AccessStaticViaInstance")注解。
