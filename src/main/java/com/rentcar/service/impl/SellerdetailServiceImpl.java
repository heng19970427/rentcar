package com.rentcar.service.impl;

import com.rentcar.dao.SellerMapper;
import com.rentcar.pojo.Seller;
import com.rentcar.pojo.SellerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class SellerdetailServiceImpl implements UserDetailsService{

    @Autowired
    private SellerMapper sellerMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> authorityList=new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("ROLE_SELLER"));

        SellerExample sellerExample=new SellerExample();
        SellerExample.Criteria criteria = sellerExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Seller> sellers = sellerMapper.selectByExample(sellerExample);
        Seller seller = sellers.get(0);
        if(seller!=null){
            if(seller.getStatus().equals("1")){
                return new User(username,seller.getPassword(),authorityList);
            }else {
                return null;
            }
        }else {
            return null;
        }
    }
}
