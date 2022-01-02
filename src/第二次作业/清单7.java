package 第二次作业;

public class 清单7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes % 60;
        long currentHour = totalHours % 24;
        System.out.println("Currrent time is " + currentHour + ":" 
        		+ currentMinute + ":" + currentSecond + " GMT");
	}
}
