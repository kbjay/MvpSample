# MvpSample

分模块的mvp架构最简版

代码结构如下：
  
  basemvp：mvp的抽象

  entity：实体类

  module：根据业务逻辑划分的模块，每个模块包含v跟p
        .base:对应模块的view层抽象

  model：数据层
        .base:数据层抽象
