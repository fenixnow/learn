package ak.learn.mappers;

import ak.learn.Entities.UserEntity;
import ak.learn.dtos.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserDto toUserDto(Optional<UserEntity> userEntity);
}
