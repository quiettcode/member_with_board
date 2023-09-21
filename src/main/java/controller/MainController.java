package controller;

import dto.MemberSaveDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("save")
    public String saveForm() {
        return "member/save";
    }

    @PostMapping("save")
    public String save(@ModelAttribute MemberSaveDTO memberSaveDTO) {
//        Long memberId
        return "member/login";
    }

}
