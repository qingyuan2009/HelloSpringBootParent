# 创建JSP

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