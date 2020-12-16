package phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import phonebook.entity.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ContactController {
    private List<Contact> contacts;

    public ContactController() {
        this.contacts = new ArrayList<>();
//                Arrays.asList(
//                new Contact("Pesho", "0877323884"),
//                new Contact("Gosho", "0882773121")
//        );
    }

    @GetMapping("/")
    public ModelAndView getAll(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("contacts", this.contacts);

        return modelAndView;
    }

    @PostMapping("/")
    public String save(Contact contact, @RequestParam("picture")MultipartFile picture) {
        this.contacts.add(contact);
        return "redirect:/";
    }
}
