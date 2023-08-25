package ak.learn.controllers;

import ak.learn.dtos.CredentialDto;
import ak.learn.dtos.UserDto;
import ak.learn.servises.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<UserDto> user(@RequestBody CredentialDto credentialsDto) {

        UserDto userDto = userService.login(credentialsDto);
        return ResponseEntity.ok(userDto);
    }
}
