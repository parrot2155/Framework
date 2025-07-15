package com.mvc.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mvc.file.common.FileValidator;
import com.mvc.file.common.UploadFile;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private FileValidator FileValidator;

	@RequestMapping("/form")
	public String getUploadForm() {
		logger.info("UPLOAD FORM");
		return "uploadForm";
	}
	
	@RequestMapping("/upload")
	public String fileUpload(UploadFile uploadFile, BindingResult result, Model model) {
		System.out.println(uploadFile.getDesc());
		System.out.println(uploadFile.getMpfile().getOriginalFilename());
		
		//유효성 검사
		FileValidator.validate(uploadFile, result);
//		System.out.println(result.hasErrors());
		
		if(result.hasErrors()) {
			//hasErrors가 true => file의 size가 0이다.=> 업로드시 파일 선택 안했다.
			return "uploadForm";
		}
//		if(uploadFile.getMpfile().getSize()==0) {
//			return "uploadform";
//		}
		
		MultipartFile file = uploadFile.getMpfile();
		String filename = file.getOriginalFilename();
		String desc = uploadFile.getDesc();
		
		UploadFile fileobj = new UploadFile();	//응답페이지에서 출력
		fileobj.setFilename(filename);
		fileobj.setDesc(desc);
		
		 InputStream inputStream = null;
		 OutputStream outputStream = null;
		
		
		try {
			File storage = new File("C:\\storage");
			if(!storage.exists() ) {	//해당 경로 존재 여부 확인
				storage.mkdir();	//없으면 디렉토리 만들기
			}
			File newfile = new File("C:\\storage\\"+filename);
			if(!newfile.exists()) {
				newfile.createNewFile();
			}
			
			inputStream = file.getInputStream();
			outputStream = new FileOutputStream(newfile);
			
			int res = 0;
			byte[] b = new byte[(int) file.getSize()];
			
			while((res=inputStream.read(b))!=-1) {
				outputStream.write(b,0,res);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
												//컨트롤러가 파일과 적절히 연결되어있다. 바이트단위로 읽어와서 외부에다가 출력한다. 멀티파트타입
		model.addAttribute("fileobj",fileobj);
		return "uploadRes";
		
	}
	
	
	
}
