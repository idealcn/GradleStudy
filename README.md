# 参考资料
[谷歌android官网文档](https://developer.android.google.cn/studio/build/)
[gradle官网](https://gradle.org/)

# git相关用法
### 初始化仓库
```
    git init
```
### 添加远程仓库地址
```
    git remote add origin "远程仓库地址"
```
### 添加文件
```
    //添加所有的文件
    git add .
```
### 提交文件
```markdown
    git commit -m "提交说明"
    //推送到分支
    git push -u origin master
```
> 如果更改了某个文件,应当先 <code>git add</code>,再去做提交

### 从远程分支做更新
```
  git pull <remote> <branch>
   //例如
   git pull origin 分支名字
```

# gradle
1. 应用id(applicationId)与应用包名(packageName)彼此无关.更改代码的软件包名称,不会影响应用 ID
2. 
