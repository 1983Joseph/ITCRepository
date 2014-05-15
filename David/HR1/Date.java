import java.io.*;

class ExceptionDate extends Exception {
	private int mYear;
	public ExceptionDate(int year) {
		mYear = year;
	}
	public int GetYear() {
		return mYear;
	}
}
class ExceptionMonth extends ExceptionDate {
	private int mMonth;
	public ExceptionMonth(int year, int month) {
		super(year);
		mMonth = month;
		
	}
	public int GetMonth() {
		return mMonth;
	}
}
class ExceptionDay extends ExceptionMonth {
	private int mDay;
	private int mMaxDay;
	public ExceptionDay(int year, int month, int day,int maxDay) {
		super(year, month);
		mDay = day;
		mMaxDay = maxDay;
	}
	public int GetDay() {
		return mDay;
	}
	public int GetMaxDay() {
		return mMaxDay;
	}
}
class Date{
	private int mDefaultYeay = 1913;
	private int mDefaultMonth = 1;
	private int mDefaultDay = 1;
	private int mDaysOfMonth = 28;
	private int mMonthsOfYear = 12;
	
	private int mYear = mDefaultYeay;
	private int mMonth = mDefaultMonth;
	private int mDay = mDefaultDay;
	
	private boolean CheckIsYearValid(int year) {
		if(year > 1913 && year <2006) {
			return true;
		}
		return false;
	}
	private boolean CheckIsMonthValid(int month) {
		if(month >= 1 && month <= mMonthsOfYear) {
			return true;
		}
		return false;
	}

	private boolean CheckIsDayValid(int day) {
		if(day >= 1 && day <= mDaysOfMonth) {
			return true;
		}
		return false;		
	}

	
	public Date(int year, int month, int day)throws ExceptionDay, ExceptionMonth, ExceptionDate  {
		SetYear(year);
		SetMonth(month);
		SetDay(day);
	}
	public void SetYear(int year) throws ExceptionDate {
		if(CheckIsYearValid(year)) {
			mYear = year;
		} else {
			throw new ExceptionDate(year);
		}	
	}
	public void SetMonth(int month) throws ExceptionMonth {
		if(CheckIsMonthValid(month)){
			mMonth = month;
			if(mMonth == 2 && mYear % 4 == 0) {
				mDaysOfMonth = 29;
			} else if(mMonth == 2) {
				mDaysOfMonth = 28;
			} else if(mMonth % 2 == 0) {
				mDaysOfMonth = 30;
			} else {
				mDaysOfMonth = 31;
			}
			
			
		} else {
			throw new ExceptionMonth(mYear,month);
		}
	}
	public void SetDay(int day) throws ExceptionDay {
		if(CheckIsDayValid(day)) {
			mDay = day;
		} else {
			throw new ExceptionDay(mYear, mMonth, day, mDaysOfMonth);
		}
	}

	public int GetYear() {
		return mYear;
	}
	public int GetMonth() {
		return mMonth;
	}
	public int GetDay() {
		return mDay;
	}

	String ToString() {
		return Integer.toString(mYear) + "." + Integer.toString(mMonth) + "." + Integer.toString(mDay);
	}
}