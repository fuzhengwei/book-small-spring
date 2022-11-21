# 《手写Spring：渐进式源码实践》 —— 书籍源码库

![](https://github.com/fuzhengwei/book-small-spring/blob/master/doc/book-01.png?raw=true)

本项目思路和代码来自于开源项目 [DerekYRC/mini-spring](https://github.com/DerekYRC/mini-spring)、[code4craft/tiny-spring](https://github.com/code4craft/tiny-spring) 经过本人学习、扩展、补充，并编写文章总结经验，分享给广大读者，一起学习 Spring 源码。非常感谢开源项目贡献者，读者也可以一起学习，不同视角下的学习经验。

**开源项目及优秀书籍**；

- [DerekYRC/mini-spring](https://github.com/DerekYRC/mini-spring)
- [code4craft/tiny-spring](https://github.com/code4craft/tiny-spring)
- [《Spring源码深度解析》](https://item.jd.com/12506664.html)
- [《精通Spring 4.x —— 企业应用开发实战》](https://item.jd.com/10062905219396.html)

---

👨‍💻作者：小傅哥
<br/>
🌱微信：fustack —— 可以添加微信备注【Spring读书群📚】

>沉淀、分享、成长，让自己和他人都能有所收获！

`IOC`、`AOP`、`SPI`，Spring 给你的不只是一个开发框架，还包括它的设计思想。它通过解耦 Bean 对象的实例化过程，管理 Bean 的生命周期，来维护你在程序开发中所需对象使用过程。让你不需要刀耕火种般 new 一个对象，也不需要如 EJB 一样笨重臃肿的开发维护，而像春风一样润物(`万物皆可Bean`)细无声的使用。因此可以说它完全担得起 **Java 技术设计的顶峰**。
<br/>
<div align="center">
    <a href="https://u.jd.com/4LapTH4" target="_blank">
    <img src="https://github.com/fuzhengwei/book-small-spring/blob/master/doc/book.png?raw=true" width="250px">
    </a>
</div>
<br/>

除了运用以外，Spring 框架也是众多码农，最能最先接触到的一个**源码级复杂项目**。任何初出新手村蜕变的码农，寻觅苦找的锻炼项目，都不如学习 Spring 源码来的痛快。从架构设计的复杂、从分治抽象的运用、从设计模式的驾驭，Spring 框架都是顶级的，也是最能给你带来丰富收获的。

---

**📝目录**

0. 代码仓库
    - GitHub：[https://github.com/fuzhengwei/book-small-spring](https://github.com/fuzhengwei/book-small-spring)
    - Gitcode：[https://gitcode.net/fuzhengwei/book-small-spring](https://gitcode.net/fuzhengwei/book-small-spring)
1. 本书特点
2. 学以致用
3. [书籍购买](https://u.jd.com/4LapTH4)
4. 勘误记录 —— `非常感谢，读者提交阅读中发现的错字和问题。`

---

## 1. 本书特点

1. 这本书最大的价值是带着想学Spring源码的读者，能有个门进去。避免像以前一样，东一榔头西一棒子没有体系化的学。
2. 手写spring，不是为了再造一个轮子，是为了吸收更好的架构设计和编程思想。并把内容运用到实际项目，既可以解决业务的耦合实现，提升交付质量。
3. 本书采用从零手写 Spring 的方式，摒弃 Spring 源码中繁杂的内容，选择整体框架中的核心逻辑，简化代码实现过程，保留核心功能，如 IOC、AOP、Bean 的生命周期、上下文、 作用域和资源处理、事务等。在开发过程中，细化功能模块，逐步完成一个简单版的 Spring 框架。

## 2. 学以致用

[《手写Spring：渐进式源码实践》](https://u.jd.com/4LapTH4)完成后我的能力如何体现在简历上？给个案例。

1. **体现在专业技能上**，例如；
    1. 深入学习 Spring 核心流程模块，包括；IOC、AOP、依赖倒置等流程，掌握Spring解决复杂场景所运用的分治、抽象和知识(设计模式、设计原则)，在解决Spring场景问题时，可以从核心原理上给出方案。同时也具备基于 Spring 开发 SpringBoot Starter 技能，为复杂项目减少同类共性需求的开发，凝练通用的技术组件，减少研发成本。
    2. 深入学习 MyBaits 核心流程模块，包括；会话、反射、代理、事务、插件等流程，熟练掌握 ORM 框架的设计思想、实现方式和应用价值。并能按需结合 MyBatis 的插件机制，开发属于企业自己所需的功能，包括；数据分页、数据库表路由、监控日志、数据安全等方面。

2. **体现在项目经验上**，例如；—— 对校招和实习比较有用
把 Spring、MyBatis 当一个学习项目来描述，这是你在离校前，最可能接触到的一个完整的、成型的、知名的，有企业使用的，框架。你就按照自己学习并开发了这样一个框架为目标来写项目，并描述出这个项目，你用了什么技术栈，解决了什么问题，学习到了哪些。

3. **体现在项目应用上**，例如；
关于 Spring、MyBatis 的项目，一般都是插件类开发，比如各类的 SpringBoot Starter，MyBatis 插件，都是基于框架的深入整合类技术解决方案，体现在简历上，非常抓眼球。一看你就是有深度和自研能力的研发人员。—— 一般不让你造轮子，但需要你有造轮子的能力，这样企业中一些软件可以被你进行优化和修改。

4. **体现在解决问题上**，例如；
在你的自己的业务项目中，渗入一些关于解决了原项目使用 Spring 时，关于感知 Aware 方式或者结合 FactoryBean 包装对象等，所遇到的问题，因为你学习过源码，所以非常清晰这样的流程，因此解决了一个问题。通用 MyBatis 也适用于这样的描述方式，包括；事务、查询次数、批查询、插件能监听到的四个类（ParameterHandler、ResultSetHandler、StatementHandler、Executor ）你给了更好的选择。

## 3. 书籍购买

**链接下单**：[https://u.jd.com/4LapTH4](https://u.jd.com/4LapTH4)

本书共21章；
- 第01 ~ 10章：主要介绍IOC 容器，逐步完善一个简单的Spring Bean 容器的相关功能，引入实例化策略、注入属性和依赖、设计应用上下文、处理Bean 对象的生命周期，以及实现感知容器对象的监听等。
- 第11 ~ 12章：主要介绍AOP 切面，基于JDK、Cglib 的动态代理、方法拦截、切点表达式等技术，将代理与Spring Bean 容器整合，提供AOP 切面功能。
- 第13 ~ 17章：扩展简单版Spring 框架的自动化功能，完成自动扫描注册、注解和代理注入，以及通过三级缓存处理对象的循环依赖等功能。
- 第18 ~ 21章：基于简单实现的Spring 框架整合JDBC、事务的功能，开发一个简单版的ORM 框架，并将ORM 框架整合到Spring Bean 容器中，介绍自定义代理对象的扫描和注册过程。

本书主要通过渐进式开发功能模块，以实现开发整个Spring 框架的核心源码。首先，每章开头都会列出难度和重点；然后，正文中会介绍要处理的问题、具体设计和实现代码；最后，给出测试验证和本章总结。

## 4. 勘误记录

### 1. 第3页，Spring 框架地图

- 错误：`BeanPostProcessor 前置处理 | postProcessAfterInitializtion` 
- 修改：`BeanPostProcessor 后置处理 | postProcessAfterInitializtion` 

### 2. 第17页，图 2-2 类图错误

- 错误：图 2-2 DefaultSingletonBeanRegistry #addSingleton 类图与代码不符
- 修改：图 2-2 DefaultSingletonBeanRegistry #registerSingleton

### 3. 第5页，工程示意图调整

- 错误：SpringTutorials
- 修改：book-small-spring 
- 说明：因为作者github中项目较多，所以统一修改了工程名称，方便读者知道book开头的是项目工程是图书库代码。

### 4. 第27页，工程结构，颜色标记 感谢 反馈人：@苏沐

- 错误：DefaultListableBeanFactory 绿色标记
- 修改：DefaultListableBeanFactory 黑色标记
- 说明：绿色为新增，DefaultListableBeanFactory 非新增类，为黑色。

### 5. 第52页，图 5-4 感谢 反馈人：@水中捞月、@INIT

- 错误：BeanFactory 多了一个 registerBeanDefinition 方法
- 修改：删除掉 registerBeanDefinition 方法，并在 BeanFactory 标记`《接口》`

### 6. 第167页，图 12-1 感谢 反馈人：@🍇葡萄

- 错误：图中 ProxyFacory 单词错误
- 修改：ProxyFacory 修改为 ProxyFactory
