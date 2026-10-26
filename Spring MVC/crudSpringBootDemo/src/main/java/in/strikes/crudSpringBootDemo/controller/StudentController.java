package in.strikes.crudSpringBootDemo.controller;

import in.strikes.crudSpringBootDemo.dto.CreateStudentRequestDto;
import in.strikes.crudSpringBootDemo.dto.CreateStudentResponseDto;
import in.strikes.crudSpringBootDemo.dto.UpdateStudentRequestDto;
import in.strikes.crudSpringBootDemo.dto.UpdateStudentResponseDto;
import in.strikes.crudSpringBootDemo.entity.Student;
import in.strikes.crudSpringBootDemo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// validation -> spring-boot-starter-validation

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping()
    public ResponseEntity<CreateStudentResponseDto> createStudent(@Valid @RequestBody CreateStudentRequestDto createStudentRequestDto){
        CreateStudentResponseDto createdStudent = studentService.createStudent(createStudentRequestDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdStudent);

    }

    // read one student
    @GetMapping("{id}")
    public ResponseEntity<CreateStudentResponseDto> getStudent(@PathVariable Long id){
        CreateStudentResponseDto studentResp = studentService.getStudent(id);
        return ResponseEntity.ok(studentResp);
    }

    // getAll students
    @GetMapping
    public ResponseEntity<List<CreateStudentResponseDto>> getAllStudent(){
        List<CreateStudentResponseDto> studetList = studentService.getAllStudents();
        return ResponseEntity.ok(studetList);
    }

    // update student
    @PutMapping
    public ResponseEntity<UpdateStudentResponseDto> updateStudent(@RequestParam Long id,
                                                 @RequestBody UpdateStudentRequestDto studentReq){
        UpdateStudentResponseDto studentResp = studentService.updateStudent(id, studentReq);
        return ResponseEntity.ok(studentResp);
    }

    // delete student
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    // delete softly
    @PatchMapping("/delete-soft/{id}")
    public ResponseEntity<String> deleteStudentSoftly(@PathVariable Long id){
        studentService.deleteStudentSoftly(id);
        return ResponseEntity.ok("Record deleted softly");

    }
}
