# ����JSP  (���Ƽ�)

����WAR project

ȫ�����ã�
//·�� + ��׺
spring.mvc.view.prefix=/jsp/
spring.mvc.view.suffix=.jsp

@RequestMapping("/index")
//ResponseBody: ���ص���Restful���ݣ���ʹ�û����ҳ����ת�� ����������Ҫ����index.jspҳ��    
public String show(Model model) {
	model.addAttribute("name", "zhourui");
	return "index";
}

# freemarker ģ��

# themeleaf ģ��

.html ģ��
ȫ�����ã�
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
<!-- jdbc���� -->
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
</dependency>

ȫ������
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=Shuuei37
spring.datasource.url=jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8

Controller/Service/Model/dao	








