package com.egovboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler
    public String ExceptionHandler(Exception e) {
        e.printStackTrace();
        return "redirect:/error";
    }

    /* 현재 모든 예외를 핸들링하고 있음 핸들러 어노테이션 속성으로 지정도 가능
     * 특정 패키지같은경우 상단 컨트롤러어드바이스 속성으로 지정하기
     * 다양한 에러코드는 enum으로 세팅하고 익셉션 커스텀도 가능
     * ResponseBody 속성으로 값을 리턴하고 싶다면
     * ControllerAdvice -> RestControllerAdvice 로 어노테이션을 수정할것
     * 이 경우 각각의 예외처리에 클라이언트가 보고 있는 뷰에 특정 메세지를 던질 때 보통 사용함
     * 특정 뷰로 리턴시킬경우는 현재 어노테이션 사용
     * */
}
