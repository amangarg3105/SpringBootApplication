package mainpackage.controller;

import mainpackage.model.PostModel;
import mainpackage.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping("/posts")
	public String getUserPosts(Model model) {
		PostModel[] allPosts = postService.getAllPosts();
		PostModel[] postModels = new PostModel[1];

		PostModel postModel = new PostModel();
		postModel.setBody("This post Body 1");
		postModel.setId(1);
		postModel.setTitle("Spring Container");

		postModels[0] = postModel;
		System.out.println(allPosts[0].getTitle());
		model.addAttribute("posts", allPosts);
		return "posts";
	}

}
