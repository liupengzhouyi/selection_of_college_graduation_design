package cn.liupengstudy.selection_of_college_graduation_design.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentsLanding")
public class StudentsLandingContorller {

    @Autowired
    // private

    @RequestMapping("landing")
    public String landing() {
        return "";
    }

    @RequestMapping("update")
    public String changePassword() {
        return "";
    }

    @RequestMapping("add")
    public String addStudent() {
        return "";
    }

    @RequestMapping("delete")
    public String deleteStudent() {
        return "";
    }

}
