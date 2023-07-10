package exam.entity;

/***
 * 3Tier 아키텍처에서 DB(객체배열) 와의 연동을 담당. 비즈니스 로직(서비스)을 처리.
 */
public class StudentEntity {
	Student[] stuArr;
	
	// 신규 데이터 저장시 배열의 위치정보, DB 관리용
	int nextArrIdx;
	
	// 신규 학정 정보 등록시, 사용할 학번.
	int stuNextNo;
	
	// 현재 DB의 가용 공간 상태
	boolean stuArrStatus = false;
	
	// 샘플 데이터의 수 => 배열에 저장시 실제 insert 되는 기준
	static int SAMPLE_DATA_COUNT = 5;
	
	// 현재 DB의 가용 공간 상태 : 여유가 있는 경우
	static boolean ARRAY_STATUS_FULL = true;
	
	// 현재 DB의 가용 공간 상태 : 여유가 없는 경우
	static boolean ARRAY_STATUS_NO_FULL = false;
	
	// 현재 DB의 가용 공간 상태 : 여유가 없는 경우의 에러
	public static int ERR_ARRAY_FULL = 2;
	
	// Controller 에서 접근하기 위한 메소드
	public Student[] getStuArr() {
		return stuArr;
	}
	
	// Controller 에서 배열에 실제 저장된 위치 정보에 접근하기 위한 메소드
	public int getNextArrIdx() {
		return nextArrIdx;
	}
	
	// StudentEntity 초기화, 객체 배열 생성.
	public int initStudentEntity(int arrLength, boolean sampleDataInsert) {
		
		// 매개변수로 받은 길이로 배열 생성.
		stuArr = new Student[arrLength];
		
		// 샘플 데이터 입력 플래그 확인. 배열의 크기가 샘플 데이터를 저장할 수 있는 길이인지 체크.
		if(sampleDataInsert && arrLength > StudentEntity.SAMPLE_DATA_COUNT) {
			// 샘플 데이터 입력
			for(int i = 0; i < StudentEntity.SAMPLE_DATA_COUNT; i++) {
				
				// Student 객체 생성.
				Student student = new Student();
				student.stuNo = i + 1;
				student.stuName = "Student" + student.stuNo;
				student.korScore = 100 - (i * 10);
				student.engScore = 100 - (i * 10);
				student.mathScore = 100 - (i * 10);
				
				stuArr[i] = student;
				
				// DB의 관리용 데이터 갱신
				nextArrIdx = i + 1;
				stuNextNo = student.stuNo + 1;
			}
			
			return arrLength;
		} else {
			return 0;
		}
		
	}
	
	// 한 건의 데이터가 저장되는 기능.
	public int insertStudent(Student stu) {
		// DB 에 저장 가능한지 확인
		if(stuArrStatus) return ERR_ARRAY_FULL;
		
		// 배열에 학생정보 저장.
		stu.setStuNo(stuNextNo);
		stu.setStuName(stu.getStuName() + stuNextNo);
		stuArr[nextArrIdx] = stu;
		
		// 다음 데이터를 위해서 DB 관리정보 갱신.
		stuNextNo += 1;
		nextArrIdx += 1;
		
		// 다음 데이터를 DB 에 저장할 수 있는 상태인지 체크.
		if (stuArr.length == nextArrIdx)
			stuArrStatus = StudentEntity.ARRAY_STATUS_FULL;
		else
			stuArrStatus = StudentEntity.ARRAY_STATUS_NO_FULL;
		
		return nextArrIdx;
	}
}
