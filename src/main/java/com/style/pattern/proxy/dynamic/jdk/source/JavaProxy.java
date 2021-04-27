package com.style.pattern.proxy.dynamic.jdk.source;

import com.style.pattern.proxy.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * @author leon
 *  @date 2021-04-25 16:46:29
 */
public final class JavaProxy extends Proxy implements IPerson {

	private static final Method m1;
	private static final Method m3;
	private static final Method m2;
	private static final Method m0;

	/**
	 * Constructs a new {@code Proxy} instance from a subclass
	 * (typically, a dynamic proxy class) with the specified value
	 * for its invocation handler.
	 *
	 * @param h the invocation handler for this proxy instance
	 * @throws NullPointerException if the given invocation handler, {@code h},
	 *                              is {@code null}.
	 */
	protected JavaProxy(InvocationHandler h) {
		super(h);
	}


	@Override
	public final boolean equals(Object var1) {
		try {
			return (Boolean) super.h.invoke(this, m1, new Object[]{var1});
		} catch (RuntimeException | Error var3) {
			throw var3;
		} catch (Throwable var4) {
			throw new UndeclaredThrowableException(var4);
		}
	}

	@Override
	public final void findLove() {
		try {
			super.h.invoke(this, m3, (Object[]) null);
		} catch (RuntimeException | Error var2) {
			throw var2;
		} catch (Throwable var3) {
			throw new UndeclaredThrowableException(var3);
		}
	}

	@Override
	public final String toString() {
		try {
			return (String) super.h.invoke(this, m2, null);
		} catch (RuntimeException | Error var2) {
			throw var2;
		} catch (Throwable var3) {
			throw new UndeclaredThrowableException(var3);
		}
	}

	@Override
	public final int hashCode() {
		try {
			return (Integer) super.h.invoke(this, m0, null);
		} catch (RuntimeException | Error var2) {
			throw var2;
		} catch (Throwable var3) {
			throw new UndeclaredThrowableException(var3);
		}
	}

	static {
		try {
			m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
			m3 = Class.forName("com.style.pattern.proxy.IPerson").getMethod("findLove");
			m2 = Class.forName("java.lang.Object").getMethod("toString");
			m0 = Class.forName("java.lang.Object").getMethod("hashCode");
		} catch (NoSuchMethodException var2) {
			throw new NoSuchMethodError(var2.getMessage());
		} catch (ClassNotFoundException var3) {
			throw new NoClassDefFoundError(var3.getMessage());
		}
	}
}