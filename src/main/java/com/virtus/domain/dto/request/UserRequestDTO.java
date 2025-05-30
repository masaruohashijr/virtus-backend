package com.virtus.domain.dto.request;

import com.virtus.common.domain.dto.BaseRequestDTO;
import com.virtus.domain.dto.response.RoleResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO extends BaseRequestDTO {

    private String name;
    private String username;
    private String email;
    private String mobile;
    private String password;
    private RoleResponseDTO role;

}
