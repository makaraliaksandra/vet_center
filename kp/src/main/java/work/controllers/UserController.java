package work.controllers;

import work.entity.User;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import work.service.UserService;

import java.util.List;


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
        return new ModelAndView("userForm");
    }

    @RequestMapping("saveUser")
    public ModelAndView saveUser(@ModelAttribute User user) {
        logger.info("Saving the User. Data : "+user);
        if(user.getIdRole() == 0){ // if employee id is 0 then creating the employee other updating the employee
            userService.createUser(user);
        } else {
            //employeeService.updateUser(employee);
        }
        return new ModelAndView("redirect:getAllEmployees");
    }

    @RequestMapping(value = {"getAllUsers", "/"})
    public ModelAndView getAllUsers() {
        logger.info("Getting the all Users.");
        List<User> userList = userService.getAllUsers("");
        return new ModelAndView("userList", "userList", userList);
    }
}
