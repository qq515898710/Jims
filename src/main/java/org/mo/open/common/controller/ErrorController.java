package org.mo.open.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ErrorController implements GenericController {

	@RequestMapping(value = "notfound.html", method = RequestMethod.GET)
	public String notFound() {
		return "error/404";
	}
	
	@RequestMapping(value="internalServerError.html",method=RequestMethod.GET)
	public String InternalServerError (){
		return "error/500";
	}

	@RequestMapping(value = "badrequest.html", method = RequestMethod.GET)
	public String badRequest() {
		return "error/400";
	}

	@RequestMapping(value = "accessdenied.html", method = RequestMethod.GET)
	public String accessdenied(ModelMap model) {
		model.addAttribute("error", true);
		return "error/403";
	}

	@RequestMapping(value = "timeout.html", method = RequestMethod.GET)
	public String timeout(ModelMap model) {
		model.addAttribute("error", true);
		return "error/timeout";
	}
}