package kg.damir.sweater.controllers;

import kg.damir.sweater.models.Post;
import kg.damir.sweater.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
        return "blog-add";
    }

    @PostMapping("/blog/add")
    public String blogPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model) {
        Post post = new Post(title, anons, full_text);
        postRepository.save(post);
        return "redirect:/blog";
    }
    @GetMapping("/blog/{id}")
    public String blogDetails(@PathVariable(value = "id") long id, Model model) {
        if (!postRepository.existsById(id)){
            return "redirect:/blog";
        }
        Optional<Post> post= postRepository.findById(id);
        System.out.println(post);
        ArrayList<Post> res=new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post",res );
        System.out.println(model);
        return "blog-details";
    }

    @GetMapping("/blog/{id}/remove")
    public String blogRemove(Model model) {
        return "blog-remove";
    }
    @GetMapping("/blog/{id}/edit")
    public String blogEdit(Model model) {
        return "blog-edit";
    }

}
