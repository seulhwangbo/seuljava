package ch10_ex05;
// hw02_!
// 최대 급여 error msg
public class MyExceptionEx0202 extends Exception {

	@Override
	public String getMessage() {
		String ErrMsg;
		ErrMsg = "사장님 1000만원 넘 많아요. 좀 적당히 합시다";
		return ErrMsg;
		// TODO Auto-generated method stub
		//return super.getMessage();
	}
}
