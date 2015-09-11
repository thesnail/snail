Android 第三方架包功能:
    百分比库：比Android中权重更加好用
    注解配置:优化findViewById、setContentView、onClick  使APK变得更小
    注解使用:
        在类上面
            @ContentView(R.layout.activity_main) 表示引入布局
            和onCreate中setContentView(R.layout.activity_main)一样
        在声明的控件上面
            @ViewInject(R.id.txt1)
            和findViewById(R.id.txt1);一样
        在某个onClick(View v)方法上面
            @OnClick({R.id.txt1,R.id.txt2,...})表示注册监听事件



    百分比库使用方法
        在头部添加 xmlns:app="http://schemas.android.com/apk/res-auto" 其中app名称可以自定义
        新增属性:
            layout_widthPercent 控件的长度占父容器的百分比  例如 app:layout_widthPercent="50%" 控件占父容器的百分之50
            layout_heightPercent 控件的高度占父容器的百分比

            layout_marginPercent

            layout_marginTopPercent
            layout_marginBottomPercent
            layout_marginLeftPercent
            layout_marginRightPercent

            layout_marginStartPercent
            layout_marginEndPercent

            layout_textSizePercent 文字大小所占的百分比

            layout_maxWidthPercent
            layout_maxHeightPercent
            layout_minWidthPercent
            layout_minHeightPercent

            layout_paddingPercent

            layout_paddingTopPercent
            layout_paddingBottomPercent
            layout_paddingLeftPercent
            layout_paddingRightPercent

            以上也不在逐个介绍和以前的熟悉一样只是在后面加上了Percent 就表示所占的百分比
            这些属性所占的百分比是相对于父容器而言
            如果在%后面跟上h和w表示 h表示所占父容器高的百分比 w表示所占父容器的长度百分比
