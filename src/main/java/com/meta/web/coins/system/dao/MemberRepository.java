package com.meta.web.coins.system.dao;

import com.meta.web.coins.system.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends PagingAndSortingRepository<Member, Long>,
        JpaRepository<Member, Long> {



}
