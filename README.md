# iOS Monkey

## 使用的库
- Kotlin - 简洁好用
- Appium - 移动端自动化测试
- Hutool - 工具类
- libimobiledevice - 跨平台协议库

## Monkey
- 随机执行事件（点击、滑动、音量键、Home键、返回键）

### 点击事件
- 如何点击？
```text
通过Appium TouchAction执行tap事件
```

- 往哪点击？
```text
获取屏幕宽高，随机生成需要点击坐标位置
```


### 滑动事件
- 滑动执行滑动？
```
通过Appium TouchAction执行press事件
```

### 音量事件
- 音量+
```
mobile: pressButton
    name: volumeUp
```

- 音量-
```
mobile: pressButton
    name: volumeDown
```

### Home键
```
mobile: pressButton
    name: Home
```

### 返回键
- iOS没有返回实体键，如何返回？
```text
获取返回按钮的元素坐标，通过tap点击
```

## Crash

### 获取Crash文件
```text
使用idevicecrashreport命令导出奔溃
```

### 如何判断是否发生Crash
```text
判断App是否在运行或App是否在当前被测应用
```

## 参考项目
- [zalando/SwiftMonkey](https://github.com/zalando/SwiftMonkey)
- [baozhida/iosMonkey](https://github.com/baozhida/iosMonkey)
- [mengdegong/iosMonkey](https://github.com/mengdegong/iosMonkey)