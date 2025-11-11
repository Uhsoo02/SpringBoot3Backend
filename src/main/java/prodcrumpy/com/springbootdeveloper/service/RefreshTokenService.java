package prodcrumpy.com.springbootdeveloper.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prodcrumpy.com.springbootdeveloper.domain.RefreshToken;
import prodcrumpy.com.springbootdeveloper.repository.RefreshTokenRepository;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken){
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }

}
