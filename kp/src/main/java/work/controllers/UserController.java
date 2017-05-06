package work.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import work.PieChart_AWT;
import work.entity.*;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import work.entity.VetService;
import work.service.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    public UserController() {
        System.out.println("UserController()");
    }

    @Autowired
    private UserService userService;

    @Autowired
    private AdService adService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private BDserviceManage bdservice;

    @Autowired
    private work.service.VetService service;

    @RequestMapping("createUser")
    public ModelAndView createUser(@ModelAttribute User user) {
        logger.info("Creating User. Data: "+user);
        return new ModelAndView("usersForm");
    }

    @RequestMapping("table")
    public ModelAndView table() {
        logger.info("Table opened");

        List<Bdservice> servList = bdservice.getAllBDServices();
        return new ModelAndView("table", "servList", servList);
    }

    @RequestMapping("toAddService")
    public ModelAndView add() {
        List<Bdservice> servList = bdservice.getAllBDServices();
        return new ModelAndView("toAddService", "servList", servList);
    }

    @RequestMapping("autorization")
    public ModelAndView autorization() {
        logger.info("autorization page");
        return new ModelAndView("autorization");
    }

    @RequestMapping("service")
    public ModelAndView service() {
        logger.info("service page");
        return new ModelAndView("service");
    }

    @RequestMapping("refuseService/{idService}")
    public ModelAndView cancel(@PathVariable("idService") int idService, Principal principal) {
        service.deleteService(idService);
        List<VetService> services = service.getAllServices(principal.getName());
        return new ModelAndView("ownPage", "services", services);
    }

    @RequestMapping("makeChoice/{name}")
    public ModelAndView makeChoice(@PathVariable("name") String name) {
        logger.info("service page");
System.out.println(name);
        Bdservice servList = bdservice.getBDService(name);
        return new ModelAndView("submitOrder", "servList", servList);
    }

    @RequestMapping("/allServices")
    public ModelAndView allServices() {
        List<Bdservice> servList = bdservice.getAllBDServices();
        return new ModelAndView("allServices", "servList", servList);
    }

    @RequestMapping("makeSale/{name}")
    public ModelAndView makeSale(@PathVariable("name") String name) {
        logger.info("service page");

        Bdservice serv = bdservice.getBDService(name);
        serv.setSale(15);
        bdservice.updateService(serv);
        List<VetService> vs=service.getAllServices();
        for(VetService s:vs) {
            if (s.getName().equals(serv.getName())) {
                s.setCost(s.getCost()-((s.getCost()*15)/100));
                service.updateService(s);
            }
        }

        List<Bdservice> servList=bdservice.getAllBDServices();
        return new ModelAndView("allServices", "servList", servList);
    }



    @RequestMapping("deleteService/{idService}")
    public ModelAndView deleteService(@PathVariable("idService") int idService) {
        logger.info("service page");
        service.deleteService(idService);
        List<VetService> services = service.getAllServices();
        return new ModelAndView("adminInfo", "services", services);
    }

    @RequestMapping("acceptService/{idService}")
    public ModelAndView acceptService(@PathVariable("idService") int idService) {
        logger.info("service page");

        VetService vs = new VetService();
        vs=service.getService(idService);
        vs.setIdDoctor(-1);
        service.updateService(vs);
        List<Doctor> doctors = doctorService.getAllDoctor();
        System.out.println(doctors.get(0).getIdDoctor());
        return new ModelAndView("doctors", "doctors", doctors);
    }

    @RequestMapping("doctorChoice/{idDoctor}")
    public ModelAndView doctorChoice(@PathVariable("idDoctor") int idDoctor) {
        logger.info("service page");

        List<VetService> rs = service.getAllServices();
        for (VetService s:rs) {
            if (s.getIdDoctor()==-1) {
                s.setIdDoctor(idDoctor);
                service.updateService(s);
            }
        }
        List<VetService> services = service.getAllServices();
        return new ModelAndView("adminInfo", "services", services);
    }

    @RequestMapping(value = {"makeSale/index","deleteService/index","makeChoice/index", "makeChoice/submitOrder/index",
            "answer/index", "answer/submitAnswer/index", "refuseService/index"})
    public ModelAndView redirect() {
        return new ModelAndView("redirect:/index");
    }

    @RequestMapping("makeChoice/submitOrder/{name}")
    public ModelAndView submitOrder(@PathVariable("name") String name, @ModelAttribute work.entity.VetService dateInput,
                                    Principal principal) {
        logger.info("New order");

        VetService newService = new VetService();
        newService.setDate(dateInput.getDate());
        newService.setLogin(principal.getName());

        Bdservice serv = bdservice.getBDService(name);
        newService.setName(name);
        newService.setCost(serv.getCost());
        newService.setIdDoctor(0);

        service.createService(newService);
        List<VetService> services = service.getAllServices(principal.getName());
        return new ModelAndView("ownPage", "services", services);
    }

    @RequestMapping("registration")
    public ModelAndView registration() {
        logger.info("registration");
        return new ModelAndView("registration");
    }

    @RequestMapping("question")
    public ModelAndView question() {
        logger.info("question");
        return new ModelAndView("question");
    }

    @RequestMapping("ad")
    public ModelAndView ad() {
        logger.info("ad");
        return new ModelAndView("ad");
    }

    @RequestMapping("tableAd")
    public ModelAndView tableAd() {
        logger.info("tableAd");

        List<Ad> adList = adService.getAllAds();
        return new ModelAndView("tableAd", "adList", adList);
    }

    @RequestMapping("tableQuestion")
    public ModelAndView tableQuestion() {
        logger.info("tableQuestion");

        List<Question> question = questionService.getAllQuestions();
        List<Question> questionList = new ArrayList<>();
        for(Question q:question) {
            if (q.getStatus()!=0) questionList.add(q);
        }
        return new ModelAndView("tableQuestion", "questionList", questionList);

    }

    @RequestMapping("index")
    public ModelAndView index() {
        logger.info("index");
        return new ModelAndView("index");
    }

    @RequestMapping("searchService")
    public ModelAndView searchService(@RequestParam("searchName") String searchName) {
        logger.info("Searching the Service. Search by: "+searchName);

        List<Bdservice> allList = bdservice.getAllBDServices(searchName);
        List<Bdservice> servList=new ArrayList<Bdservice>();

        for (Bdservice bd:allList) {
            if (bd.getName().contains(searchName.toLowerCase())) servList.add(bd);
        }
        if (servList.isEmpty()) servList=allList;
        return new ModelAndView("table", "servList", servList);
    }


    @RequestMapping("searchServicetoAdd")
    public ModelAndView searchToAdd(@RequestParam("searchName") String searchName) {
        logger.info("Searching the Service to add. Search by: "+searchName);

        List<Bdservice> list = bdservice.getAllBDServices(searchName);
        List<Bdservice> servList=new ArrayList<Bdservice>();

        for (Bdservice bd:list) {
            if (bd.getName().contains(searchName.toLowerCase())) servList.add(bd);
        }
        if (servList.isEmpty()) servList=list;
        return new ModelAndView("toAddService", "servList", servList);
    }

    @RequestMapping("searchServicetoAddtoBD")
    public ModelAndView searchToAddtoBD(@RequestParam("searchName") String searchName) {
        logger.info("Searching the Service to add. Search by: "+searchName);

        List<Bdservice> list = bdservice.getAllBDServices(searchName);
        List<Bdservice> servList=new ArrayList<Bdservice>();

        for (Bdservice bd:list) {
            if (bd.getName().contains(searchName.toLowerCase())) servList.add(bd);
        }
        if (servList.isEmpty()) servList=list;
        return new ModelAndView("allServices", "servList", servList);
    }

    @RequestMapping("saveUser")
    public ModelAndView saveUser(@ModelAttribute("user") User user, @ModelAttribute("userInfo") UserInfo userInfo) {
        logger.info("Saving the User. Data : "+user);
        user.setId_role(2);
        userInfo.setLogin(user.getLogin());
        userService.createUser(user);
        userInfoService.createUserInfo(userInfo);

        List<VetService> services = service.getAllServices(user.getLogin());
        return new ModelAndView("ownPage", "services", services);
    }

    @RequestMapping("saveAd")
    public ModelAndView saveAd(@ModelAttribute("newAd") Ad newAd, Principal principal) {
        UserInfo user = userInfoService.getUserInfo(principal.getName());
        newAd.setEmail(user.getEmail());
        newAd.setLogin(user.getLogin());
        java.util.Date d = new java.util.Date();
        newAd.setStartDay(new java.sql.Date(d.getTime()));
        adService.createAd(newAd);

        List<VetService> services = service.getAllServices(user.getLogin());
        return new ModelAndView("ownPage", "services", services);
    }

    @RequestMapping("answer/submitAnswer/{idQuestion}")
    public ModelAndView submitAnswer(@PathVariable("idQuestion") Integer idQuestion, @ModelAttribute("que") Question que) {
        List<Question> q = questionService.getAllQuestions();
        for (Question qs:q){
            if (qs.getIdQuestion()==idQuestion) {
                qs.setAnswer(que.getAnswer());
                qs.setStatus(1);
                questionService.updateQuestion(qs);
                break;
            }
        }
        List<Question> queList = questionService.getAllQuestions();
        return new ModelAndView("questionManage", "queList", queList);
    }

    @RequestMapping("answer/{idQuestion}")
    public ModelAndView answer(@PathVariable("idQuestion") Integer idQuestion) {
        List<Question> q = questionService.getAllQuestions();
        Question queList = new Question();
        for (Question qs:q){
            if (qs.getIdQuestion()==idQuestion) {
                queList=qs;
                break;
            }
        }
        return new ModelAndView("answerForQuestion", "queList", queList);
    }

    @RequestMapping("questionManage")
    public ModelAndView questionManage() {
        List<Question> queList = questionService.getAllQuestions();
        return new ModelAndView("questionManage", "queList", queList);
    }

    @RequestMapping("saveBDService")
    public ModelAndView saveBDService(@ModelAttribute("bdService") Bdservice bd) {
        bd.setSale(0);
        bdservice.createBDService(bd);

        List<Bdservice> servList = bdservice.getAllBDServices();
        return new ModelAndView("allServices", "servList", servList);
    }

    @RequestMapping("ownPage")
    public ModelAndView ownPage(Model model, Principal principal) {
        logger.info("ownPage");
        List<VetService> services = service.getAllServices(principal.getName());
        return new ModelAndView("ownPage", "services", services);
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            model.addAttribute("message", "Hi, " + principal.getName()
                    + "!<br> Произошла ошибка доступа. <br> Вернитесь на главную страницу и авторизуйтесь  " +
                     "<br>через вкладку \"Личный кабинет\" :)");
        } else {
            model.addAttribute("msg",
                    "<br> Произошла ошибка доступа. <br> Вернитесь на главную страницу и авторизуйтесь  " +
                            "<br>через вкладку \"Личный кабинет\" :)");
        }
        return "403";
    }

    @RequestMapping("/")
    public ModelAndView welcome() {
        logger.info("Welcome Page.");
        return new ModelAndView("index");
    }

    @RequestMapping("/page-not-found")
    public ModelAndView error404() {
        logger.info("Admin Page.");
        return new ModelAndView("page-not-found");
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model ) {
        return "autorization";
    }

    @RequestMapping(value = "/adminInfo", method = RequestMethod.GET)
    public ModelAndView adminPage(Model model) throws IOException {
        PieChart_AWT pie = new PieChart_AWT();
        List<VetService> services = service.getAllServices();
        return new ModelAndView("adminInfo", "services", services);
    }

    @RequestMapping("getAllUsers")
    public ModelAndView getAllUsers() {
        logger.info("Getting the all Users.");
        List<User> userList = userService.getAllUsers();
        return new ModelAndView("userList", "userList", userList);
    }

    @RequestMapping("bdServiceForm")
    public ModelAndView bdServiceForm() {
        logger.info("bdServiceForm");
        return new ModelAndView("bdServiceForm");
    }
}
