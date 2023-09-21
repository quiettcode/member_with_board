package controller;

import dto.MemberSaveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import service.MemberService;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MemberService ms;

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
        Long memberId = ms.save(memberSaveDTO);
        return "member/login";
    }

}
