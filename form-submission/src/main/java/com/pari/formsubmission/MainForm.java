package com.pari.formsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainForm {

    @GetMapping("/data")
    public String mainForm(Model model) {
        model.addAttribute("data", new FormData());
        return "data";
    }

    @PostMapping("/data")
    public String mainSubmit(@ModelAttribute FormData data, Model model) {
        model.addAttribute("data", data);
        return "result";
    }

}