package com.example.lifesaver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.lifesaver.model.BloodRegistration;
import com.example.lifesaver.service.LifeSaverService;

@Controller
@RequestMapping("/lifeSaver")
public class App {
	@Autowired
	private LifeSaverService lifeSaverService;
	
	  @GetMapping
	    public String list(Model model) {
	        model.addAttribute("BloodRegistration", lifeSaverService.findAll());
	        return "lifesaver/bloodregistration";
	    }

	    @GetMapping("/{id}")
	    public String viewList(@PathVariable Long id, Model model) {
	        model.addAttribute("BloodRegistration",lifeSaverService.findById(id));
	        return "lifesaver/searchresultpage";
	    }

	    @GetMapping("/searchresultpage")
	    public String addForm(Model model) {
	        model.addAttribute("BloodRegistration", new BloodRegistration());
	        return "lifesaver/thankyou";
	    }
	    
	    @PostMapping("/searchResultpage")
	    public String addBookSubmit(@ModelAttribute BloodRegistration submit) {
	    	lifeSaverService.save(submit);
	        return "redirect:/lifesaver";
	    }
	    @GetMapping("/{id}/edit")
	    public String editBookForm(@PathVariable Long id, Model model) {
	        model.addAttribute("book",lifeSaverService.findById(id));
	        return "lifesaver/thankyou";
	    }
	    @PostMapping("/{id}/edit")
	    public String editSubmit(@PathVariable Long id, @ModelAttribute BloodRegistration submit) {
	    	lifeSaverService.save(submit);  // The repository will update the book if an id is already present
	        return "redirect:/lifesaver";
	    }
	    @GetMapping("/{id}/delete")
	    public String delete(@PathVariable Long id) {
	    	lifeSaverService.delete(id);
	        return "redirect:/lifesaver";
	    }
}


