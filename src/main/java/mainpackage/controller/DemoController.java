package mainpackage.controller;


import mainpackage.model.PostModel;
import mainpackage.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {


	@Autowired
	PostService postService;

	DemoController() {
		System.out.println("Demo Controller Constructor");
	}


	@RequestMapping("/")
	@ResponseBody
	public String homeController() {
		PostModel[] allPosts = postService.getAllPosts();
		System.out.println(allPosts[0].getTitle());

		return  "Post Created";
	}


}
