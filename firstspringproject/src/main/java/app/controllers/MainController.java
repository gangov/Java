package app.controllers;

import app.Constants;
import app.models.UserRegisterForm;
import app.models.UserViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

import static app.Constants.SOFTUNI_URL;

@Controller
public class MainController {

    @GetMapping(SOFTUNI_URL)
    public ModelAndView index(@PathVariable("username") String username) {
        List<String> users = Arrays.asList("pesho", "gosho", "maria");
        return new ModelAndView("users")
                .addObject("model",
                        new UserViewModel(username,
                                users,
                                "Kaloyan Gangov",
                                true,
                                true)
                );
    }

    @PostMapping(SOFTUNI_URL)
    public ModelAndView index(@PathVariable String username,
                        UserRegisterForm form
                        ) {
        boolean isConfirmed = form.getPassword().equals(form.getConfirm());
        return new ModelAndView("redirect:http://google.com");
    }
}
