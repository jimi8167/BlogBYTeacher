package com.cos.blog.model.user.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqLoginDto {
	
	@Pattern(regexp = "^[a-zA-Z0-9]*$", message = "유저네임에 한글이 입력될 수 없습니다.")
	@Size(max=15, message = "유저네임의 길이가 잘못되었습니다.")
	@NotBlank(message = "유저네임을 입력하세요.")
	private String username;
	
	@Size(max=15, message = "패스워드의 길이가 잘못되었습니다.")
	@NotBlank(message = "패스워드를 입력하세요.")
	private String password;

}
