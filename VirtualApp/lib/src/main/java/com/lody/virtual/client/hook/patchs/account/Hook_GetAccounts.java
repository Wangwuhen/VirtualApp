package com.lody.virtual.client.hook.patchs.account;

import com.lody.virtual.client.hook.base.Hook;

import java.lang.reflect.Method;

/**
 * @author Lody
 *
 * @see android.accounts.IAccountManager#getAccounts(String, String)
 */
/* package */ class Hook_GetAccounts extends Hook<AccountManagerPatch> {
	/**
	 * 这个构造器必须有,用于依赖注入.
	 *
	 * @param patchObject
	 *            注入对象
	 */
	public Hook_GetAccounts(AccountManagerPatch patchObject) {
		super(patchObject);
	}

	@Override
	public String getName() {
		return "getAccounts";
	}

	@Override
	public Object onHook(Object who, Method method, Object... args) throws Throwable {
		return method.invoke(who, args);
	}
}
