package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// HTTP요청을 받아 응답을 하는 컴포넌트. 스프링부트가 자동으로 Bean으로 생성해준다.
@Controller
public class BoardController {
    // 게시물 목록 보여주기
    // http://localhost:8080/ 요청시 "list"라는 이름의 템플릿을 사용(포워드)하여 화면에 출력한다.
    @GetMapping("/")
    public String list(){
         return "list";
         // 컨트롤러의 메소드가 리턴하는 문자열은 템플릿 이름이다.
         // classpath(java, resource 패키지):/templates/list.html (ThymeleafProperties에서 prefix, suffix 설정)
    }
}
