package com.cap.empapp1.exceptions;

import java.util.Arrays;

public class WrongSalaryException extends Exception {

	@Override
	public String toString() {
		return "WrongSalaryException:"+"enter correct salary!";
	}

}
