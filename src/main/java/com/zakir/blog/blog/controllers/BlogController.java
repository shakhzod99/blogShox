package com.zakir.blog.blog.controllers;
import com.zakir.blog.blog.models.Post;
import com.zakir.blog.blog.models.Post2;
import com.zakir.blog.blog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class BlogController {
    @Autowired
    private PostRepository postRepository;
    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post2> posts=postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }
    @GetMapping("/blog/add")
    public String blogAdd(Model model){
        return "blog-add";
    }
    @PostMapping("/blog/add")
    public String blogPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model) {
        Post2 post = new Post2(title, anons, full_text);
        postRepository.save(post);
        return "redirect:/blog";
    }
}