package com.meta.web.coins.system.service.impl;

import com.meta.web.coins.system.dao.MemberRepository;
import com.meta.web.coins.system.entity.Member;
import com.meta.web.coins.system.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements IMemberService {

    @Resource
    private MemberRepository memberRepository;

    @Override
    public List<Member> findMemberList() {
        return memberRepository.findAll();
    }
}
