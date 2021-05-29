package vip.memberly.mapper;


import org.apache.ibatis.annotations.Mapper;
import vip.memberly.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> getAllUser();
}
