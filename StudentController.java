package MainPackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import MainPackage.Service.StudentService;
import MainPackage.modle.Students;

@Controller
public class StudentController {

	@Autowired  
	private StudentService theService;
	@GetMapping("/saveStudents")
	public String getStudentPage(@ModelAttribute("student") Students theStudent,Model model) {
		
		return "addStudent";
	}
	
	@PostMapping("/saveStudents")
	public String addStudents(@ModelAttribute("student") Students theStudent,Model model) {
		
		theService.saveStudent(theStudent);
		model.addAttribute("message", "Student Succesfull Registred");
		return "addStudent";
	}
	
	@GetMapping("/updateStudents")
	public String getUpdatePage(@ModelAttribute("student") Students theStudent,Model model) {
		
		return "updateStudent";
	}
	
	@PostMapping("/updateStudents")
	public String updateStudents(@ModelAttribute("student") Students theStudent,Model model) {
		
		 try {
			 theService.saveStudent(theStudent);
				model.addAttribute("message", "Student Updated Succesfull ");
				return "updateStudent";
		 }catch(Exception ex) {
			 model.addAttribute("message", "Student Updated Succesfull ");
			 return "ErrorPage";
		 }
	}
	
	@GetMapping("/deleteStudents")
	public String getDeletePage(@ModelAttribute("student") Students theStudent,Model model) {
		
		return "deleteStudent";
	}
	
	@PostMapping("/deleteStudents")
	public String deleteStudents(@ModelAttribute("student") Students theStudent,Model model) {
		
		 try {
			 theService.deleteStudent(theStudent);
				model.addAttribute("message", "Student Deleetd Succesfull ");
				return "deleteStudent";
		 }catch(Exception ex) {
			 model.addAttribute("message", "Student Updated Succesfull ");
			 return "ErrorPage";
		 }
	}
}
