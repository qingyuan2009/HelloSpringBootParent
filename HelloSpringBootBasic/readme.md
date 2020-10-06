# SpringBoot �����ص㣺

*	��jar��ִ��web����
*	��Ƕservlet������ ����tomcat, Jetty...
*	Maven����
*	�Զ�����Bean
*	����Ŀ���м��
* 	Annotation

# Create Maven project

## POM �ĸ�������

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.2.0.RELEASE</version>		 
	</parent>
	
	* �Լܰ��汾���й������磺
	<mysql.version>8.0.18</mysql.version>

## POM dependency

	//spring-boot-starter-web ������spring + spring mvc + log + Tomcat ...
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>	
	
	* ������Spring MVC �� Spring�ļܰ�...
	
## POM ָ��JDK �汾

	<!-- ָ��JDK�汾 -->
	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-compiler-plugin</artifactId>
		<configuration>
			<source>1.8</source>
			<target>1.8</target>
		</configuration>
	</plugin>

# @SpringBootApplication
�����@EnableAutoConfiguration: �����Զ�����

��POM��dependency�ļܰ������Զ����ã�ԭ���ǣ�
����������spring-boot-autoconfigure-2.2.0.release.jar/META-INF/spring.factories
�������redis��·����
org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration,\ -> �������RedisProperties.class
�����кܶ��ʼ��ֵ�����������Ҫoverwrite������Ҫ�������Լ���properties�ļ����ض���

# ���Ҫ�ų������Զ����ã�
��spring-boot-autoconfigure-2.2.0.RELEASE.jar ���ҵ���Ӧ��configuration class
@EnableAutoConfiguration(exclude={**RedisAutoConfiguration.class**})

# ȫ�������ļ�
application.properties �� application.yml ͨ����resource�£������ļ����ᱻ����

server.port=8080
server.context-path=/root

# profile
application-dev.properties
application-prod.properties
application-sit.properties
��application.properties��ʹ�ã� spring.profiles.active=dev

# ��δ��������̺��ӹ���

**���������ӵ���Լ��ĸ�����**������POM�����̣�
<dependencyManagement>
    <dependencies>
    	<dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-dependencies</artifactId>
    		<version>2.2.0.RELEASE</version>
    		<!-- ���û��type��scope���ӹ��̵�dependency�޷��̳и����̵İ汾���� -->
    		<type>pom</type>
    		<scope>import</scope>
    	</dependency>
    </dependencies>
</dependencyManagement>
 
<build>
	<plugins>			
		<!-- ָ��JDK�汾 -->
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-compiler-plugin</artifactId>
			<configuration>
				<source>1.8</source>
				<target>1.8</target>
			</configuration>
		</plugin>			
	</plugins>
</build>

**����POM�ӹ���**��
�һ������̣�����Maven Module
POM�п��Կ���ʹ�����Լ��ĸ����̣�������������磺
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>

# ���ϲ���
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-test</artifactId>
	<scope>test</scope>
</dependency>		
<dependency>
	<groupId>junit</groupId>
	<artifactId>junit</artifactId>
	<scope>test</scope>
</dependency>

���Լ�test package
 
# log
Spring boot Ĭ�ϵ���logback, sprint-boot-starter-logging���Ĭ������
TRACE->DEBUG->INFO->WARN->ERROR->FATAL->OFF  Ĭ����INFO
ȫ�������ļ��� ����
logging.level.root=WARN
logging.level.org.springframework.web=DEBUG
Ĭ����־��д�ڿ���̨�����д���ļ���
logging.file=e:\\springboot\info.log
logging.pattern.console=%d{yyyy/MM/dd-HH:mm:ss} [%thread] %-5level %logger- %msg%n
logging.pattern.file=%d{yyyy/MM/dd-HH:mm:ss} [%thread] %-5level %logger- %msg%n

log4j?

# springboot ����ģʽ
���޸Ĵ���󣬷������Զ�����

<!-- ����ģʽ�� -->	
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>springloaded</artifactId>
	<version>1.2.8.RELEASE</version>			
</dependency>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-devtools</artifactId>			
</dependency>

# ��̬��Դ
resource�µ�static�ļ��п���ֱ���ⲿ����
���磺localhost:8080/001.jpg
����ʹ��ȫ������ spring.resources.static-locations=classpath:/static/

# ������Ϣת��������ֹ����
@Bean  //�Զ�����MVC����
public StringHttpMessageConverter stringHttpMessageConverter() {
	StringHttpMessageConverter convert = new StringHttpMessageConverter(Charset.forName("UTF-8"));
	return convert;
}

# FastJson: ��ObjectתΪjson��ʽ
@Bean
public HttpMessageConverters fastJsonMessageConverter() {
	//����FastJson����Ϣת����
	FastJsonHttpMessageConverter convert =  new FastJsonHttpMessageConverter();
	//����FastJson�����ö���
	FastJsonConfig config = new FastJsonConfig();
	//��Json���ݽ��и�ʽ��
	config.setSerializerFeatures(SerializerFeature.PrettyFormat);
	convert.setFastJsonConfig(config);
	HttpMessageConverter<?> con = convert;
	return new HttpMessageConverters(con);
}

//ʹ����FastJsonת������ ���HelloWorldSpringBootApplication.java
@RequestMapping("/person")    
public Object show() {
	Person person = new Person();
	person.setId(1);
	person.setName("zhourui");
	person.setDate(new Date());        
	return person;
}

ע���ֹ���룬��ȫ�������У� spring.http.encoding.force=true

# ������ Interceptor

# ȫ���쳣������
@ControllerAdvice
public class Exe_004_GlobalExceptionHandler {
    
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> handleException(Exception exception){
        Map<String, Object> map = new HashMap<>();
        map.put("errorCode", 500);
        map.put("errorMessage", exception.toString());
        return map;        
    }
}

# �첽����
@Service
public class AsyncServiceImpl implements AsyncService {

    private static Random random = new Random();
    
    @Async  //�첽ִ��
    @Override
    public Future<String> doTask1() throws Exception {
        System.out.println("����һ��ʼִ��");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("����һ��������ʱ��" + (end - start) + " ����");        
        return new AsyncResult<>("����һ����");
    }

    @Async
    @Override
    public Future<String> doTask2() throws Exception {
        System.out.println("�������ʼִ��");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("�������������ʱ��" + (end - start) + " ����");        
        return new AsyncResult<>("���������");
    }

    @Async
    @Override
    public Future<String> doTask3() throws Exception {
        System.out.println("��������ʼִ��");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("��������������ʱ��" + (end - start) + " ����");        
        return new AsyncResult<>("����������");
    }

�����࿪���첽ִ��
@SpringBootApplication  
@EnableAsync   //�����࿪���첽ִ��
public class HelloWorldSpringBootApplication {...}
