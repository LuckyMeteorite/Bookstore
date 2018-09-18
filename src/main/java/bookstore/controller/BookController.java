package bookstore.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
	
	ArrayList<String> friends = new ArrayList<String>();
	
	@RequestMapping(value = "/index")
	public String insertData(Model model) {
		model.addAttribute("friends", friends);
		return "friendInfo";		
	}
	

}