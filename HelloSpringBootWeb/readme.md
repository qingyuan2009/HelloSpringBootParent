# ����JSP

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