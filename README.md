#### note-with-oss
note-with-oss

使用阿里对象存储作为 云笔记存储



架构



local  ----   oss   ------- local





##### 要求：

-  保证完整性
-  一般只添加数据
- 三种状态 已提交（committed）、已修改（modified）和已暂存（staged）
- 一发一存一消费





##### 版本1.0：

> 目标：基本可用

- 本地保存一份文档（工作区）

- 本地保存一份备份文件名（暂存区）

- 本地文件（本地区）

- 本地区与暂存区对比，覆盖，添加，删除，copy暂存区文件到工作区

- 根据暂存区上传工作区的文件到 storage

   

  

  

  





##### 版本2.0

> 目标：多端可用

- 实现多local 到storage
- 使用systemtime 充当 broker
- storage 增加暂存区
- 通过index 到storage 同步文件记录到本地，冲突提示
- 增加记录到暂存区，再上传文件到storage





##### 版本3.0

> 目标：多用户可用

- 使用token 和system time 实现不同的topic
- 
- 









---

