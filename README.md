# 目录结构
```
Validation
├──README.md->说明文档
├──version.txt->版本说明(用户操作)
├──libs
│└──xxx.jar->人脸识别jar包(用户操作)
├──conf
│└──xxx.dll->配置文件(用户操作)
├──images->保存验证程序测试样例图片
└──src
	├──RunMain.java->启动环境检测和人脸相似度检测。
	├──Scripts
        │├──Environment.java->用于环境检测
        │└──TestDriver.java->获取1:1和1:N测试的相似度
    └──Impl
        │├──FaceCheck.java->对人脸比对sdk的调用(用户操作)
        │├──Check1.java->1:1比对(用户操作) 有getLike方法，返回值是float类型的相似度
    	│└──CheckN.java->1:N比对(用户操作) 有getLike方法，返回值是ArrayList<Float>的一组相似度
```

# 验证要求

1. libs文件夹下需要放入待验证算法的jar包。
2. conf文件夹下放入算法的配置文件等。
3. images文件夹下有验证程序的测试图片，用于测试和验证算法的相似度计算功能。
4. 用户需要在version.txt内写入算法版本信息，以及算法名，算法使用备注等必要信息。
5. 用户根据项目中的代码及注释，完成算法的配置及验证程序的运行，通过验证后请将本项目文件打包成zip压缩包，在算法管理页面上传本算法。