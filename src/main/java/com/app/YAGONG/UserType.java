package com.app.YAGONG;

import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserType {

	ADMIN("ADMIN"), MENTOR("MENTOR"), MENTEE("MENTEE");

	private final String code;
}
