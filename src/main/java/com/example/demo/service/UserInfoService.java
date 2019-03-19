package com.example.demo.service;


import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserInfoExample;
import com.example.demo.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(rollbackFor=Exception.class)
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public  List<UserInfo> searchUserByUserName(String userName ) {

        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserNameLike( '%'+ userName +'%' ); // 设置模糊搜索的条件

        String orderByClause = "user_name DESC";
        userInfoExample.setOrderByClause(orderByClause);  // 设置通过某个字段排序的条件
        System.out.println(userInfoMapper.selectByExample(userInfoExample));
        return userInfoMapper.selectByExample( userInfoExample );
    }

    public List<UserInfo> multiConditionsSearch( UserInfo userInfo ) {

        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();

        if( !"".equals(userInfo.getPhone()) )
            criteria.andPhoneEqualTo( userInfo.getPhone() );
        if( !"".equals(userInfo.getUserName()) )
            criteria.andUserNameEqualTo( userInfo.getUserName() );

        return userInfoMapper.selectByExample( userInfoExample );
    }


}
