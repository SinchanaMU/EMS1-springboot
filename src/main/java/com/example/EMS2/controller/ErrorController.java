package com.example.EMS2.controller;


	import org.springframework.web.bind.annotation.ControllerAdvice;
	import org.springframework.web.bind.annotation.ExceptionHandler;
	import org.springframework.web.bind.annotation.ResponseBody;

	@ControllerAdvice
	public class ErrorController {

		@ResponseBody
		@ExceptionHandler(Exception.class)
		public String handle(Exception exception) {
			exception.printStackTrace();
			return "Handled";
		}

	}