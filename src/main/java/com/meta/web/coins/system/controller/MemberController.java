package com.meta.web.coins.system.controller;


import com.meta.web.coins.system.entity.Member;
import com.meta.web.coins.system.service.IMemberService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "")
@RestController
@RequestMapping("/meta/coins/system/member")
@Slf4j
public class MemberController {

    @Resource
    IMemberService memberService;

    @GetMapping(value = "/get/member/list")
    public List<Member> memberList() {
        return memberService.findMemberList();
    }

}
