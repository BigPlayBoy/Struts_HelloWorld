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
	
	
		

	