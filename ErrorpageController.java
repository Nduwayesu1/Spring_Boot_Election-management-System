package MainPackage.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ErrorpageController implements ErrorController{

	@GetMapping("/errorPage")
	String getErrorpage() {
		
		return "ErrorPage";
	}
}
