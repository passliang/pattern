package com.style.pattern.chain.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leon
 * @date 2021-04-14 22:09:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private String username;
	private String password;
}
