public class HelloWorld {
	private String language;

	public HelloWorld(){
		this.language="";
		System.out.println("new instance!");
	}

	public HelloWorld(String language) {
        this.language=language;
    }

	public void hello(){
		if(language.equals("english")) {
			System.out.println("hello world!");
		}else if(language.equals("korean")) {
			System.out.println("안녕 세계!");
		}else{
			System.out.println("No Language!");
		}
	}

	public void setLanguage(String language) {
		this.language=language;
	}

}



