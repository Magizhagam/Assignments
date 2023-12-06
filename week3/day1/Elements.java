package week3.day1;


public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebElement e = new WebElement();
		Button b = new Button();
		TextField f = new TextField();
		CheckBoxButton c = new CheckBoxButton();
		RadioButton R = new RadioButton();
		e.click();
		e.setTest("Hello World");
		b.setTest("Hello");
		b.Submit();
		f.getText();
		c.clickCheckButton();
		R.selectRadioButton();
		
		
	}

}
