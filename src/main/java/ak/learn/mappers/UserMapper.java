package ak.learn.mappers;

import ak.learn.Entities.UserEntity;
import ak.learn.dtos.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
    UserDto toUserDto(Optional<UserEntity> userEntity);
}
