学习Struts2

Action的搜索顺序
	http://localhost:8080/项目名/path1/path2/payh3/student.action
	第一步：判断package是否存在，如：path1/path2/path3
		存在：
			第二步;判断action是否存在，如果不存在则去默认的namespace的package里面寻找action
			第三步：如果没有 则报错
		不存在：
			第二步：检查上一级路径的package是否存在（直到默认的namespace） 重复第一步
			第三步：如果没有，则报错
			
动态方法调用
	动态方法调用就是为了解决一个action对应多个请求的处理，以免action太多
		指定method属性
		感叹号方式 helloworld!add.action
		通配符方式(推荐使用)   helloworld_add.action  
			<action name="helloworld_*" method="{1}" class="com.imooc.action.HelloWorldAction">
			<result>/result.jsp</result>
			<result name="add">/{1}.jsp</result>
			<result name="update">/{1}.jsp</result>
		</action>
		
默认action :
		<default-action-ref name="index">
		</default-action-ref>

		<action name="index">
			<result>/error.jsp</result>
		</action>
		
接收参数:
	1.使用action的属性接收参数
	2.使用DomainModel接受参数 添加对象的get/set   jsp文件需要指定user  （user.username ）
	3.使用ModelDriven接收参数  实现 ModelDriven接口 实例化对象   jsp文件中不需要指定user
	推荐使用第三种
	
	处理结果类型： (name中小写)
		1 SUCCESS：Action正确的执行完成，返回相应的视图，success是name属性的默认值
		2.NONE：表示action正确的执行完成，但并不返回任何视图
		3.ERROR：执行action失败，返回到错误处理视图
		4.LOGIN：action因为用户没有登陆的原因没有正确执行，将返回该登陆视图，要求用户进行登陆验证
		5.INPUT：action的执行，需要从前端页面获取参数，input就是代表这是个参数输入的界面，一般在应用中，会对这些参数进行验证，如果验证没有通过，将自动返回到该视图
		根据位置的不同 分为两种结果
			局部结果：将<result/>作为<action/>元素的子元素配置
			全局结果：将<result/>作为<global-result/>元素的子元素配置
		
Struts2拦截器
	1.自定义拦截器
		1.实现Interceptor接口
			-init() ：初始化拦截器所需资源	
			-destory(): 释放在init中分配的资源
			-String intercept(ActionInvocation ai)throws Exception
				实现拦截器功能
				利用ActionInvocation参数获取Action状态
				返回result字符串作为逻辑视图
	2.继承AbstractInterceptor类
		提供了init()和destory()方法的空实现
		只需要实现intercept方法即可
		
	
	
		

	