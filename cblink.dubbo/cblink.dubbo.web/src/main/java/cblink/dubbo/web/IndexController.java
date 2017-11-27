package cblink.dubbo.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cblink.dubbo.common.service.RemoteService;

@Controller
public class IndexController {
	
	@Resource
	private RemoteService remoteService;

	@RequestMapping("dubbo/index.do")
	public String index(HttpServletRequest request,HttpServletResponse response){
		System.out.println("===================================");
		String message = remoteService.getMessageByType("name", "scott");
		System.out.println("message ===== "+message);
		return "index";
	}
}
