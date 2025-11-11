package prodcrumpy.com.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import prodcrumpy.com.springbootdeveloper.domain.User;
import prodcrumpy.com.springbootdeveloper.dto.AddUserRequest;
import prodcrumpy.com.springbootdeveloper.repository.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public long save(AddUserRequest dto){
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }

    public User findById(Long userId){
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected user"));
    }

}
