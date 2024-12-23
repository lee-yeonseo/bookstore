package bookstore.bookstore.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message = "이름을 입력하세요!")
    private String name;

    private String street;
    private String etc;
    private String zipcode;
}
