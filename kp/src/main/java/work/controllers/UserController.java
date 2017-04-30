package work.controllers;

import org.springframework.stereotype.Controller;
import work.entity.User;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import work.service.UserService;

import java.util.List;

@Controller
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    public UserController() {
        System.out.println("UserController()");
    }

    @Autowired
    private UserService userService;

    @RequestMapping("createUser")
    public ModelAndView createUser(@ModelAttribute User user) {
        logger.info("Creating User. Data: "+user);
        return new ModelAndView("usersForm");
    }

    @RequestMapping("table")
    public ModelAndView table(@ModelAttribute User user) {
        logger.info("Table opened");
        return new ModelAndView("table");
    }

    @RequestMapping("saveUser")
    public ModelAndView saveUser(@ModelAttribute User user) {
        logger.info("Saving the User. Data : "+user);
        userService.createUser(user);

        return new ModelAndView("redirect:getAllUsers");
    }

    @RequestMapping("/")
    public ModelAndView welcome() {
        logger.info("Welcome Page.");
        return new ModelAndView("index");
    }

    @RequestMapping("getAllUsers")
    public ModelAndView getAllUsers() {
        logger.info("Getting the all Users.");
        List<User> userList = userService.getAllUsers();
        return new ModelAndView("userList", "userList", userList);
    }
}
