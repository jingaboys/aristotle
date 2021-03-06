package com.aristotle.core.persistance.repo;

import java.util.List;

import com.aristotle.core.persistance.GoogleAccount;

public interface GoogleAccountDao {

	public abstract GoogleAccount saveGoogleAccount(
			GoogleAccount googleAccount);

	public abstract GoogleAccount getGoogleAccountById(Long id);

	public abstract GoogleAccount getGoogleAccountByUserId(Long userId);

	public abstract GoogleAccount getGoogleAccountByGoogleId(String googleId);

	public abstract List<GoogleAccount> getGoogleAccountsAfterId(
			Long lastId, int pageSize);

}