package code.rider.mvc.RiderMVC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditorController {
    @RequestMapping("/editor")
    public String editor(String name, Model model) {
        model.addAttribute("language", name);
        return "editor";
    }
}
