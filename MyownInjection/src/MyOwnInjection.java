import java.lang.reflect.Field;

public class MyOwnInjection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class<?> clazz=Class.forName("myowninjection.Presenter");
		Object leftSize=clazz.newInstance(); //Presenter
		Field[] fields=clazz.getDeclaredFields();
		for(Field field: fields) {
			PleaseInject annotation=field.getAnnotation(PleaseInject.class);
			if(annotation !=null) {
				Class<?> type=field.getType();
				Object rightSize= type.newInstance();
				field.set(leftSize, rightSize);
				/// I have studied about the class not found exception and added to external jar files but there is no use 
				//still its showing the same kind of exception.
				
			}
			
			
		}
		System.out.println(" "+leftSize+" ");

	}

}
