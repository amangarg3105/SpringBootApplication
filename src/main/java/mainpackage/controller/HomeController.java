package mainpackage.controller;


import mainpackage.model.PostModel;
import mainpackage.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@Autowired
	PostService postService;


	HomeController() {
		System.out.println("Home Controller Constructor");
	}

	@RequestMapping("/")
	public String homeController(Model model) {
		PostModel[] allPosts = postService.getAllPosts();
		System.out.println(allPosts[0].getTitle());
		model.addAttribute("posts", allPosts);
		return "index";
	}





}
