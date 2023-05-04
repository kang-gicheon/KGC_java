package ch16.sec02.exam02;

public class Button {

	@FunctionalInterface
	public static interface ClickListener {
		
		void onClick();
	}
	
	// 필드
	
	private ClickListener ClickListener;

	
	
	// 메소드
	
	public void setClickListener(ClickListener clickListener) {
		ClickListener = clickListener;
	}
	
	public void Click() {
		
		this.ClickListener.onClick();
		
	}
	
}
