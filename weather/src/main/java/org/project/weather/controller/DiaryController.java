package org.project.weather.controller;

import org.project.weather.service.DiaryService;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
@RestController
public class DiaryController {
    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
        // import - DiaryService 라는 서비스를 주입 받아 사용.
        // 생성자: DiaryController는 생성자를 통해 DiaryService를 주입.
        // 이는 의존성 주입(DI) 방식 중 하나.
    }

    @PostMapping("/create/diary")

    void createDiary(@RequestParam @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) LocalDate date, @RequestBody String text){
        // date는 여러 형식으로 지정이 될 수 있기 때문에, Spring에 있는  @DateTimeFormat 사용.

        diaryService.createDiary(date, text);
        // /create/diary 경로로 POST 요청이 들어오면,
        // 요청 파라미터로 날짜와 텍스트를 받아서 DiaryService의 createDiary 메서드를 호출합니다.
    }
}
