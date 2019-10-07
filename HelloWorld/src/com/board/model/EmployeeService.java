package com.board.model;

import java.util.List;

public interface EmployeeService {
	//전체 리스트
	public List<Employee> getEmpList();
	//한건 조회
	public Employee getEmployee(int empNo);
	//한건 입력
	public void insertEmployee(Employee emp);
	
	//셀러리 필드 수정/변경처리
	public void updateEmployee(Employee emp);
	//삭제
	public void deleteEmployee(int empNo);
	
}
