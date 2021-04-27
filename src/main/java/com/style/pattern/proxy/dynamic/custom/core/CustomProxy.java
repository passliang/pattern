package com.style.pattern.proxy.dynamic.custom.core;


import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

/**
 * @author leon
 * @date 2021-04-26 10:13:32
 */
public class CustomProxy {

	private static final String LN = "\n";

	private CustomInvocationHandler handler;

	public static Object newProxyInstance(CustomClassLoader loader,
	                                      Class<?>[] interfaces,
	                                      CustomInvocationHandler handler)
			throws Exception {
		//生成java 文件
		String generateClass = generateClass(interfaces);
		//写入磁盘
		String path = CustomProxy.class.getResource("").getPath();
		String filePath = path + "$Proxy0.java";
		File file = new File(filePath);
		FileWriter fw = new FileWriter(file);
		fw.write(generateClass);
		fw.flush();
		fw.close();
		//编译java 文件
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager standardFileManager = compiler.getStandardFileManager(null, null, Charset.defaultCharset());
		Iterable<? extends JavaFileObject> javaFileObjects = standardFileManager.getJavaFileObjects(file);
		JavaCompiler.CompilationTask task = compiler.getTask(null, standardFileManager, null, null, null, javaFileObjects);
		task.call();
		standardFileManager.close();
		//classLoader 加载
		Class<?> clazz = loader.findClass("$Proxy0");
		Constructor<?> constructor = clazz.getConstructor(CustomInvocationHandler.class);
		return constructor.newInstance(handler);
	}

	private static String generateClass(Class<?>[] interfaces) {

		StringBuilder sb = new StringBuilder();
		sb.append("package com.style.pattern.proxy.dynamic.custom.core;" + LN);
		sb.append("import java.lang.reflect.*;" + LN);
		sb.append("import com.style.pattern.proxy.IPerson;" + LN);
		sb.append("public class " + "$Proxy0 implements ")
				.append(interfaces[0].getSimpleName())
				.append(" { ").append(LN);
		sb.append("private CustomInvocationHandler handler;" + LN);
		sb.append("public $Proxy0(CustomInvocationHandler handler) { " + LN);
		sb.append("this.handler = handler ;");
		sb.append("}" + LN);


		Method[] methods = interfaces[0].getMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			Class<?> returnType = method.getReturnType();
			String simpleName = returnType.getSimpleName();
			Class<?>[] params = method.getParameterTypes();
			StringBuilder paramNames = new StringBuilder();
			StringBuilder paramValues = new StringBuilder();
			StringBuilder paramClasses = new StringBuilder();

			for (int i = 0; i < params.length; i++) {
				Class<?> clazz = params[i];
				String type = clazz.getName();
				String paramName = lowFirstLetter(clazz.getSimpleName());
				paramNames.append(type).append(" ").append(paramName);
				paramValues.append(paramName);
				paramClasses.append(clazz.getName()).append(".class");
				if (i != params.length - 1) {
					paramNames.append(",");
					paramClasses.append(",");
					paramValues.append(",");
				}
			}

			sb.append("public ")
					.append(simpleName)
					.append(" ")
					.append(method.getName())
					.append("(")
					.append(paramNames.toString())
					.append("){")
					.append(LN);
			sb.append("try{" + LN);

			String interfaceClassName = interfaces[0].getName();
			sb.append("Method m = ").append(interfaceClassName).append(".class.getMethod(\"").append(methodName).append("\",new Class[]{").append(paramClasses.toString()).append("});").append(LN);
			if (hashReturn(returnType)) {
				sb.append(" return ");
			}
			sb.append("this.handler.invoke(this,m,new Object[]{").append(paramValues).append("});").append(LN);

//			sb.append( getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",m.getReturnType()) + ";" + ln);


			sb.append("} catch(Exception e){" + LN);
			sb.append("  e.printStackTrace();" + LN);
			sb.append("}catch(Throwable e){" + LN);
			sb.append("throw new UndeclaredThrowableException(e);" + LN);
			sb.append("}");
			sb.append("}");
		}

		sb.append("}");
		return sb.toString();
	}

	public static boolean hashReturn(Class<?> clazz) {
		return clazz != void.class;
	}

	public static String getParameters(Class<?>[] params) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < params.length; i++) {
			Class<?> clazz = params[i];
			sb.append(clazz.getSimpleName()).append(" ").append(lowFirstLetter(clazz.getSimpleName()));
			if ((params.length - 1) != i) {
				sb.append(",");
			}
		}

		return sb.toString();
	}

	public static String lowFirstLetter(String letter) {
		char[] chars = letter.toCharArray();
		chars[0] += 32;
		return new String(chars);
	}

	static class Test implements Ha {
		@Override
		public String setName(String name) {
			return name;
		}

		@Override
		public String setNameAndSex(String name, Integer sex) {
			return name + sex;
		}
	}

	public static void main(String[] args) {
		Class<?>[] interfaces = Test.class.getInterfaces();
		Class<?> anInterface = interfaces[0];
		Method[] methods = anInterface.getMethods();
		for (Method method : methods) {
			String name = method.getName();
			System.out.println("name:" + name);
			Class<?> returnType = method.getReturnType();
			System.out.println("returnType:" + returnType.getSimpleName());
			Class<?>[] parameterTypes = method.getParameterTypes();
			String parameters = getParameters(parameterTypes);
			System.out.println("parameters: " + parameters);
			try {
				method.invoke(null, null);
			} catch (IllegalAccessException | InvocationTargetException e) {
				e.printStackTrace();
			}
			;
		}
	}
}
