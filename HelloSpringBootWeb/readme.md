# 创建JSP  (不推荐)

创建WAR project

全局配置：
//路径 + 后缀
spring.mvc.view.prefix=/jsp/
spring.mvc.view.suffix=.jsp

@RequestMapping("/index")
//ResponseBody: 返回的是Restful内容，不使用会进行页面跳转， 这里我们需要调到index.jsp页面    
public String show(Model model) {
	model.addAttribute("name", "zhourui");
	return "index";
}

# freemarker 模板

# themeleaf 模板

.html 模板
全局配置：
spring.thymeleaf.cache=false
spring.thymeleaf.check-template-location=true
spring.thymeleaf.servlet.content-type=text/html; charset=utf-8
spring.thymeleaf.enabled=true
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html

# QuartZ

@Scheduled(fixedRate=1000)
public void run() {        
    System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
}

@SpringBootApplication 
@EnableScheduling
public class HelloSpringBootWebApplication {...}

# JDBC
<!-- jdbc依赖 -->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
</dependency>

全局配置
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=Shuuei37
spring.datasource.url=jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8

Controller/Service/Model/dao	








