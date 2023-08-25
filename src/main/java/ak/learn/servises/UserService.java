package ak.learn.servises;

import ak.learn.Entities.UserEntity;
import ak.learn.dtos.CredentialDto;
import ak.learn.dtos.UserDto;
import ak.learn.mappers.UserMapper;
import ak.learn.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto login(CredentialDto credentialDto) {
        Optional<UserEntity> userEntity = userRepository.findByLogin(credentialDto.login());
        return UserMapper.MAPPER.toUserDto(userEntity);
    }
}
