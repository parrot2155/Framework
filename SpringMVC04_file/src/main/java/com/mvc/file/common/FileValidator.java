package com.mvc.file.common;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class FileValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		//validator 사용 가능한지 확인 메소드
		return UploadFile.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UploadFile file = (UploadFile)target;
		
		if(file.getMpfile().getSize()==0) {
			errors.rejectValue("mpfile", "fileNPE", "please select a file" );
		}
		
	}

}



















