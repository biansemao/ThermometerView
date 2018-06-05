# ThermometerView
Android自定义控件，温度计/体温计 thermometer

效果见下图:

![](https://github.com/biansemao/ThermometerView/blob/master/GIF.gif)

# How To Use
## 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
## 2. Add the dependency:
```
dependencies {
    implementation 'com.github.biansemao:ThermometerView:1.0.1'
}
```
## 3. Use:
1.在布局中直接使用。

2.使用构造器ThermometerBuilder来动态生成该控件，builder()。
# Attributes
| attr 属性 | description 描述 |
|-----------|-----------------|
| viewBg | 背景颜色 |
| unitTextSize | 单位文字大小 |
| unitTextColor | 单位文字颜色 |
| scaleTextSize | 刻度值文字大小 |
| scaleTextColor | 刻度值文字颜色 |
| maxScaleLineColor | 长刻度颜色 |
| midScaleLineColor | 中等刻度颜色 |
| minScaleLineColor | 短刻度颜色 |
| scaleLineWidth | 刻度线宽 |
| maxLineWidth | 长刻度长 |
| midLineWidth | 中等刻度长 |
| minLineWidth | 短刻度长 |
| spaceScaleWidth | 刻度离温度计距离、刻度离文字距离 |
| thermometerBg | 温度计颜色 |
| thermometerShadowBg | 温度计阴影颜色 |
| maxThermometerRadius | 温度计底部半径 |
| minThermometerRadius | 温度计顶部半径 |
| maxMercuryRadius | 水银底部半径 |
| minMercuryRadius | 水银顶部半径 |
| leftMercuryBg | 左边水银背景颜色 |
| rightMercuryBg | 右边水银背景颜色 |
| leftMercuryColor | 左边水银颜色 |
| rightMercuryColor | 右边水银颜色 |
| maxScaleValue | 温度计最大值 |
| minScaleValue | 温度计最小值 |
| curScaleValue | 当前刻度值 |
# Method
## 1.setCurValue(float curValue)
设置温度值(摄氏温度)
## 2.setCurFValue(float curFValue)
设置温度值(华氏温度)
## 3.setValueAndStartAnim(float curValue)
设置温度值并启动动画(摄氏温度)
## 4.setFValueAndStartAnim(float curFValue)
设置温度值并启动动画(华氏温度)
