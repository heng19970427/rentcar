package com.rentcar.service.impl;

import com.rentcar.dao.PoliceMapper;
import com.rentcar.pojo.Police;
import com.rentcar.pojo.PoliceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class PolicedetailServiceImpl implements UserDetailsService{
    @Autowired
    private PoliceMapper policeMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> authorityList=new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("ROLE_POLICE"));

        PoliceExample policeExample=new PoliceExample();
        PoliceExample.Criteria criteria = policeExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Police> policeList = policeMapper.selectByExample(policeExample);
        if(policeList!=null){
            if(policeList.get(0)!=null){
                return new User(username,policeList.get(0).getPassword(),authorityList);
            }else {
                return null;
            }
        }else {
            return null;
        }
    }
}
