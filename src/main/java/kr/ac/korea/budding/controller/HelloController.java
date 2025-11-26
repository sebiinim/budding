package kr.ac.korea.budding.controller;

import io.swagger.v3.oas.annotations.Operation;
import kr.ac.korea.budding.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class HelloController {
    private final HelloService helloService;

    @GetMapping("/")
    @Operation(summary = "안녕하세요!!")
    public String sayHello() {
        return helloService.sayHello();
    }

    //
}
